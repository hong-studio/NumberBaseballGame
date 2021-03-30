package com.hong_studio.numberbaseballgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoseActivity extends AppCompatActivity {

    TextView tvResume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        tvResume= findViewById(R.id.tv_resume);
        tvResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoseActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}