package com.android.Oasis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class OasisActivity extends Activity {
	private final static int Msg_What_Animation_finish = 1;
	int hasClicked = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.index);

		LinearLayout ll = (LinearLayout) findViewById(R.id.index_bg);
		ll.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				hasClicked = 1;
				Intent intent = new Intent(OasisActivity.this, Main.class);
				OasisActivity.this.startActivity(intent);
				OasisActivity.this.finish();
			}

		});

		handler.sendEmptyMessageDelayed(Msg_What_Animation_finish, 2000);

	}

	private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case Msg_What_Animation_finish:
				if (hasClicked == 0) {
					Intent intent = new Intent(OasisActivity.this, Main.class);
					OasisActivity.this.startActivity(intent);
					OasisActivity.this.finish();
				}
				break;
			}
		}
	};

}
