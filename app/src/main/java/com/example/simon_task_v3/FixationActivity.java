package com.example.simon_task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class FixationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixation);
        getSupportActionBar().hide();
        Log.e("fix","OnCreate");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("fix","OnResume");
        CountDownTimer c = new CountDownTimer(3000, 3001) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                Intent trialIntent = new Intent(FixationActivity.this, TrialActivity.class);
                finish();
                startActivity(trialIntent);
            }
        };
        c.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("fix","onPause");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("fix","OnStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("fix", "onRestart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("fix", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("fix", "onDestroy");

    }
}