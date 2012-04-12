package com.android.Oasis.diary;

import java.io.FileNotFoundException;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
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
		//imgview.setVisibility(View.GONE);

		final Bitmap bitmap = Bitmap.createBitmap(100, 500, Bitmap.Config.ARGB_8888);
		Paint paint = new Paint();
		paint.setTextSize(20);
		paint.setColor(Color.BLACK);
		Canvas canvas = new Canvas(bitmap);
		//canvas.drawBitmap(bitmap, 0, 0, null);
		canvas.drawColor(Color.WHITE);
		canvas.drawText("TEXT", 0, 0, paint);

		final ImageView img = (ImageView) findViewById(R.id.newdiary_show);
		final EditText text = (EditText) findViewById(R.id.newdiary_text);
		//text.buildDrawingCache();

		ViewTreeObserver vto = text.getViewTreeObserver();
		vto.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
			@Override
			public void onGlobalLayout() {
				text.buildDrawingCache();
			}
		});

		Button btn_go = (Button) findViewById(R.id.newdiary_btn_go);
		btn_go.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				img.setImageBitmap(bitmap);
				//img.setImageBitmap(text.getDrawingCache());
				//Log.d("DEBUG", text.getText().toString());
			}
		});

		// text.setImageBitmap(bitmap);

	}

}
