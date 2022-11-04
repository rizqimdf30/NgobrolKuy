package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ProfilePicActivity extends AppCompatActivity {

    private TextView tv_lewati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);
        tv_lewati = findViewById(R.id.lewat);
        tv_lewati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lewat = new Intent(ProfilePicActivity.this, ProfilePicActivity2.class);
                startActivity(lewat);
            }
        });
    }
}