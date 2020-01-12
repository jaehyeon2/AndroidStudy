package com.example.calculator_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText progress = findViewById(R.id.progress);
        final EditText result = findViewById(R.id.result);
        final Button equal = findViewById(R.id.equals);

        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiply = findViewById(R.id.multiply);
        final Button divide = findViewById(R.id.divide);

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
