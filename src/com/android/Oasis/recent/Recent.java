package com.android.Oasis.recent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.Oasis.R;
import com.android.Oasis.diary.OldDiary;
import com.android.Oasis.life.Life;
import com.android.Oasis.story.Story;

public class Recent extends Activity {

	String type;
	private static int NUM_RAIN = 3;
	private static int NUM_WORM = 7;
	private static int NUM_LEAF = 3;
	private static int NUM_SICK = 3;

	private ViewPager viewPager;
	private Context cxt;
	private pagerAdapter pageradapter;
	TextView tv_letter;
	ImageView img_letter;
	
	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	int PLANT = 0;
	
	String[] rainstrs;
	String[] wormstrs;
	String[] leafstrs;
	String[] sickstrs;

	String[] plantstrs;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recent);
		cxt = this;
		type = "rain";
		
		readString();
		
		bundle = this.getIntent().getExtras();
		PLANT = bundle.getInt("plant");
		
		Resources res = Recent.this.getResources();
		plantstrs = res.getStringArray(R.array.plantname);

		pageradapter = new pagerAdapter();
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(pageradapter);
		
		tv_letter = (TextView)findViewById(R.id.tv_letter);
		tv_letter.setText("您有一封來自" + plantstrs[PLANT] + "的訊息");
		tv_letter.setTextSize(20);
		//tv_letter.setTypeface(Typeface.createFromAsset(getAssets(),
		//		"fonts/fontw3.ttc"));
		img_letter = (ImageView)findViewById(R.id.img_letter);
		img_letter.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				img_letter.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.letter_open));
				handler.sendEmptyMessageDelayed(1, 1000);
			}
		});

		final ImageButton btn_rain = (ImageButton) findViewById(R.id.recent_btn_rain);
		final ImageButton btn_worm = (ImageButton) findViewById(R.id.recent_btn_worm);
		final ImageButton btn_leaf = (ImageButton) findViewById(R.id.recent_btn_leaf);
		final ImageButton btn_sick = (ImageButton) findViewById(R.id.recent_btn_sick);
		btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain_y));
		
		btn_rain.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "rain";
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain_y));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setAdapter(pageradapter);
			}
		});

		btn_worm.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "worm";
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm_y));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setAdapter(pageradapter);
			}
		});
		
		btn_leaf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "leaf";
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf_y));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick));
				viewPager.setAdapter(pageradapter);
			}
		});
		
		btn_sick.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "sick";
				btn_rain.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_rain));
				btn_worm.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_worm));
				btn_leaf.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_leaf));
				btn_sick.setImageDrawable(Recent.this.getResources().getDrawable(R.drawable.recent_btn_sick_y));
				viewPager.setAdapter(pageradapter);
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
				intent.putExtras(bundle);
				intent.setClass(Recent.this, Life.class);
				startActivity(intent);
				System.gc();
				Recent.this.finish();
			}
		});

	}
	
	private void readString(){
		Resources res = Recent.this.getResources();
		rainstrs = res.getStringArray(R.array.recentrain);
		wormstrs = res.getStringArray(R.array.recentworm);
		leafstrs = res.getStringArray(R.array.recentleaf);
		sickstrs = res.getStringArray(R.array.recentsick);
	}

	private class pagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			if (type.equals("rain"))
				return rainstrs.length;
			if (type.equals("worm"))
				return wormstrs.length;
			if (type.equals("leaf"))
				return leafstrs.length;
			if (type.equals("sick"))
				return sickstrs.length;
			return 0;
		}

		/**
		 * Create the page for the given position. The adapter is responsible
		 * for adding the view to the container given here, although it only
		 * must ensure this is done by the time it returns from
		 * {@link #finishUpdate()}.
		 * 
		 * @param container
		 *            The containing View in which the page will be shown.
		 * @param position
		 *            The page position to be instantiated.
		 * @return Returns an Object representing the new page. This does not
		 *         need to be a View, but can be some other container of the
		 *         page.
		 */
		@Override
		public Object instantiateItem(View collection, int position) {

			String pos = String.valueOf(position);
			//String filename = type + pos + ".txt";
			//String contentStr = "";

			ScrollView sv = new ScrollView(cxt);

			LinearLayout ll = new LinearLayout(cxt);
			ll.setOrientation(LinearLayout.VERTICAL);

			TextView tv = new TextView(cxt);
			tv.setText("This is page # " + position);
			tv.setTextColor(Color.WHITE);
			tv.setTextSize(30);

			ll.addView(tv);

			/*
			InputStream input;
			try {
				input = getAssets().open(filename);
				if (input != null) {
					// prepare the file for reading
					InputStreamReader inputreader = new InputStreamReader(input);
					BufferedReader buffreader = new BufferedReader(inputreader);
					String line;

					while ((line = buffreader.readLine()) != null) {
						contentStr += line + '\n';
					}
					
					TextView cont = new TextView(cxt);
					cont.setTextColor(Color.BLACK);
					cont.setTextSize(20);
					cont.setTypeface(Typeface.createFromAsset(getAssets(),
							"fonts/textfont.ttf"));
					cont.setText(contentStr);
					ll.addView(cont);

				}
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			*/
			
			TextView cont = new TextView(cxt);
			cont.setTextColor(Color.BLACK);
			cont.setTextSize(20);
			//cont.setTypeface(Typeface.createFromAsset(getAssets(),
			//		"fonts/fontw3.ttc"));
			
			if (type.equals("rain"))
				cont.setText(rainstrs[position]);
			else if (type.equals("worm"))
				cont.setText(wormstrs[position]);
			else if (type.equals("leaf"))
				cont.setText(leafstrs[position]);
			else if (type.equals("sick"))
				cont.setText(sickstrs[position]);
			
			ll.addView(cont);

			sv.addView(ll);
			((ViewPager) collection).addView(sv);
			return sv;
		}

		/**
		 * Remove a page for the given position. The adapter is responsible for
		 * removing the view from its container, although it only must ensure
		 * this is done by the time it returns from {@link #finishUpdate()}.
		 * 
		 * @param container
		 *            The containing View from which the page will be removed.
		 * @param position
		 *            The page position to be removed.
		 * @param object
		 *            The same object that was returned by
		 *            {@link #instantiateItem(View, int)}.
		 */
		@Override
		public void destroyItem(View collection, int position, Object view) {
			((ViewPager) collection).removeView((ScrollView) view);
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			return view == ((ScrollView) object);
		}

		/**
		 * Called when the a change in the shown pages has been completed. At
		 * this point you must ensure that all of the pages have actually been
		 * added or removed from the container as appropriate.
		 * 
		 * @param container
		 *            The containing View which is displaying this adapter's
		 *            page views.
		 */
		@Override
		public void finishUpdate(View arg0) {
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {
		}

		@Override
		public Parcelable saveState() {
			return null;
		}

		@Override
		public void startUpdate(View arg0) {
		}

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
