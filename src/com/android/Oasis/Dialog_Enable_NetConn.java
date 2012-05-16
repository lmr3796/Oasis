package com.android.Oasis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;

public class Dialog_Enable_NetConn extends AlertDialog.Builder {

	private final int NET_SETTING = 1234;
	private Activity parent;
	private String dialogTitle;

	public Dialog_Enable_NetConn(Activity act, String title) {
		super(act);
		this.parent = act;
		this.dialogTitle = title;
		getContent();
	}
	
	  private void launchNetConnOptions() {
		  
		  final Intent intent = new Intent(Intent.ACTION_MAIN, null);
          intent.addCategory(Intent.CATEGORY_LAUNCHER);
          final ComponentName cn = new ComponentName("com.android.settings", "com.android.settings.wifi.WifiSettings");
          intent.setComponent(cn);
          intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
          parent.startActivityForResult( intent , NET_SETTING);

	    }   
	
	
	private void getContent() {
		this.setTitle(dialogTitle);
		this.setPositiveButton("設定",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						/* User clicked OK so do some stuff */
						launchNetConnOptions();
//						parent.getParent().finish();
					}
				});

		this.setNegativeButton("取消",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						/* User clicked Cancel so do some stuff */
//						parent.finish();
					}
				});
	}
}