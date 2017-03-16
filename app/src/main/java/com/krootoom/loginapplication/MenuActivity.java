package com.krootoom.loginapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    private ImageButton imgbtnProfile;
    private ImageButton imgbtnLove;
    private ImageButton imgbtnHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        imgbtnProfile = (ImageButton)findViewById(R.id.imgbtnProfile);
        imgbtnLove = (ImageButton)findViewById(R.id.imgbtnLove);
        imgbtnHealth = (ImageButton)findViewById(R.id.imgbtnHealth);

        imgbtnProfile.setOnClickListener(OnClickSumitListener);
        imgbtnLove.setOnClickListener(OnClickSumitLoveListener);
        imgbtnHealth.setOnClickListener(OnClickSumitHealthListener);
    }
    private View.OnClickListener OnClickSumitListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),DetailActivity.class);
            startActivity(i);
        }
    };
    private View.OnClickListener OnClickSumitLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),LoveActivity.class);
            startActivity(i);
        }
    };
    private View.OnClickListener OnClickSumitHealthListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),HealthActivity.class);
            startActivity(i);
        }
    };
}
