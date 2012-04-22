package com.android.Oasis;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLite extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "list.db"; // 資料庫名稱
	private static final int DATABASE_VERSION = 1; // 資料庫版本

	private SQLiteDatabase db;
	public static final String TB_NAME = "mylist";

	public MySQLite(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		db = this.getWritableDatabase();
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		db.execSQL("CREATE TABLE IF NOT EXISTS " 
				+ TB_NAME + " ("
				+ "_ID INTEGER PRIMARY KEY," 
				+ "PLANT_TYPE INTEGER,"
				+ "FILE_PATH VARCHAR," 
				+ "DATE VARCHAR,"
				+ "THUMB_PATH VARCHAR,"
				+ "CONTENT TEXT )");

	}

	public Cursor getAll() {
		return db.rawQuery("SELECT * FROM " + TB_NAME, null);
	}

	public Cursor getPlant(int plant_type) {
		return db.rawQuery("SELECT * FROM " + TB_NAME + " WHERE PLANT_TYPE="
				+ plant_type, null);
	}

	public int delete(int db_id) {
		return db.delete(TB_NAME, // 資料表名稱
				"_ID=" + db_id, // WHERE
				null // WHERE的參數
				);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TB_NAME);
		onCreate(db);
	}
}