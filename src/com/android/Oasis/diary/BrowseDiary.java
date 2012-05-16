package com.android.Oasis.diary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.Oasis.LoginButton;
import com.android.Oasis.Main;
import com.android.Oasis.MySQLite;
import com.android.Oasis.R;
import com.android.Oasis.SessionEvents;
import com.android.Oasis.SessionEvents.AuthListener;
import com.android.Oasis.SessionEvents.LogoutListener;
import com.android.Oasis.SessionStore;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;

public class BrowseDiary extends Activity {

	public static final String APP_ID = "285141848231182";
	private Facebook mFacebook;
	private AsyncFacebookRunner mAsyncRunner;
	private LoginButton mLoginButton;

	String diaryText = "";
	int id = 0;

	Bitmap img = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browsediary);

		mLoginButton = (LoginButton) findViewById(R.id.login);
		mLoginButton.setImageResource(R.drawable.diary_btn_share);

		mFacebook = new Facebook(APP_ID);
		mAsyncRunner = new AsyncFacebookRunner(mFacebook);

		SessionStore.restore(mFacebook, this);
		SessionEvents.addAuthListener(new AuthListener() {
			@Override
			public void onAuthSucceed() {
			}

			@Override
			public void onAuthFail(String error) {
			}
		});
		SessionEvents.addLogoutListener(new LogoutListener() {
			@Override
			public void onLogoutBegin() {
			}

			@Override
			public void onLogoutFinish() {
			}
		});
		mLoginButton.init(this, mFacebook, 2);

		ImageView myImageView = (ImageView) findViewById(R.id.browsediary_img);
		LinearLayout ll = (LinearLayout) findViewById(R.id.browsediary_ll);
		ContentResolver vContentResolver = getContentResolver();

		Bundle bundle;
		bundle = this.getIntent().getExtras();
		boolean isMine = bundle.getBoolean("ismine");
		String userName = bundle.getString("username");
		final String userId = bundle.getString("userid");

		if (isMine) {
			Uri path = Uri.parse(bundle.getString("path"));
			id = bundle.getInt("db_id");
			diaryText = bundle.getString("content");
			try {
				img = BitmapFactory.decodeStream(vContentResolver
						.openInputStream(path));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else{
			URL url;
			try {
				url = new URL(bundle.getString("path"));
				HttpURLConnection con = (HttpURLConnection) url
						.openConnection();
				InputStream is = con.getInputStream();
				img = BitmapFactory.decodeStream(is);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		myImageView.setAdjustViewBounds(true);
		myImageView.setImageBitmap(img);

		
		LinearLayout ll_mine = (LinearLayout) findViewById(R.id.browsediary_ll_mine);
		LinearLayout ll_others = (LinearLayout) findViewById(R.id.browsediary_ll_others);

		if (isMine == true) {
			ll_mine.setVisibility(View.VISIBLE);
			ll_others.setVisibility(View.GONE);
		} else {
			ll_mine.setVisibility(View.GONE);
			ll_others.setVisibility(View.VISIBLE);
			TextView tv_name = (TextView)findViewById(R.id.diary_tv_username);
			tv_name.setText(userName);
			tv_name.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View v) {
					Uri uri = Uri.parse("http://www.facebook.com/"+userId);
					Intent intent = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(intent);
				}
				
			});
		}
		
		ImageButton btn_delete = (ImageButton) findViewById(R.id.diary_btn_delete);
		btn_delete.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				MySQLite db = new MySQLite(BrowseDiary.this);
				db.delete(id);
				db.close();
				BrowseDiary.this.finish();
			}
		});

		ll.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				BrowseDiary.this.finish();
				System.gc();
			}
		});

	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		mFacebook.authorizeCallback(requestCode, resultCode, data);
	}

	public void sendPost() {
		postToWall();
		System.gc();
		BrowseDiary.this.finish();
	}

	private void postToWall() {

		final Handler handler = new Handler() {
			public void handleMessage(Message what) {
				finish();
			}
		};
		Thread thread = new Thread() {
			public void run() {
				new DiaryPoster("BrowseDiary", mFacebook).publishToWall(img,
						diaryText);
				handler.sendEmptyMessage(0);
			}
		};
		thread.start();

	}

}