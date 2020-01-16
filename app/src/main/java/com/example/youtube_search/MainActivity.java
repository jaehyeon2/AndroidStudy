package com.example.youtube_search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    String search_str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText search = findViewById(R.id.Search);

        final Button s_btn = findViewById(R.id.S_button);

        s_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_str = "http://youtube.com/results?search_query=" + search.getText().toString();
                Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse(search_str));
                startActivity(search);
            }
        });
    }
}
