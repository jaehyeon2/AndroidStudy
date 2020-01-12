package com.example.calculator_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //사칙연산 파악을 위한 type
    int type;
    int PLUS = 0, MINUS = 1, MULTIPLY = 2, DIVIDE = 3;
    String history="";
    String number1="";
    String number2="";
    double d1,d2;


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
        final Button equal= findViewById(R.id.equals);

        final Button plus = findViewById(R.id.plus);
        final Button minus = findViewById(R.id.minus);
        final Button multiply = findViewById(R.id.multiply);
        final Button divide = findViewById(R.id.divide);

        final Button delete = findViewById(R.id.delete);
        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress.setText("");
                result.setText("");

            }
        });

        Button.OnClickListener mListener = new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (progress == null){
                    Toast.makeText(MainActivity.this, "수를 입력하세요", Toast.LENGTH_LONG).show();
                    return;
                }
                switch (v.getId()) {
                    case R.id.plus:
                        number1 = result.getText().toString();
                        history = result.getText().toString()+" + ";
                        progress.setText(history);
                        result.setText("");

                        type = PLUS;
                        break;

                    case R.id.minus:
                        number1 = result.getText().toString();
                        history = result.getText().toString()+" - ";
                        progress.setText(history);
                        result.setText("");

                        type = MINUS;
                        break;

                    case R.id.multiply:
                        number1 = result.getText().toString();
                        history = result.getText().toString()+" × ";
                        progress.setText(history);
                        result.setText("");

                        type = MULTIPLY;
                        break;

                    case R.id.divide:
                        number1 = result.getText().toString();
                        history = result.getText().toString()+" ÷ ";
                        progress.setText(history);
                        result.setText("");

                        type = DIVIDE;
                        break;

                    case R.id.delete:
                        String del = result.getText().toString();
                        Toast.makeText(MainActivity.this, del, Toast.LENGTH_SHORT).show();
                        result.setText(del.substring(0,del.length() - 1));
                        break;

                    case R.id.result :
                        double db_result = 0;
                        Toast.makeText(MainActivity.this, "결과", Toast.LENGTH_SHORT).show();
                        number2 = result.getText().toString();
                        history = history + result.getText().toString();
                        progress.setText(history);

                        d1 = Double.parseDouble(number1);
                        d2 = Double.parseDouble(number2);

                        if(type == PLUS) {
                            db_result = d1 + d2;
                            result.setText("" + db_result);
                        } else if (type == MINUS) {
                            db_result = d1 - d2;
                            result.setText("" + db_result);
                        }else if (type == MULTIPLY) {
                            db_result = d1 * d2;
                            result.setText("" + db_result);
                        }else if (type == DIVIDE) {
                            db_result = d1 / d2;
                            result.setText("" + db_result);
                        }/*else if (type == REMAINDER) {
                            result = d1 % d2;
                            et_result.setText("" + db_result);
                        }*/

                        number1 = result.getText().toString();
                        result.setText(number1);
                        break;

                    /*case R.id.num0 :
                        result.setText(result.getText().toString() + 0); break;
                    case R.id.num1 :
                        result.setText(result.getText().toString() + 1); break;
                    case R.id.num2 :
                        result.setText(result.getText().toString() + 2); break;
                    case R.id.num3 :
                        result.setText(result.getText().toString() + 3); break;
                    case R.id.num4 :
                        result.setText(result.getText().toString() + 4); break;
                    case R.id.num5 :
                        result.setText(result.getText().toString() + 5); break;
                    case R.id.num6 :
                        result.setText(result.getText().toString() + 6); break;
                    case R.id.num7 :
                        result.setText(result.getText().toString() + 7); break;
                    case R.id.num8 :
                        result.setText(result.getText().toString() + 8); break;
                    case R.id.num9 :
                        result.setText(result.getText().toString() + 9); break;
                    case R.id.point :
                        result.setText(result.getText().toString() + "."); break;*/
                }
            }
        };

        Button.OnClickListener number = new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.num0 :
                        result.setText(result.getText().toString() + 0); break;
                    case R.id.num1 :
                        result.setText(result.getText().toString() + 1); break;
                    case R.id.num2 :
                        result.setText(result.getText().toString() + 2); break;
                    case R.id.num3 :
                        result.setText(result.getText().toString() + 3); break;
                    case R.id.num4 :
                        result.setText(result.getText().toString() + 4); break;
                    case R.id.num5 :
                        result.setText(result.getText().toString() + 5); break;
                    case R.id.num6 :
                        result.setText(result.getText().toString() + 6); break;
                    case R.id.num7 :
                        result.setText(result.getText().toString() + 7); break;
                    case R.id.num8 :
                        result.setText(result.getText().toString() + 8); break;
                    case R.id.num9 :
                        result.setText(result.getText().toString() + 9); break;
                    case R.id.point :
                        result.setText(result.getText().toString() + "."); break;
                }

            }

        };


        num0.setOnClickListener(number);
        num1.setOnClickListener(number);
        num2.setOnClickListener(number);
        num3.setOnClickListener(number);
        num4.setOnClickListener(number);
        num5.setOnClickListener(number);
        num6.setOnClickListener(number);
        num7.setOnClickListener(number);
        num8.setOnClickListener(number);
        num9.setOnClickListener(number);

        plus.setOnClickListener(mListener);
        minus.setOnClickListener(mListener);
        multiply.setOnClickListener(mListener);
        divide.setOnClickListener(mListener);
        //remainder.setOnClickListener(mListener);
        result.setOnClickListener(mListener);
        delete.setOnClickListener(mListener);






    }
}
