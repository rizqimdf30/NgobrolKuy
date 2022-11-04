package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText et_username,et_pass;
    private CardView cv_login;
    private TextView tv_regis;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_username = findViewById(R.id.user);
        et_pass = findViewById(R.id.pass);
        cv_login = findViewById(R.id.login);
        tv_regis = findViewById(R.id.regis);
        cv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = et_username.getText().toString();
                String password = et_pass.getText().toString();
                Intent login = new Intent(LoginActivity.this, ProfilePicActivity.class);
                login.putExtra("username",uname);
                login.putExtra("password",password);
                startActivity(login);
            }
        }
        );
        tv_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(regis);
            }
        });
        };
}