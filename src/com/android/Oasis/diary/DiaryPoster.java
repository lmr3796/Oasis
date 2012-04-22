package com.android.Oasis.diary;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import org.apache.http.HttpResponse;
import org.json.JSONException;
import org.json.JSONObject;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;

import com.android.Oasis.BaseRequestListener;
import com.android.Oasis.network.HTTPPost;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Util;

public class DiaryPoster {
	private final String from;
	private final Facebook mFacebook;
	private final AsyncFacebookRunner mAsyncRunner;
	private final BaseRequestListener requestListener;
	private static final String MY_TESTING_APP_ID="390500010961729";
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
	public void publishToWall(Bitmap img, String text) {
		
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		img.compress(Bitmap.CompressFormat.PNG, 100, stream);
		byte[] byteArray = stream.toByteArray();
		
		Calendar c = Calendar.getInstance();
		String graphPath;
		String timeStamp = c.get(Calendar.MONTH)+"/"+c.get(Calendar.DATE)+"-"+
							c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
		String token = mFacebook.getAccessToken();
		HttpResponse response;
		
		graphPath = MY_TESTING_APP_ID+"/feed";
		HTTPPost post = new HTTPPost("https://graph.facebook.com/"+ graphPath + "?access_token="+token);
		try {
			post.addString("message",timeStamp);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = post.send();
		Log.e(from,"1:"+HTTPPost.getResponseString(response));
		
		
		graphPath = MY_TESTING_APP_ID+"/photos";
		HTTPPost post2 = new HTTPPost("https://graph.facebook.com/" + graphPath + "?access_token="+token);
		try {
			post2.addString("message",timeStamp);
			post2.addByte("source",byteArray);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response = post2.send();
		Log.e(from,"2:"+HTTPPost.getResponseString(response));
		
	}
}
