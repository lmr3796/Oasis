package com.android.Oasis.diary;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

import com.android.Oasis.BaseRequestListener;
import com.android.Oasis.LoginButton;
import com.android.Oasis.MySQLite;
import com.android.Oasis.R;
import com.android.Oasis.SessionEvents;
import com.android.Oasis.SessionEvents.AuthListener;
import com.android.Oasis.SessionEvents.LogoutListener;
import com.android.Oasis.SessionStore;
import com.android.Oasis.life.Life;
import com.android.Oasis.recent.Recent;
import com.android.Oasis.story.Story;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;
import com.facebook.android.FacebookError;
import com.facebook.android.Util;

public class NewDiary extends Activity {

	public static final String APP_ID = "285141848231182";
	private Facebook mFacebook;
    private AsyncFacebookRunner mAsyncRunner;

	private SQLiteDatabase db;
	MySQLite mySQLite;

	int PLANT = 0;

	Uri uri;
	Bitmap bmp;
	Bitmap img = null;
	Bitmap result = null;
	String finalLoc = "";
	String finalLocThumb = "";

	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	
	private LoginButton mLoginButton;
	EditText text;
	Bitmap finalImg;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newdiary);
		
		mLoginButton = (LoginButton) findViewById(R.id.login);
		mLoginButton.setImageResource(R.drawable.diary_btn_post);
		
		mFacebook = new Facebook(APP_ID);
       	mAsyncRunner = new AsyncFacebookRunner(mFacebook);
       	
       	SessionStore.restore(mFacebook, this);
        SessionEvents.addAuthListener(new SampleAuthListener());
        SessionEvents.addLogoutListener(new SampleLogoutListener());
        mLoginButton.init(this, mFacebook, 1);

		// Bundle bundle;
		bundle = this.getIntent().getExtras();
		uri = Uri.parse(bundle.getString("uri"));
		PLANT = bundle.getInt("plant");
		ImageView imgview = (ImageView) findViewById(R.id.newdiary_pic);

		uri = Uri.parse(bundle.getString("uri"));

		ContentResolver vContentResolver = getContentResolver();
		try {
			img = BitmapFactory.decodeStream(vContentResolver
					.openInputStream(uri));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Bitmap finalBitmap = null;
		if (img.getWidth() > img.getHeight()) {
			finalBitmap = Bitmap.createBitmap(img,
					img.getWidth() / 2 - img.getHeight() / 2, 0, img.getWidth()
							/ 2 + img.getHeight() / 2, img.getHeight());
		} else {
			finalBitmap = Bitmap.createBitmap(img, 0,
					img.getHeight() / 2 - img.getWidth() / 2, img.getWidth(),
					img.getHeight() / 2 + img.getWidth() / 2);
		}

		imgview.setAdjustViewBounds(true);
		imgview.setScaleType(ScaleType.CENTER_CROP);
		imgview.setMaxHeight(320);
		imgview.setMaxWidth(320);
		imgview.setImageBitmap(finalBitmap);

		text = (EditText) findViewById(R.id.newdiary_text);
		text.setMaxLines(3);
		text.setTextSize(15);
		text.setWidth(320);
		text.setTextColor(Color.BLACK);
		text.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/textfont.ttf"));

		ViewTreeObserver vto = text.getViewTreeObserver();
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {
				text.setCursorVisible(false);
				text.buildDrawingCache();
				text.setCursorVisible(true);
			}
		});

		finalImg = finalBitmap;
		// finalBitmap.recycle();

		ImageButton btn_save = (ImageButton) findViewById(R.id.diary_btn_save);
		btn_save.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Bitmap bitmap;
				if (text.getText().toString().equals(""))
					bitmap = null;
				else
					bitmap = text.getDrawingCache();

				combineImages(finalImg, bitmap);
				saveToDb();
				// bitmap.recycle();
				// finalImg.recycle();
				System.gc();
				NewDiary.this.finish();
			}
		});

		/*
		ImageButton btn_post = (ImageButton) findViewById(R.id.diary_btn_post);
		btn_post.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Bitmap bitmap;
				if (text.getText().toString().equals(""))
					bitmap = null;
				else
					bitmap = text.getDrawingCache();

				combineImages(finalImg, bitmap);
				saveToDb();
				postToWall();
				System.gc();
				NewDiary.this.finish();
			}
		});
		*/

		ImageButton btn_story = (ImageButton) findViewById(R.id.main_btn_story);
		btn_story.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(NewDiary.this, Story.class);
				startActivity(intent);
				System.gc();
				NewDiary.this.finish();
			}
		});

		ImageButton btn_diary = (ImageButton) findViewById(R.id.main_btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(NewDiary.this, OldDiary.class);
				startActivity(intent);
				System.gc();
				NewDiary.this.finish();
			}
		});

		ImageButton btn_recent = (ImageButton) findViewById(R.id.main_btn_recent);
		btn_recent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(NewDiary.this, Recent.class);
				startActivity(intent);
				System.gc();
				NewDiary.this.finish();
			}
		});

		ImageButton btn_life = (ImageButton) findViewById(R.id.main_btn_life);
		btn_life.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(NewDiary.this, Life.class);
				startActivity(intent);
				System.gc();
				NewDiary.this.finish();
			}
		});

	}
	
	public void sendPost()
	{
		Bitmap bitmap;
		if (text.getText().toString().equals(""))
			bitmap = null;
		else
			bitmap = text.getDrawingCache();

		combineImages(finalImg, bitmap);
		saveToDb();
		postToWall();
		System.gc();
		NewDiary.this.finish();
		
	}

	public void saveToDb() {

		SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyyyMMdd",
				Locale.TAIWAN);
		String posttime = sdfDateTime.format(new Date(System
				.currentTimeMillis()));

		mySQLite = new MySQLite(NewDiary.this);
		db = mySQLite.getWritableDatabase();

		ContentValues values = new ContentValues();

		values.put("PLANT_TYPE", PLANT);
		values.put("FILE_PATH", finalLoc);
		values.put("DATE", posttime);
		values.put("THUMB_PATH", finalLocThumb);

		db.insert(mySQLite.TB_NAME, null, values);

		db.close();

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
		result.compress(Bitmap.CompressFormat.PNG, 100, stream);
		byte[] byteArray = stream.toByteArray();
        
        params.putByteArray("picture", byteArray);

        mAsyncRunner.request(null, params, "POST",
                new SampleUploadListener(), null);

	}
	
	@Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        mFacebook.authorizeCallback(requestCode, resultCode, data);
    }

	private final class WallPostListener extends BaseRequestListener {

		@Override
		public void onComplete(String response, Object state) {
			// TODO Auto-generated method stub

		}
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
            try {
                // process the response here: (executed in background thread)
                Log.d("Facebook-Example", "Response: " + response.toString());
                JSONObject json = Util.parseJson(response);
                final String src = json.getString("src");

                // then post the processed result back to the UI thread
                // if we do not do this, an runtime exception will be generated
                // e.g. "CalledFromWrongThreadException: Only the original
                // thread that created a view hierarchy can touch its views."
                //NewDiary.this.runOnUiThread(new Runnable() {
                //   public void run() {
                //        mText.setText("Hello there, photo has been uploaded at \n" + src);
                //    }
                //});
            } catch (JSONException e) {
                Log.w("Facebook-Example", "JSON Error in response");
            } catch (FacebookError e) {
                Log.w("Facebook-Example", "Facebook Error: " + e.getMessage());
            }
        }
    }

	public void combineImages(Bitmap photo, Bitmap text) {

		Bitmap resizePhoto = null;

		int width = 358, height = 480;

		resizePhoto = Bitmap.createScaledBitmap(photo, 338, photo.getHeight()
				* 338 / photo.getWidth(), true);
		result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

		Canvas comboImage = new Canvas(result);

		comboImage.drawBitmap(((BitmapDrawable) (NewDiary.this.getResources()
				.getDrawable(R.drawable.diary_photo_bg))).getBitmap(), 0f, 0f,
				null);
		comboImage.drawBitmap(resizePhoto, 10, 12, null);
		comboImage.drawBitmap(Bitmap.createScaledBitmap(
				((BitmapDrawable) (NewDiary.this.getResources()
						.getDrawable(R.drawable.diary_photo_border)))
						.getBitmap(), 338, resizePhoto.getHeight(), true), 10,
				12, null);
		if (text != null)
			comboImage.drawBitmap(text, 10, resizePhoto.getHeight() + 16, null);

		resizePhoto.recycle();
		// File cacheDir = getCacheDir(); // get cache dir
		File dir = new File(Environment.getExternalStorageDirectory()
				+ "/Oasis");
		dir.mkdirs();
		String currentTimeStr = String.valueOf(System.currentTimeMillis());
		File picture = new File(dir, currentTimeStr + ".png"); // new file
		try {
			OutputStream os = new FileOutputStream(picture);
			result.compress(CompressFormat.PNG, 100, os);
			os.close();
			finalLoc = Uri.fromFile(picture).toString();
		} catch (IOException e) {
			Log.e("combineImages", "problem combining images", e);
		}

		Bitmap thumb = Bitmap.createScaledBitmap(result, 120,
				result.getHeight() * 120 / result.getWidth(), true);
		File dir2 = new File(Environment.getExternalStorageDirectory()
				+ "/Oasis/thumb");
		dir2.mkdirs();
		String currentTimeStr2 = String.valueOf(System.currentTimeMillis())
				+ "tb";
		File picture2 = new File(dir2, currentTimeStr2 + ".png"); // new file
		try {
			OutputStream os = new FileOutputStream(picture2);
			thumb.compress(CompressFormat.PNG, 100, os);
			os.close();
			finalLocThumb = Uri.fromFile(picture2).toString();
		} catch (IOException e) {
		}

		// android.provider.MediaStore.Images.Media.insertImage(
		// getContentResolver(), result, "", "");

		// Log.d("DEBUG", finalLoc);

		// sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED,
		// Uri.parse("file://" + Environment.getExternalStorageDirectory())));

		// bmp.recycle();
		// img.recycle();
		// result.recycle();

		System.gc();

		return;
	}

}
