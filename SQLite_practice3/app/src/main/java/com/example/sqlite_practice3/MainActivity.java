package com.example.sqlite_practice3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DBhelper dBhelper = new DBhelper(getApplicationContext(), "MONEYBOOK.db", null, 1);

        final TextView result = findViewById(R.id.result);
        final EditText etDate = findViewById(R.id.date);
        final EditText etItem = findViewById(R.id.item);
        final EditText etPrice = findViewById(R.id.price);

        Long now = System.currentTimeMillis();
        Date date = new Date(now);
        //날짜 받아오기
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        etDate.setText(simpleDateFormat.format(date));

        //insert(추가) 버튼 동작
        Button insert = findViewById(R.id.insert);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = etDate.getText().toString();
                String item = etItem.getText().toString();
                int price = Integer.parseInt(etPrice.getText().toString());

                dBhelper.insert(date, item, price);
                result.setText(dBhelper.getResult());
            }
        });

        //update(수정) 버튼 동작
        Button update = findViewById(R.id.update);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = etItem.getText().toString();
                int price = Integer.parseInt(etPrice.getText().toString());
                dBhelper.update(item, price);
                result.setText(dBhelper.getResult());
            }
        });

        //delete(삭제) 버튼 동작
        Button delete = findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = etItem.getText().toString();
                dBhelper.delete(item);
                result.setText(dBhelper.getResult());
            }
        });

        //select(조회) 버튼 동작
        Button select = (Button) findViewById(R.id.select);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(dBhelper.getResult());
            }
        });


    }
}
