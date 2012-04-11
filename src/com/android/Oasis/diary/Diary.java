package com.android.Oasis.diary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.Oasis.R;

public class Diary extends Activity {

	final int TAKE_PICTURE = 12345;
	final int SELECT_PICTURE = 54321;
	private Uri imageUri = null;
	private File tmpPhoto;
	private Uri pictureUri = null;
	boolean isFromAlbum = false;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diary);
		
		Bundle bundle;
		bundle = this.getIntent().getExtras();
		int plant = bundle.getInt("plant");

		ImageButton btn_new = (ImageButton) findViewById(R.id.diary_btn_new);
		btn_new.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				registerForContextMenu(arg0);
				openContextMenu(arg0);
			}
		});

	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		View view = LayoutInflater.from(v.getContext()).inflate(
				R.layout.ui_contextmenu_header, null);
		TextView txt_header = (TextView) view
				.findViewById(R.id.ui_contextmenu_headertextview);
		txt_header.setText("add new photo");
		menu.setHeaderView(view);
		menu.add(0, 0, 0, "album");
		menu.add(0, 1, 1, "take photo");
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		imageUri = null;
		if (item.getItemId() == 0) {
			Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
			intent.setType("image/*");
			startActivityForResult(intent, SELECT_PICTURE);
		} else if (item.getItemId() == 1) {
			Intent intent = new Intent(
					android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			tmpPhoto = new File(Environment.getExternalStorageDirectory(),
					System.currentTimeMillis() + ".png");
			intent.putExtra(android.provider.MediaStore.EXTRA_OUTPUT,
					Uri.fromFile(tmpPhoto));
			imageUri = Uri.fromFile(tmpPhoto);
			startActivityForResult(intent, TAKE_PICTURE);
		}
		return super.onContextItemSelected(item);
	}

	protected void makeDuplicatePicture(Uri originalUri) throws IOException,
			URISyntaxException {

		File cacheDir = getCacheDir(); // get cache dir
		File picture = new File(cacheDir.getAbsolutePath() + File.separator
				+ System.currentTimeMillis() + ".png"); // new file

		InputStream is = this.getContentResolver().openInputStream(originalUri);

		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		Bitmap bmp = BitmapFactory.decodeStream(is, null, options);

		int mySize = 800;
		if (options.outWidth <= mySize)
			options.inSampleSize = 1;
		else if (options.outWidth <= 2 * mySize)
			options.inSampleSize = 2;
		else if (options.outWidth <= 4 * mySize)
			options.inSampleSize = 4;
		else
			options.inSampleSize = 8;

		is = this.getContentResolver().openInputStream(originalUri);
		options.inJustDecodeBounds = false;
		bmp = BitmapFactory.decodeStream(is, null, options);

		// if (picture.exists()) { // delete old file in cache
		// picture.delete();
		// }
		FileOutputStream fos = new FileOutputStream(picture);
		bmp.compress(Bitmap.CompressFormat.JPEG, 85, fos);

		is.close();
		fos.close();

		pictureUri = Uri.fromFile(picture);

		/*
		 * if (isFromAlbum == false) {
		 * android.provider.MediaStore.Images.Media.insertImage(
		 * getContentResolver(), bmp, "", "");
		 * 
		 * sendBroadcast(new Intent(Intent.ACTION_MEDIA_MOUNTED,
		 * Uri.parse("file://" + Environment.getExternalStorageDirectory()))); }
		 */
	}

	void check() {
		if (pictureUri != null) {
			Bundle bundle = new Bundle();
			String tmp = pictureUri.toString();
			bundle.putString("uri", tmp);
			Intent intent = new Intent();
			intent.putExtras(bundle);
			intent.setClass(Diary.this, NewDiary.class);
			startActivity(intent);
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case TAKE_PICTURE:
			if (resultCode == Activity.RESULT_OK) {

				Uri selectedImage = imageUri;
				getContentResolver().notifyChange(selectedImage, null);
				isFromAlbum = false;
				System.gc(); // run gc for sure that there's enough memory to
				try {
					if (tmpPhoto.length() > 0l) {
						pictureUri = imageUri;
						makeDuplicatePicture(imageUri);
						tmpPhoto.delete();
					} else {
						makeDuplicatePicture(data.getData());
					}
				} catch (Exception e) {
					// Toast.makeText(this, R.string.toast_failedtoload,
					// Toast.LENGTH_SHORT).show();
				}

			}
			check();
			break;

		case SELECT_PICTURE:
			if (resultCode == Activity.RESULT_OK) {

				isFromAlbum = true;
				System.gc(); // run gc for sure that there's enough memory to
				try {
					makeDuplicatePicture(data.getData());
				} catch (IOException e) {
					break;
				} catch (URISyntaxException e) {
					break;
				}
			}
			check();
			break;
		case 1:
			// startActivity(intent);
			break;
		default:
			super.onActivityResult(requestCode, resultCode, data);

		}
	}

}
