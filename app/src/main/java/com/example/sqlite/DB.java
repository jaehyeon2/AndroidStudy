package com.example.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DB extends SQLiteOpenHelper {


    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER_INFO (_id INTEGER PRIMARY KEY AUTOINCREMENT, user_ID TEXT, user_PW TEXT, Name TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(String Name, String user_ID, String user_PW) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO USER_INFO VALUES(null, '" + user_ID + "', " + user_PW + ", '" + Name + "');");
        db.close();
    }

    public void update(String user_ID, String user_PW) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("UPDATE USER_INFO SET user_PW=" + user_PW + " WHERE user_ID='" + user_ID + "';");
        db.close();
    }

    public void delete(String user_ID) {
        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("DELETE FROM MONEYBOOK WHERE user_ID='" + user_ID + "';");
        db.close();
    }

    public String getResult() {
        SQLiteDatabase db = getReadableDatabase();
        String Result = "";

        Cursor cursor = db.rawQuery("SELECT * FROM USER_INFO", null);
        while(cursor.moveToNext()) {
            Result += cursor.getString(0)
                    + " : "
                    + cursor.getString(3)
                    + " | "
                    + "userID:"
                    + cursor.getInt(1)
                    + " / "
                    + "userPW"
                    + cursor.getString(2)
                    + "\n";
        }
        return Result;
    }
}
