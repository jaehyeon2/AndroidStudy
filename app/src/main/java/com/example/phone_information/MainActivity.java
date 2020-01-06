package com.example.phone_information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String ModelNumber, Board, Brand, Display, FingerPrint, ID, TAGS, Type;
    String AndroidVersion, APILevel, CodeName, INCREMENTAL;

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelNumber = Build.MODEL;
        Board = Build.BOARD;
        Brand = Build.BRAND;
        Display = Build.DISPLAY;
        FingerPrint = Build.FINGERPRINT;
        ID = Build.ID;
        TAGS = Build.TAGS;
        Type = Build.TYPE;

        AndroidVersion = Build.VERSION.RELEASE;
        APILevel = Build.VERSION.SDK;
        CodeName = Build.VERSION.CODENAME;
        INCREMENTAL = Build.VERSION.INCREMENTAL;

        text = findViewById(R.id.textview);

        text.setText(Html.fromHtml("Phone Type" +
                "<br/><br/>MODEL NUMBER:" + ModelNumber
                +"<br/> Borad:" + Board
                +"<br/> Display:" + Display
                +"<br/> FingerPrint:" + Display
                +"<br/> ID:" + ID
                +"<br/> Tags:" + TAGS
                +"<br/> Type:" + Type

                +"<br/> Android Version:" + AndroidVersion
                +"<br/> APILevel:" + APILevel
                +"<br/> CodeName:" + CodeName
                +"<br/> INCREMENTAL:" + INCREMENTAL));

    }
}
