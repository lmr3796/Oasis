package com.android.Oasis.story;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.Oasis.R;
import com.android.Oasis.diary.OldDiary;
import com.android.Oasis.recent.Recent;

public class Story extends Activity {

	TextView tv_letter;
	ImageView img_letter;
	TextView viewPager;

	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	int PLANT = 0;
	
	String[] plantstrs;
	
	String[] storystrs;
	
	private int[] storyarray = {
			R.array.story0,R.array.story1,R.array.story2,R.array.story3,R.array.story4,
			R.array.story5,R.array.story6,R.array.story7,R.array.story8,R.array.story9,
			R.array.story10,R.array.story11,R.array.story12,R.array.story13,R.array.story14,
			R.array.story15,R.array.story16,R.array.story17,R.array.story18,R.array.story19};
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story);
		
		bundle = this.getIntent().getExtras();
		PLANT = bundle.getInt("plant");
		
		Resources res = Story.this.getResources();
		plantstrs = res.getStringArray(R.array.plantname);
		
		storystrs = res.getStringArray(storyarray[PLANT]);
		
		viewPager = (TextView) findViewById(R.id.pager);
		viewPager.setTextColor(Color.BLACK);
		viewPager.setTextSize(20);
		viewPager.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/fontw3.ttc"));
		viewPager.setText(storystrs[0]);
		
		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		int height = displaymetrics.heightPixels;
		//int width = displaymetrics.widthPixels;
		
		tv_letter = (TextView)findViewById(R.id.tv_letter);
		tv_letter.setText("您有一封來自" + plantstrs[PLANT] + "的訊息");
		tv_letter.setTextSize(20);
		tv_letter.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/fontw3.ttc"));
		img_letter = (ImageView)findViewById(R.id.img_letter);
		img_letter.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				img_letter.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.letter_open));
				handler.sendEmptyMessageDelayed(1, 1000);
			}
		});
		img_letter.setPadding(0, (int) (height*0.3-110), 0, 0);

		final ImageButton btn_mood = (ImageButton) findViewById(R.id.story_btn_mood);
		final ImageButton btn_family = (ImageButton) findViewById(R.id.story_btn_family);
		final ImageButton btn_grow = (ImageButton) findViewById(R.id.story_btn_grow);
		btn_mood.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_mood_y));
		
		btn_mood.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_mood.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_mood_y));
				btn_family.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_family));
				btn_grow.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_grow));
				viewPager.setText(storystrs[0]);
			}
		});

		btn_family.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_mood.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_mood));
				btn_family.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_family_y));
				btn_grow.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_grow));
				viewPager.setText(storystrs[1]);
			}
		});

		btn_grow.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_mood.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_mood));
				btn_family.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_family));
				btn_grow.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_grow_y));
				viewPager.setText(storystrs[2]);
			}
		});
		
		ImageButton btn_diary = (ImageButton) findViewById(R.id.main_btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Story.this, OldDiary.class);
				startActivity(intent);
				System.gc();
				Story.this.finish();
			}
		});
		
		ImageButton btn_recent = (ImageButton) findViewById(R.id.main_btn_recent);
		btn_recent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Story.this, Recent.class);
				startActivity(intent);
				System.gc();
				Story.this.finish();
			}
		});
		
		ImageButton btn_life = (ImageButton) findViewById(R.id.main_btn_life);
		btn_life.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse(Story.this.getResources().getString(R.string.fb_url));
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

	}
	
	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case 1:
				tv_letter.setVisibility(View.GONE);
				img_letter.setVisibility(View.GONE);
				viewPager.setVisibility(View.VISIBLE);
				break;
			}
		}
	};

}
