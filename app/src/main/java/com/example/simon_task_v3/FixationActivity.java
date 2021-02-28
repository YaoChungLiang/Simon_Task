package com.example.simon_task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FixationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixation);
        getSupportActionBar().hide();
    }
}