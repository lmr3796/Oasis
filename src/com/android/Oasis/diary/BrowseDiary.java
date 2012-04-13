package com.android.Oasis.diary;

import java.io.FileNotFoundException;

import android.app.Activity;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.Oasis.R;

public class BrowseDiary extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browsediary);
		
		Bundle bundle;
		bundle = this.getIntent().getExtras();
		boolean isMine = bundle.getBoolean("ismine");
		Uri path = Uri.parse(bundle.getString("path"));
		Bitmap img = null;
		ImageView myImageView = (ImageView)findViewById(R.id.browsediary_img);
		LinearLayout ll = (LinearLayout)findViewById(R.id.browsediary_ll);
		
		ll.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				BrowseDiary.this.finish();
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
		

	}
}