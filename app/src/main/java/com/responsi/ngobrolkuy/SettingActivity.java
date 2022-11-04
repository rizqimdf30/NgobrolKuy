package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {
    private Button gantipass,gantiprofile,kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        gantipass = findViewById(R.id.gantipass);
        gantiprofile = findViewById(R.id.gantiprofile);
        kembali = findViewById(R.id.kembali);

        getSupportActionBar().hide();

        gantipass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SettingActivity.this, ChangePasswordActivity.class);
                startActivity(pindah);
            }
        });

        gantiprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SettingActivity.this, ChangeProfileActivity.class);

            }
        });

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(SettingActivity.this, HomeChatActivity.class);
                startActivity(pindah);
            }
        });

    }
}