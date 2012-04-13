package com.android.Oasis.story;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.Oasis.R;
import com.android.Oasis.diary.OldDiary;
import com.android.Oasis.life.Life;
import com.android.Oasis.recent.Recent;

public class Story extends Activity {

	String type;
	private static int NUM_MOOD = 9;
	private static int NUM_FAMILY = 2;
	private static int NUM_GROW = 8;

	private ViewPager viewPager;
	private Context cxt;
	private pagerAdapter pageradapter;

	Intent intent = new Intent();
	Bundle bundle = new Bundle();
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.story);
		cxt = this;
		type = "mood";

		bundle = this.getIntent().getExtras();
		
		pageradapter = new pagerAdapter();
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(pageradapter);

		ImageButton btn_mood = (ImageButton) findViewById(R.id.story_btn_mood);
		btn_mood.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "mood";
				viewPager.setAdapter(pageradapter);
			}
		});

		ImageButton btn_family = (ImageButton) findViewById(R.id.story_btn_family);
		btn_family.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "family";
				viewPager.setAdapter(pageradapter);
			}
		});

		ImageButton btn_grow = (ImageButton) findViewById(R.id.story_btn_grow);
		btn_grow.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "grow";
				viewPager.setAdapter(pageradapter);
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
				intent.putExtras(bundle);
				intent.setClass(Story.this, Life.class);
				startActivity(intent);
				System.gc();
				Story.this.finish();
			}
		});

	}

	private class pagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			if (type.equals("mood"))
				return NUM_MOOD;
			if (type.equals("family"))
				return NUM_FAMILY;
			if (type.equals("grow"))
				return NUM_GROW;
			return NUM_MOOD;
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
			String filename = type + "story" + pos + ".txt";
			String contentStr = "";

			ScrollView sv = new ScrollView(cxt);

			LinearLayout ll = new LinearLayout(cxt);
			ll.setOrientation(LinearLayout.VERTICAL);

			TextView tv = new TextView(cxt);
			tv.setText("This is page # " + position);
			tv.setTextColor(Color.WHITE);
			tv.setTextSize(30);

			ll.addView(tv);

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
					cont.setTextColor(Color.WHITE);
					cont.setTextSize(20);
					cont.setText(contentStr);
					ll.addView(cont);

				}
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

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

}
