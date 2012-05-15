package com.android.Oasis.recent;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.Oasis.R;
import com.android.Oasis.diary.OldDiary;
import com.android.Oasis.story.Story;

public class Recent extends Activity {

	TextView viewPager;
	TextView tv_letter;
	ImageView img_letter;
	
	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	int PLANT = 0;

	String[] plantstrs;
	
	String[] recentstrs;
	
	private int[] recentarray = {
			R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,
			R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,
			R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,
			R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0,R.array.recent0
	};
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recent);
		
		bundle = this.getIntent().getExtras();
		PLANT = bundle.getInt("plant");
		
		Resources res = Recent.this.getResources();
		plantstrs = res.getStringArray(R.array.plantname);
		
		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
		int height = displaymetrics.heightPixels;
		
		recentstrs = res.getStringArray(recentarray[PLANT]);

		viewPager = (TextView) findViewById(R.id.pager);
		viewPager.setTextColor(Color.BLACK);
		viewPager.setTextSize(20);
		viewPager.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/fontw3.ttc"));
		viewPager.setText(recentstrs[0]);
		
		tv_letter = (TextView)findViewById(R.id.tv_letter);
		tv_letter.setText("您有一封來自" + plantstrs[PLANT] + "的訊息");
		tv_letter.setTextSize(20);
		tv_letter.setTypeface(Typeface.createFromAsset(getAssets(),
				"fonts/fontw3.ttc"));
		img_letter = (ImageView)findViewById(R.id.img_letter);
		img_letter.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				img_letter.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.letter_open));
				handler.sendEmptyMessageDelayed(1, 1000);
			}
		});
		img_letter.setPadding(0, (int) (height*0.3-110), 0, 0);

		final ImageButton btn_rain = (ImageButton) findViewById(R.id.recent_btn_rain);
		final ImageButton btn_worm = (ImageButton) findViewById(R.id.recent_btn_worm);
		final ImageButton btn_leaf = (ImageButton) findViewById(R.id.recent_btn_leaf);
		final ImageButton btn_sick = (ImageButton) findViewById(R.id.recent_btn_sick);
		btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain_y));
		
		btn_rain.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain_y));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setText(recentstrs[0]);
			}
		});

		btn_worm.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm_y));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setText(recentstrs[1]);
			}
		});
		
		btn_leaf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf_y));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setText(recentstrs[2]);
			}
		});
		
		btn_sick.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick_y));
				viewPager.setText(recentstrs[3]);
			}
		});
		
		ImageButton btn_story = (ImageButton) findViewById(R.id.main_btn_story);
		btn_story.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Recent.this, Story.class);
				startActivity(intent);
				System.gc();
				Recent.this.finish();
			}
		});
		
		ImageButton btn_diary = (ImageButton) findViewById(R.id.main_btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Recent.this, OldDiary.class);
				startActivity(intent);
				System.gc();
				Recent.this.finish();
			}
		});
		
		ImageButton btn_recent = (ImageButton) findViewById(R.id.main_btn_recent);
		btn_recent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Recent.this, Recent.class);
				startActivity(intent);
				System.gc();
				Recent.this.finish();
			}
		});
		
		ImageButton btn_life = (ImageButton) findViewById(R.id.main_btn_life);
		btn_life.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Uri uri = Uri.parse(Recent.this.getResources().getString(R.string.fb_url));
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});
	}
	private String defaultRecentString(){
		String recent;
		HttpClient hc = new DefaultHttpClient(); 
		HttpGet get = new HttpGet(this.getString(R.string.recentURL));
		try {
			SharedPreferences settings = this.getSharedPreferences(this.getString(R.string.app_name), 0);
			HttpResponse rp = hc.execute(get);
			if(rp.getStatusLine().getStatusCode() != 200)
				throw new Exception();
			recent = EntityUtils.toString(hc.execute(get).getEntity());
			settings.edit().putString("cache", recent);
			return recent;
		} catch (Exception e) {
			return defaultRecentStringFromCache();
		}		
	}
	private String defaultRecentStringFromCache(){
		SharedPreferences settings = this.getSharedPreferences(this.getString(R.string.app_name), 0);
		String cacheString = settings.getString("cache", "");
		if(!cacheString.equals("")){
			return cacheString;
		}
		return this.getString(R.string.recent);
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
