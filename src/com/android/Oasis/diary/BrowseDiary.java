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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.Oasis.MySQLite;
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
		final int id = bundle.getInt("db_id");
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
		
		LinearLayout ll_mine = (LinearLayout)findViewById(R.id.browsediary_ll_mine);
		LinearLayout ll_others = (LinearLayout)findViewById(R.id.browsediary_ll_others);
		
		final MySQLite db = new MySQLite(BrowseDiary.this);
		
		ImageButton btn_delete = (ImageButton)findViewById(R.id.diary_btn_delete);
		btn_delete.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
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
}