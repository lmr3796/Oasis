package com.android.Oasis.story;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
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
import com.android.Oasis.recent.Recent;

public class Story_d extends Activity {

	String type;

	private ViewPager viewPager;
	private Context cxt;
	private pagerAdapter pageradapter;
	TextView tv_letter;
	ImageView img_letter;

	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	int PLANT = 0;
	
	String[] moodstrs;
	String[] familystrs;
	String[] growstrs;
	
	String[] plantstrs;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story);
		cxt = this;
		type = "mood";
		
		readString();

		bundle = this.getIntent().getExtras();
		PLANT = bundle.getInt("plant");
		
		Resources res = Story_d.this.getResources();
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
				img_letter.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.letter_open));
				handler.sendEmptyMessageDelayed(1, 1000);
			}
		});

		final ImageButton btn_mood = (ImageButton) findViewById(R.id.story_btn_mood);
		final ImageButton btn_family = (ImageButton) findViewById(R.id.story_btn_family);
		final ImageButton btn_grow = (ImageButton) findViewById(R.id.story_btn_grow);
		btn_mood.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_mood_y));
		//btn_family.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_family));
		//btn_grow.setImageDrawable(Story.this.getResources().getDrawable(R.drawable.story_btn_grow));
		
		btn_mood.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "mood";
				btn_mood.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_mood_y));
				btn_family.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_family));
				btn_grow.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_grow));
				viewPager.setAdapter(pageradapter);
			}
		});

		btn_family.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "family";
				btn_mood.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_mood));
				btn_family.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_family_y));
				btn_grow.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_grow));
				viewPager.setAdapter(pageradapter);
			}
		});

		btn_grow.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "grow";
				btn_mood.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_mood));
				btn_family.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_family));
				btn_grow.setImageDrawable(Story_d.this.getResources().getDrawable(R.drawable.story_btn_grow_y));
				viewPager.setAdapter(pageradapter);
			}
		});
		
		ImageButton btn_diary = (ImageButton) findViewById(R.id.main_btn_diary);
		btn_diary.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Story_d.this, OldDiary.class);
				startActivity(intent);
				System.gc();
				Story_d.this.finish();
			}
		});
		
		ImageButton btn_recent = (ImageButton) findViewById(R.id.main_btn_recent);
		btn_recent.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Story_d.this, Recent.class);
				startActivity(intent);
				System.gc();
				Story_d.this.finish();
			}
		});
		
		ImageButton btn_life = (ImageButton) findViewById(R.id.main_btn_life);
		btn_life.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				intent.putExtras(bundle);
				intent.setClass(Story_d.this, Life.class);
				startActivity(intent);
				System.gc();
				Story_d.this.finish();
			}
		});

	}
	
	private void readString(){
		Resources res = Story_d.this.getResources();
		//moodstrs = res.getStringArray(R.array.storymood);
		//familystrs = res.getStringArray(R.array.storyfamily);
		//growstrs = res.getStringArray(R.array.storygrow);
	}

	private class pagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			if (type.equals("mood"))
				return moodstrs.length;
			if (type.equals("family"))
				return familystrs.length;
			if (type.equals("grow"))
				return growstrs.length;
			return 0;
		}

		/**
		 * Create the page for the given position. The adapter is responsible
		 * for adding the view to the container given here, although it only
		 * must ensure this is done by the time it returns from
		 * {@link #finishUpdate()}.
		 * 
		 * @param container
		 *			The containing View in which the page will be shown.
		 * @param position
		 *			The page position to be instantiated.
		 * @return Returns an Object representing the new page. This does not
		 *		 need to be a View, but can be some other container of the
		 *		 page.
		 */
		@Override
		public Object instantiateItem(View collection, int position) {

			String pos = String.valueOf(position);
			//String filename = type + "story" + pos + ".txt";
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
			
			if (type.equals("mood"))
				cont.setText(moodstrs[position]);
			else if (type.equals("family"))
				cont.setText(familystrs[position]);
			else if (type.equals("grow"))
				cont.setText(growstrs[position]);
			
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
		 *			The containing View from which the page will be removed.
		 * @param position
		 *			The page position to be removed.
		 * @param object
		 *			The same object that was returned by
		 *			{@link #instantiateItem(View, int)}.
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
		 *			The containing View which is displaying this adapter's
		 *			page views.
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
