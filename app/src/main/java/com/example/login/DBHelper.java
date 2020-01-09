package com.example.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public DBHelper(View.OnClickListener context) {
        super((Context) context, "USER_TABLE", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String USER_TABLE = "CREATE TABLE USER_TABLE"
                + "(_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "user_Name,"
                + "user_ID,"
                + "user_PW)";
        db.execSQL(USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String Name, String user_ID, String user_PW) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO USER_INFO VALUES(null, '" + user_ID + "', " + user_PW + ", '" + Name + "');");
        db.close();
    }
    public void update(String Name, String user_ID, String user_PW) {

    }
}
