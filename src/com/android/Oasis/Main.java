package com.android.Oasis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.android.Oasis.diary.OldDiary;
import com.android.Oasis.life.Life;
import com.android.Oasis.recent.Recent;
import com.android.Oasis.story.Story;

public class Main extends Activity {
	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	
	// original images of gallery
	private Integer[] mThumbIds = { 
			R.drawable.gallery_selector_0, R.drawable.gallery_selector_1, R.drawable.gallery_selector_2,
			R.drawable.gallery_selector_3, R.drawable.gallery_selector_4, R.drawable.gallery_selector_5,
			R.drawable.gallery_selector_6, R.drawable.gallery_selector_7, R.drawable.gallery_selector_8,
			R.drawable.gallery_selector_9, R.drawable.gallery_selector_10, R.drawable.gallery_selector_11,
			R.drawable.gallery_selector_12, R.drawable.gallery_selector_13, R.drawable.gallery_selector_14,
			R.drawable.gallery_selector_15, R.drawable.gallery_selector_16, R.drawable.gallery_selector_17,
			R.drawable.gallery_selector_18, R.drawable.gallery_selector_19
			};
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final Gallery myGallery = (Gallery) findViewById(R.id.gallery);
		myGallery.setAdapter(new ImageAdapter(this));
		myGallery.setOnItemSelectedListener(myGalleryOnItemSelectedListener);
		bundle.putInt("plant", 0);
		
		ImageButton btn_story = (ImageButton) findViewById(R.id.main_btn_story);
		btn_story.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Main.this, Story.class);
				startActivity(intent);
			}
		});
		
		ImageButton btn_diary = (ImageButton) findViewById(R.id.main_btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Main.this, OldDiary.class);
				startActivity(intent);
			}
		});
		
		ImageButton btn_recent = (ImageButton) findViewById(R.id.main_btn_recent);
		btn_recent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Main.this, Recent.class);
				startActivity(intent);
			}
		});
		
		ImageButton btn_life = (ImageButton) findViewById(R.id.main_btn_life);
		btn_life.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Main.this, Life.class);
				startActivity(intent);
			}
		});

	}

	private OnItemSelectedListener myGalleryOnItemSelectedListener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			bundle.putInt("plant", arg2);
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
		}

	};

	public class ImageAdapter extends BaseAdapter {
		private Context context;

		public ImageAdapter(Context c) {
			context = c;
		}

		@Override
		public int getCount() {
			return mThumbIds.length;
		}

		@Override
		public Object getItem(int position) {
			return mThumbIds[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) {
				imageView = new ImageView(context);
				imageView.setLayoutParams(new Gallery.LayoutParams(
						LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(8, 8, 8, 8);
			} else {
				imageView = (ImageView) convertView;
			}
			//if(position==0)
			//	imageView.setImageResource(Main.this.getResources().getIdentifier("gallery_selector_" + position, "drawable", getPackageName()));
			//else
			//	imageView.setImageResource(R.drawable.gallery_selector_0);
			imageView.setImageResource(mThumbIds[position]);
			return imageView;
		}
	}

}