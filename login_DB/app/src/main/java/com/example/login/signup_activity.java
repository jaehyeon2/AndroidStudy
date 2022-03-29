package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.login.DBHelper.DATABASE_VERSION;

public class signup_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        final DBHelper dbHelper = new DBHelper(getApplicationContext(), "USER_TABLE", null, DATABASE_VERSION);

        final Button fin_signup_btn = findViewById(R.id.signup_fin);
        final EditText signup_name_ = findViewById(R.id.signup_Name);
        final EditText signup_id_ = findViewById(R.id.signup_ID);
        final EditText signup_pw_ = findViewById(R.id.signup_PW);
        final EditText signup_pw2_ = findViewById(R.id.signup_PW2);

        final String name = signup_name_.getText().toString();
        final String ID = signup_id_.getText().toString();
        final String PW = signup_pw_.getText().toString();
        final String PW2 = signup_pw2_.getText().toString();

        fin_signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(signup_name_.length()==0) {
                    Toast.makeText(getApplicationContext(), "이름을 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(signup_id_.length()==0) {
                    Toast.makeText(getApplicationContext(), "ID를 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(signup_pw_.length()==0) {
                    Toast.makeText(getApplicationContext(), "PW를 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(signup_pw2_.length()==0) {
                    Toast.makeText(getApplicationContext(), "PW confirm을 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(PW.equals(PW2)) {

                    dbHelper.insert(name, ID, PW);

                    Intent signup_fin_ = new Intent(signup_activity.this, login_activity.class);
                    startActivity(signup_fin_);
                    finish();
                    Toast.makeText(getApplicationContext(), "가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "PW가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });

    }
}
