package com.android.Oasis.diary;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.Oasis.BaseRequestListener;
import com.android.Oasis.LoginButton;
import com.android.Oasis.MySQLite;
import com.android.Oasis.R;
import com.android.Oasis.SessionEvents;
import com.android.Oasis.SessionEvents.AuthListener;
import com.android.Oasis.SessionEvents.LogoutListener;
import com.android.Oasis.SessionStore;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Util;

public class BrowseDiary extends Activity {
	
	public static final String APP_ID = "285141848231182";
	private Facebook mFacebook;
    private AsyncFacebookRunner mAsyncRunner;
	private LoginButton mLoginButton;
	
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
        SessionEvents.addAuthListener(new SampleAuthListener());
        SessionEvents.addLogoutListener(new SampleLogoutListener());
        mLoginButton.init(this, mFacebook, 2);
		
		Bundle bundle;
		bundle = this.getIntent().getExtras();
		boolean isMine = bundle.getBoolean("ismine");
		Uri path = Uri.parse(bundle.getString("path"));
		final int id = bundle.getInt("db_id");
		ImageView myImageView = (ImageView)findViewById(R.id.browsediary_img);
		LinearLayout ll = (LinearLayout)findViewById(R.id.browsediary_ll);
		
		ll.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				BrowseDiary.this.finish();
				System.gc();
			}
			
		});
		
		ContentResolver vContentResolver = getContentResolver();
		try {
			img = BitmapFactory.decodeStream(vContentResolver
					.openInputStream(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		myImageView.setAdjustViewBounds(true);
		myImageView.setImageBitmap(img);
		//img.recycle();
		
		LinearLayout ll_mine = (LinearLayout)findViewById(R.id.browsediary_ll_mine);
		LinearLayout ll_others = (LinearLayout)findViewById(R.id.browsediary_ll_others);
		
		ImageButton btn_delete = (ImageButton)findViewById(R.id.diary_btn_delete);
		btn_delete.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				MySQLite db = new MySQLite(BrowseDiary.this);
				db.delete(id);
				db.close();
				BrowseDiary.this.finish();
			}
		});
		
		if(isMine==true){
			ll_mine.setVisibility(View.VISIBLE);
			ll_others.setVisibility(View.GONE);
		}
		else{
			ll_mine.setVisibility(View.GONE);
			ll_others.setVisibility(View.VISIBLE);
		}

	}
	
	public void sendPost()
	{
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
				publishToWall();
				handler.sendEmptyMessage(0);
			}
		};
		thread.start();

	}

	private void publishToWall() {

		Bundle params = new Bundle();
        params.putString("method", "photos.upload");
        
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
		img.compress(Bitmap.CompressFormat.PNG, 100, stream);
		byte[] byteArray = stream.toByteArray();
        
        params.putByteArray("picture", byteArray);

        mAsyncRunner.request(null, params, "POST",
                new SampleUploadListener(), null);

	}
	
	public class SampleAuthListener implements AuthListener {

        public void onAuthSucceed() {
            
        }

        public void onAuthFail(String error) {
            
        }
    }

    public class SampleLogoutListener implements LogoutListener {
        public void onLogoutBegin() {
            
        }

        public void onLogoutFinish() {
            
        }
    }
    
    public class SampleUploadListener extends BaseRequestListener {

        public void onComplete(final String response, final Object state) {
            
        }
    }
	
}