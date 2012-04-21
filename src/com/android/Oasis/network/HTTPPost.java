package com.android.Oasis.network;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;


import android.util.Log;

public class HTTPPost {
	
	HttpClient httpClient;
	HttpContext localContext;
	HttpPost httpPost;
	
	MultipartEntity entity;
	
	public HTTPPost(String url) {
	    httpClient = new DefaultHttpClient();
	    localContext = new BasicHttpContext();
	    httpPost = new HttpPost(url);

	    entity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE);
	}
	
	public void addString(String key, String value) throws UnsupportedEncodingException {
		entity.addPart(key, new StringBody(value,Charset.forName("UTF-8")));
	}

	public void addInt(String key, int value) throws UnsupportedEncodingException {
		addString(key,""+value);
	}
	
	public void addByte(String key, byte[] value, String fileName) {
		entity.addPart(key, new ByteArrayBody(value, fileName));
	}
	
	public void addByte(String key, byte[] value) {
		addByte(key, value, "FilenameUnknown");
	}
	
	public void addFile(String key, File value) {
		entity.addPart(key, new FileBody(value));
	}
	public HttpResponse send() {
		
		httpPost.setEntity(entity);
        HttpResponse response = null;
        
		try {
			Log.d("TimeTuning", "Send Post...");
			response = httpClient.execute(httpPost, localContext);
			Log.d("TimeTuning", "Send Post Done");
		} catch (Exception e) {
			Log.d("Post", "Error: " + e.toString());
			e.printStackTrace();
		}
		
        return response;
	}
	
	public static String getResponseString(HttpResponse response) {
		String res = null;
		if(response.getStatusLine().getStatusCode()==200) {   
        	try {
				res = EntityUtils.toString(response.getEntity());
			} catch (Exception e) {
				Log.d("Post", "Error: " + e);
				e.printStackTrace();
			}
        }
		return res;
	}	
	
	
}
