package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class HomeChatActivity extends AppCompatActivity {
    private RelativeLayout rl_chat1;
    private ImageView imgset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
        rl_chat1 = findViewById(R.id.RoomChat1);
        rl_chat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, RoomChatActivity.class);
                startActivity(chat);
            }
        });
    }
}