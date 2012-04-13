package com.android.Oasis.diary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
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
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.Oasis.MySQLite;
import com.android.Oasis.R;

public class NewDiary extends Activity {
	
	private SQLiteDatabase db;
	MySQLite mySQLite;

	int PLANT = 0;
	
	Uri uri;
	Bitmap bmp;
	Bitmap img = null;
	Bitmap result = null;
	String finalLoc = "";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newdiary);

		Bundle bundle;
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

		imgview.setImageBitmap(finalBitmap);

		final EditText text = (EditText) findViewById(R.id.newdiary_text);
		text.setMaxLines(3);
		text.setTextSize(16);
		text.setWidth(300);
		text.setTextColor(Color.BLACK);
		text.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/textfont.ttf"));

		LinearLayout.LayoutParams mParams = new LinearLayout.LayoutParams(
				finalBitmap.getWidth() + 20, finalBitmap.getHeight() + 102);
		LinearLayout ll = (LinearLayout) findViewById(R.id.newdiary_ll);
		ll.setLayoutParams(mParams);

		ViewTreeObserver vto = text.getViewTreeObserver();
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {
				text.setCursorVisible(false);
				text.buildDrawingCache();
				text.setCursorVisible(true);
			}
		});

		final Bitmap finalImg = finalBitmap;

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
				NewDiary.this.finish();
			}
		});

	}

	public void saveToDb() {

		SimpleDateFormat sdfDateTime = new SimpleDateFormat("yyyy/MM/dd",
				Locale.TAIWAN);
		String posttime = sdfDateTime.format(new Date(System.currentTimeMillis()));
		
		// finalLoc newtime plant
		
		mySQLite = new MySQLite(NewDiary.this);
		db = mySQLite.getWritableDatabase();

		ContentValues values = new ContentValues();

		values.put("PLANT_TYPE", PLANT);
		values.put("FILE_PATH", finalLoc);
		values.put("DATE", posttime);
		
		db.insert(mySQLite.TB_NAME, null, values);
		
		db.close();
		
	}

	public void combineImages(Bitmap photo, Bitmap text) {

		Bitmap resizePhoto = null;

		int width = 320, height = 420;

		resizePhoto = Bitmap.createScaledBitmap(photo, 300, photo.getHeight()
				* 300 / photo.getWidth(), true);
		result = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

		Canvas comboImage = new Canvas(result);

		comboImage.drawBitmap(((BitmapDrawable) (NewDiary.this.getResources()
				.getDrawable(R.drawable.diary_photo_bg))).getBitmap(), 0f, 0f,
				null);
		comboImage.drawBitmap(resizePhoto, 10, 12, null);
		comboImage.drawBitmap(Bitmap.createScaledBitmap(
				((BitmapDrawable) (NewDiary.this.getResources()
						.getDrawable(R.drawable.diary_photo_border)))
						.getBitmap(), 300, resizePhoto.getHeight(), true), 10,
				12, null);
		if (text != null)
			comboImage.drawBitmap(text, 10, resizePhoto.getHeight() + 16, null);

		//File cacheDir = getCacheDir(); // get cache dir
		File dir = new File (Environment.getExternalStorageDirectory() + "/Oasis");
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

		//android.provider.MediaStore.Images.Media.insertImage(
		//		getContentResolver(), result, "", "");

		//Log.d("DEBUG", finalLoc);

		//sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED,
		//		Uri.parse("file://" + Environment.getExternalStorageDirectory())));

		return;
	}

}
