package com.example.recyclerview_practice1;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터 리스트 생성
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(String.format("TEXT %d", i+1));
        }

        /*addbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num++;
            }
        });

        dltbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                num--;
            }
        });*/


        //LinearLayoutManager 객체 지정
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView_Adapter adapter = new RecyclerView_Adapter(list);
        recyclerView.setAdapter(adapter);
    }
}
