/*
 * Copyright 2010 Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.Oasis;

import java.io.IOException;
import java.net.MalformedURLException;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.android.Oasis.SessionEvents.AuthListener;
import com.android.Oasis.SessionEvents.LogoutListener;
import com.android.Oasis.diary.BrowseDiary;
import com.android.Oasis.diary.NewDiary;
import com.facebook.android.DialogError;
import com.facebook.android.Facebook;
import com.facebook.android.Facebook.DialogListener;
import com.facebook.android.FacebookError;

public class LoginButton extends ImageButton {

	private String TAG = "mLoginButton";

	private Facebook mFb;
	private Handler mHandler;
	private SessionListener mSessionListener = new SessionListener();
	private String[] mPermissions;
	private Activity mActivity;
	private int FROMWHERE = 1;

	public LoginButton(Context context) {
		super(context);
	}

	public LoginButton(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public LoginButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}

	public void init(final Activity activity, final Facebook fb, int from) {
		init(activity, fb, new String[] { "manage_pages", "publish_stream" }, from);
	}

	public void init(final Activity activity, final Facebook fb,
			final String[] permissions, int from) {

		Log.e(TAG, "LoginButton init");

		mActivity = activity;
		mFb = fb;
		mPermissions = permissions;
		mHandler = new Handler();
		FROMWHERE = from;

		setBackgroundColor(Color.TRANSPARENT);
		setAdjustViewBounds(true);
		// setImageResource(fb.isSessionValid() ?
		// R.drawable.logout_button :
		// R.drawable.login_button);
		// drawableStateChanged();

		SessionEvents.addAuthListener(mSessionListener);
		SessionEvents.addLogoutListener(mSessionListener);
		setOnClickListener(new ButtonOnClickListener());
	}

	private final class ButtonOnClickListener implements OnClickListener {

		public void onClick(View arg0) {
			for (String s : mPermissions) {
				Log.e(TAG, "permissons " + s);
			}

			Log.e(TAG, "onClick ");

			/*
			 * if (mFb.isSessionValid()) { // SessionEvents.onLogoutBegin(); //
			 * AsyncFacebookRunner asyncRunner = new //
			 * AsyncFacebookRunner(mFb); // asyncRunner.logout(getContext(), new
			 * // LogoutRequestListener()); } else { mFb.authorize(mActivity,
			 * mPermissions, new LoginDialogListener()); }
			 */

			mFb.authorize(mActivity, new String[] { "manage_pages", "read_stream",
					"publish_stream" , "photo_upload"}, new DialogListener() {
				@Override
				public void onComplete(Bundle values) {

					String access_token = (String) values.get("access_token");
					mFb.setAccessToken(access_token);
					Log.d(TAG, values.toString());
					Log.d(TAG, "access_token = " + access_token);

					if (FROMWHERE == 1) {
						Log.e(TAG + " onComplete", "NewDiary before post");
						((NewDiary) LoginButton.this.getContext()).sendPost();
					}
					else if (FROMWHERE == 2) {
						Log.e(TAG + " onComplete", "BrowseDiary before post");
						((BrowseDiary) LoginButton.this.getContext()).sendPost();
					}

				}

				@Override
				public void onFacebookError(FacebookError error) {
					Log.d(TAG, "FB onFacebookError" + error.toString());
				}

				@Override
				public void onError(DialogError e) {
					Log.d(TAG, "FB onError" + e.toString());

				}

				@Override
				public void onCancel() {
					Log.d(TAG, "FB onCancel");

				}
			});
			Log.e(TAG, "after mFb.authorize()");
			// mFb.authorize(mActivity, mPermissions,
			// new LoginDialogListener());
		}
	}

	private final class LoginDialogListener implements DialogListener {
		public void onComplete(Bundle values) {
			Log.e(TAG, "onComplete");
			SessionEvents.onLoginSuccess();
		}

		public void onFacebookError(FacebookError error) {
			Log.e(TAG, "onFacebookError" + error.toString());
			SessionEvents.onLoginError(error.getMessage());
		}

		public void onError(DialogError error) {
			Log.e(TAG, "DialogError" + error.toString());
			SessionEvents.onLoginError(error.getMessage());
		}

		public void onCancel() {
			Log.e(TAG, "onCancel");
			SessionEvents.onLoginError("Action Canceled");
		}
	}

	private class LogoutRequestListener extends BaseRequestListener {
		public void onComplete(String response, final Object state) {
			// callback should be run in the original thread,
			// not the background thread
			mHandler.post(new Runnable() {
				public void run() {
					SessionEvents.onLogoutFinish();
				}
			});
		}
	}

	private class SessionListener implements AuthListener, LogoutListener {

		public void onAuthSucceed() {
			setImageResource(R.drawable.logout_button);
			SessionStore.save(mFb, getContext());
		}

		public void onAuthFail(String error) {
		}

		public void onLogoutBegin() {
		}

		public void onLogoutFinish() {
			SessionStore.clear(getContext());
			setImageResource(R.drawable.login_button);
		}
	}

}
