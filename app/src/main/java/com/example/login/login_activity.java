package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        final Button login_btn = findViewById(R.id.login);
        Button signup_btn = findViewById(R.id.signup);
        final EditText login_id_ = findViewById(R.id.login_ID);
        final EditText login_pw_ = findViewById(R.id.login_PW);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(login_id_.length()==0) {
                    Toast.makeText(getApplicationContext(), "ID를 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(login_pw_.length()==0) {
                    Toast.makeText(getApplicationContext(), "PW를 입력해주세요", Toast.LENGTH_SHORT).show();
                    return;
                }
                else{
                    Intent login_ = new Intent(login_activity.this, app_main.class);
                    startActivity(login_);
                    finish();
                    Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup_ = new Intent(login_activity.this, signup_activity.class);
                startActivity(signup_);
                finish();
            }
        });

    }
}
