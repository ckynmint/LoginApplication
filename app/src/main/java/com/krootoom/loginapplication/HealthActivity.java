package com.krootoom.loginapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class HealthActivity extends AppCompatActivity {

    private LinearLayout health;
    private TextView tvhealth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        health = (LinearLayout)findViewById(R.id.health);
        tvhealth = (TextView)findViewById(R.id.tvhealth);

        health.setOnClickListener(OnClickhealthListener);
    }
    private View.OnClickListener OnClickhealthListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvhealth.setText("สุขภาพดี");
        }
    };
}
