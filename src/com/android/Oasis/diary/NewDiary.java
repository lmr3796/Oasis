package com.android.Oasis.diary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.android.Oasis.R;

public class NewDiary extends Activity {

	Uri uri;
	Bitmap bmp;
	Bitmap img = null;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.newdiary);

		Bundle bundle;
		bundle = this.getIntent().getExtras();
		uri = Uri.parse(bundle.getString("uri"));
		ImageView imgview = (ImageView) findViewById(R.id.newdiary_pic);

		uri = Uri.parse(bundle.getString("uri"));

		ContentResolver vContentResolver = getContentResolver();
		try {
			img = BitmapFactory.decodeStream(vContentResolver
					.openInputStream(uri));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		imgview.setImageBitmap(img);

		final ImageView imgv = (ImageView) findViewById(R.id.newdiary_show);
		final EditText text = (EditText) findViewById(R.id.newdiary_text);
		text.setMaxLines(3);
		text.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/textfont.ttf"));

		// text.buildDrawingCache();

		ViewTreeObserver vto = text.getViewTreeObserver();
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {
				text.setCursorVisible(false);
				text.buildDrawingCache();
				text.setCursorVisible(true);
			}
		});

		Button btn_go = (Button) findViewById(R.id.newdiary_btn_go);
		btn_go.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Bitmap bitmap = text.getDrawingCache();
				imgv.setImageBitmap(bitmap);
				// img.setImageBitmap(text.getDrawingCache());
				combineImages(img, bitmap);
			}
		});

	}

	public void combineImages(Bitmap photo, Bitmap text) {

		Bitmap result = null, resizePhoto = null;

		int width = 320, height = 450;

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
		comboImage.drawBitmap(text, 10, resizePhoto.getHeight() + 16, null);

		OutputStream os = null;
		File cacheDir = getCacheDir(); // get cache dir
		File picture = new File(cacheDir.getAbsolutePath() + File.separator
				+ System.currentTimeMillis() + ".png"); // new file
		try {
			os = new FileOutputStream(picture);
			result.compress(CompressFormat.PNG, 100, os);
			os.close();
		} catch (IOException e) {
			Log.e("combineImages", "problem combining images", e);
		}

		android.provider.MediaStore.Images.Media.insertImage(
				getContentResolver(), result, "", "");

		sendBroadcast(new Intent(
				Intent.ACTION_MEDIA_MOUNTED,
				Uri.parse("file://" + Environment.getExternalStorageDirectory())));

		return;
	}

}
