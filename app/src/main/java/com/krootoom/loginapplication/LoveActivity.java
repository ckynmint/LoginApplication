package com.krootoom.loginapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LoveActivity extends AppCompatActivity {

    private LinearLayout Love;
    private TextView tvresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

        Love = (LinearLayout)findViewById(R.id.Love);
        tvresult = (TextView)findViewById(R.id.tvresult);

        Love.setOnClickListener(OnClickLoveListener);
    }
    private View.OnClickListener OnClickLoveListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tvresult.setText("แฟนรักแฟนหลง");
        }
    };
}

