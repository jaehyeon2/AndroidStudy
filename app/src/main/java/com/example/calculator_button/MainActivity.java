package com.example.calculator_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    int a;
    int where = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button num0 = findViewById(R.id.num0);
        final Button num1 = findViewById(R.id.num1);
        final Button num2 = findViewById(R.id.num2);
        final Button num3 = findViewById(R.id.num3);
        final Button num4 = findViewById(R.id.num4);
        final Button num5 = findViewById(R.id.num5);
        final Button num6 = findViewById(R.id.num6);
        final Button num7 = findViewById(R.id.num7);
        final Button num8 = findViewById(R.id.num8);
        final Button num9 = findViewById(R.id.num9);

        final EditText progress = findViewById(R.id.progress);
        final EditText result = findViewById(R.id.result);
        final Button equal= findViewById(R.id.equal);

        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiply = findViewById(R.id.multiply);
        final Button divide = findViewById(R.id.divide);


        final Button clear = findViewById(R.id.Clear);

        View.OnClickListener btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==num0){
                    progress.setText(progress.getText().toString()+0);
                }
                else if(v==num1){
                    progress.setText(progress.getText().toString()+1);
                }
                else if(v==num2){
                    progress.setText(progress.getText().toString()+2);
                }
                else if(v==num3){
                    progress.setText(progress.getText().toString()+3);
                }
                else if(v==num4){
                    progress.setText(progress.getText().toString()+4);
                }
                else if(v==num5){
                    progress.setText(progress.getText().toString()+5);
                }
                else if(v==num6){
                    progress.setText(progress.getText().toString()+6);
                }
                else if(v==num7){
                    progress.setText(progress.getText().toString()+7);
                }
                else if(v==num8){
                    progress.setText(progress.getText().toString()+8);
                }
                else if(v==num9){
                    progress.setText(progress.getText().toString()+9);
                }

                else if(v==plus){
                    a=Integer.valueOf(progress.getText().toString().trim());
                    progress.setText("");
                    where=1;
                }
                else if(v==minus){
                    a=Integer.valueOf(progress.getText().toString().trim());
                    progress.setText("");
                    where=2;
                }
                else if(v==multiply){
                    a=Integer.valueOf(progress.getText().toString().trim());
                    progress.setText("");
                    where=3;
                }
                else if(v==divide){
                    a=Integer.valueOf(progress.getText().toString().trim());
                    progress.setText("");
                    where=4;
                }

                else if(v==result) {
                    if (where == 1) {
                        a = a + Integer.valueOf(progress.getText().toString());
                        progress.setText(Integer.toString(a));
                    }
                    else if(where==2){
                        a = a - Integer.valueOf(progress.getText().toString());
                        progress.setText(Integer.toString(a));
                    }
                    else if(where==3){
                        a = a * Integer.valueOf(progress.getText().toString());
                        progress.setText(Integer.toString(a));
                    }
                    else if(where==4){
                        a = a / Integer.valueOf(progress.getText().toString());
                        progress.setText(Integer.toString(a));
                    }
                }
                else if(v==clear){
                    progress.setText("");
                    a=0;
                }
            }
        };

        num0.setOnClickListener(btn_click);
        num1.setOnClickListener(btn_click);
        num2.setOnClickListener(btn_click);
        num3.setOnClickListener(btn_click);
        num4.setOnClickListener(btn_click);
        num5.setOnClickListener(btn_click);
        num6.setOnClickListener(btn_click);
        num7.setOnClickListener(btn_click);
        num8.setOnClickListener(btn_click);
        num9.setOnClickListener(btn_click);
        plus.setOnClickListener(btn_click);
        minus.setOnClickListener(btn_click);
        multiply.setOnClickListener(btn_click);
        divide.setOnClickListener(btn_click);
        clear.setOnClickListener(btn_click);
        equal.setOnClickListener(btn_click);

    }
}
