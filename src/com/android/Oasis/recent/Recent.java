package com.android.Oasis.recent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Context;
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

public class Recent extends Activity {

	String type;
	private static int NUM_RAIN = 3;
	private static int NUM_WORM = 7;
	private static int NUM_LEAF = 3;
	private static int NUM_SICK = 3;

	private ViewPager viewPager;
	private Context cxt;
	private pagerAdapter pageradapter;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.recent);
		cxt = this;
		type = "rain";

		pageradapter = new pagerAdapter();
		viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(pageradapter);

		ImageButton btn_rain = (ImageButton) findViewById(R.id.recent_btn_rain);
		btn_rain.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "rain";
				viewPager.setAdapter(pageradapter);
			}
		});

		ImageButton btn_worm = (ImageButton) findViewById(R.id.recent_btn_worm);
		btn_worm.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "worm";
				viewPager.setAdapter(pageradapter);
			}
		});
		
		ImageButton btn_leaf = (ImageButton) findViewById(R.id.recent_btn_leaf);
		btn_leaf.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "leaf";
				viewPager.setAdapter(pageradapter);
			}
		});
		
		ImageButton btn_sick = (ImageButton) findViewById(R.id.recent_btn_sick);
		btn_sick.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				type = "sick";
				viewPager.setAdapter(pageradapter);
			}
		});

	}

	private class pagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			if (type.equals("rain"))
				return NUM_RAIN;
			if (type.equals("worm"))
				return NUM_WORM;
			if (type.equals("leaf"))
				return NUM_LEAF;
			if (type.equals("sick"))
				return NUM_SICK;
			return NUM_RAIN;
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
			String filename = type + pos + ".txt";
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
