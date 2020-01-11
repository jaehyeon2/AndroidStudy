package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button add_btn, sub_btn, mul_btn, div_btn;
    EditText num1, num2;
    int Res;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_btn = findViewById(R.id.add);
        sub_btn = findViewById(R.id.sub);
        mul_btn = findViewById(R.id.mul);
        div_btn = findViewById(R.id.div);

        Result = findViewById(R.id.result);
        num1 = findViewById(R.id.first_num);
        num2 = findViewById(R.id.second_num);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
                Result.setText(Integer.toString(Res));
            }
        });
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
                Result.setText(Integer.toString(Res));
            }
        });
        mul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
                Result.setText(Integer.toString(Res));
            }
        });
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
                Result.setText(Integer.toString(Res));
            }
        });
    }

}
