package com.android.Oasis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class OasisActivity extends Activity {
	private final static int Msg_What_Animation_finish = 1;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        handler.sendEmptyMessageDelayed(Msg_What_Animation_finish, 2000);
        
    }
    
    private Handler handler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
			case Msg_What_Animation_finish:
				Intent intent = new Intent(OasisActivity.this, Main.class);
				OasisActivity.this.startActivity(intent);
				OasisActivity.this.finish();
				break;
			}
		}
	};
    
}

