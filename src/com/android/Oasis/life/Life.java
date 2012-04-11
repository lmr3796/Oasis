package com.android.Oasis.life;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.android.Oasis.R;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.AsyncFacebookRunner.RequestListener;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;

public class Life extends Activity {

	Facebook facebook = new Facebook("285141848231182");
	AsyncFacebookRunner mAsyncRunner = new AsyncFacebookRunner(facebook);

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.life);

		facebook.authorize(this, new DialogListener() {
			@Override
			public void onComplete(Bundle values) {
				Life.this.finish();
			}

			@Override
			public void onFacebookError(FacebookError error) {
			}

			@Override
			public void onError(DialogError e) {
			}

			@Override
			public void onCancel() {
			}
		});

		String PAGE_ID = "108700782494847";

		mAsyncRunner.request(PAGE_ID, new RequestListener() {

			@Override
			public void onIOException(IOException e, Object state) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onFileNotFoundException(FileNotFoundException e,
					Object state) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onMalformedURLException(MalformedURLException e,
					Object state) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onFacebookError(FacebookError e, Object state) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onComplete(String response, Object state) {
				// TODO Auto-generated method stub
			}
		});

	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		facebook.authorizeCallback(requestCode, resultCode, data);
	}

}
