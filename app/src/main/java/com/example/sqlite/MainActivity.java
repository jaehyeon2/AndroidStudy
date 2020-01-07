package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DB db = new DB(getApplicationContext(), "UserInfo.db", null, 1 );

        final EditText ETName = findViewById(R.id.user_Name_);
        final EditText ETID = findViewById(R.id.user_ID_);
        final EditText ETPW = findViewById(R.id.user_PW_);

        final TextView Result = findViewById(R.id.result);

        //DB insert
        Button insert = findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = ETName.getText().toString();
                String ID = ETID.getText().toString();
                String PW = ETPW.getText().toString();

                db.insert(name, ID, PW);
                Result.setText(db.getResult());
            }
        });

        //DB update
        Button update = findViewById(R.id.update);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ID = ETID.getText().toString();
                String PW = ETPW.getText().toString();

                db.update(ID, PW);
                Result.setText(db.getResult());
            }
        });

        //DB delete
        Button delete = findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ID = ETID.getText().toString();

                db.delete(ID);
                Result.setText(db.getResult());
            }
        });

        Button select = findViewById(R.id.select);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(db.getResult());
            }
        });
    }
}
