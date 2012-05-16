package com.android.Oasis.diary;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.graphics.Bitmap;
import android.util.Log;

import com.android.Oasis.BaseRequestListener;
import com.android.Oasis.network.HTTPPost;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Util;

public class DiaryPoster {
	private static final String TAG="DiaryPoster";
	private final String from;
	private final Facebook mFacebook;
	private final AsyncFacebookRunner mAsyncRunner;
	private final BaseRequestListener requestListener;
	private static final String OASIS_ID="362681917086995";	/* My testing app*/
	private static final String MY_TESTING_APP_ID="390500010961729";	/* My testing app*/
	private static final String MY_FIRST_APP_ID="351680818212041";	/* Mary's first app*/
	private static final String MY_TESTING_APP_PAGE_ID="lmr3796TestingApp";
	private static final String B97902049_ID="100003735938104";
	public DiaryPoster(String activityName, Facebook fb){
		from = activityName;
		mFacebook = fb;
		mAsyncRunner = new AsyncFacebookRunner(fb);
		requestListener = new BaseRequestListener(){
			@Override
			public void onComplete(final String response, final Object state) {
				try {
					// process the response here: (executed in background thread)
					Log.d(from, "Response: " + response.toString());
					JSONObject json = Util.parseJson(response);
					final String src = json.getString("src");

					// then post the processed result back to the UI thread
					// if we do not do this, an runtime exception will be generated
					// e.g. "CalledFromWrongThreadException: Only the original
					// thread that created a view hierarchy can touch its views."
					//NewDiary.this.runOnUiThread(new Runnable() {
					//   public void run() {
					//		mText.setText("Hello there, photo has been uploaded at \n" + src);
					//	}
					//});
				} catch (JSONException e) {
					Log.w(from, "JSON Error in response");
				} catch (FacebookError e) {
					Log.w(from, "Facebook Error: " + e.getMessage());
				}
			}
		};
	}
	public void publishToWall(Bitmap img, String diaryText) {
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		img.compress(Bitmap.CompressFormat.PNG, 100, stream);
		byte[] byteArray = stream.toByteArray();
		
		Calendar c = Calendar.getInstance();
		String graphPath;
		String timeStamp = (c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.DATE)+"-"+
							c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
		String token = mFacebook.getAccessToken();
		HTTPPost post;
		HttpResponse response;
		String responseStr, fbid="", photoURL="";
		JSONObject jsonResponse = new JSONObject();
		
		if(diaryText == null)
			diaryText = "";
		
		// For release
		timeStamp = "";
		
		// Upload photo
		graphPath = "me/photos";
		post = new HTTPPost("https://graph.facebook.com/" + graphPath + "?access_token="+token);
		try {
			post.addString("message",diaryText+"\n"+timeStamp);
			post.addByte("source",byteArray);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = post.send();
		responseStr = HTTPPost.getResponseString(response);
		Log.d(from,"1:"+ responseStr);
		try {
			jsonResponse = new JSONObject(responseStr);
			fbid = jsonResponse.getString("id");
			Log.d(TAG, "fbid: " + fbid);
		} catch (JSONException e){
			Log.e(TAG, "Response json error");
		} catch (NullPointerException e){
			Log.e(TAG, "NullPointerException");
			e.printStackTrace();
			return;
		}
		
		photoURL = "http://www.facebook.com/photo.php?fbid="+fbid;
		
		// Log photo id
		try{
			response = new DefaultHttpClient().execute(new HttpGet("http://lmr3796oasis.appspot.com/update?fbid="+fbid));
			Log.d(TAG, "Succeed giving fbid: "+fbid + " to GAE");
		} catch (ClientProtocolException e) {
			Log.e(TAG, "Client Protocol Exception");
			e.printStackTrace();
		} catch (IOException e){
			
		}
		
		// Get pic for thumbnail
		String thumbURL= "";
		graphPath = fbid;
		try{
			response = new DefaultHttpClient().execute(
								new HttpGet("https://graph.facebook.com/" +
												graphPath + "?access_token="+token)
								);
			responseStr = HTTPPost.getResponseString(response);
			Log.d(TAG, responseStr);
			jsonResponse = new JSONObject(responseStr);
			Log.d(TAG, jsonResponse.toString());
			JSONArray arr = jsonResponse.getJSONArray("images");
			jsonResponse = arr.getJSONObject(0);
			thumbURL = jsonResponse.getString("source");
			Log.d(TAG, "fbid: " + fbid);
		} catch (JSONException e){
			Log.e(TAG, "Response json error");
			e.printStackTrace();
		} catch (NullPointerException e){
			Log.e(TAG, "NullPointerException");
			e.printStackTrace();
			return;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// To wall
		graphPath = "me/feed";
		post = new HTTPPost("https://graph.facebook.com/" + graphPath + "?access_token="+token);
		try {
			post.addString("message",photoURL + "\n\n" + diaryText+"\n"+timeStamp);
			//post.addString("link", (thumbURL != null || !thumbURL.equals(""))? thumbURL :photoURL);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = post.send();
		responseStr = HTTPPost.getResponseString(response);
		Log.d(from,"2:"+ responseStr);
		try {
			jsonResponse = new JSONObject(responseStr);
			fbid = jsonResponse.getString("id");
			Log.d(TAG, "fbid: " + fbid);
		} catch (JSONException e){
			Log.e(TAG, "Response json error");
		} catch (NullPointerException e){
			Log.e(TAG, "NullPointerException");
			e.printStackTrace();
		}
		
		
		// To fan page
		graphPath = MY_TESTING_APP_ID+"/feed";
		post = new HTTPPost("https://graph.facebook.com/" + graphPath + "?access_token="+token);
		try {
			post.addString("message",photoURL + "\n\n" + diaryText+"\n"+timeStamp);
			//post.addString("link", (thumbURL != null || !thumbURL.equals(""))? thumbURL :photoURL);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = post.send();
		responseStr = HTTPPost.getResponseString(response);
		Log.d(from,"3:"+ responseStr);
		try{
			jsonResponse = new JSONObject(responseStr);
			fbid = jsonResponse.getString("id");
			Log.d(TAG, "fbid: " + fbid);
		} catch (JSONException e){
			Log.e(TAG, "Response json error");
		} catch (NullPointerException e){
			Log.e(TAG, "NullPointerException");
			e.printStackTrace();
		}
	
	}
}
