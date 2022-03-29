package com.example.login;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;

public class Cursor_Adapter extends CursorAdapter {
    public Cursor_Adapter(Context context, Cursor c){
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.list, viewGroup, false);

        return v;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
}
