package com.example.simon_task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class TrialActivity extends AppCompatActivity {

    private ImageView mImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("trial","OnCreate");
        setContentView(R.layout.activity_trial);
        getSupportActionBar().hide();
        GlobalClass.curTestRounds += 1;
        setVisImg();
        CountDownTimer c = new CountDownTimer(3000, 3001) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                if(GlobalClass.curTestRounds == GlobalClass.maxTestRounds){
                    Intent endIntent = new Intent(TrialActivity.this, EndActivity.class);
                    finish();
                    startActivity(endIntent);
                }else{
                    Intent fixationIntent = new Intent(TrialActivity.this, FixationActivity.class);
                    finish();
                    startActivity(fixationIntent);
                }
            }
        };
        c.start();
    }

    public void setVisImg(){
        // hide all images
        for(int i = 0 ; i < 4 ; i++) {
            mImg = (ImageView) findViewById(getResources().getIdentifier("imageView" + i,
                    "id", getPackageName()));
            mImg.setVisibility(View.INVISIBLE);
        }
        mImg = (ImageView) findViewById(getResources().getIdentifier("imageView" +(GlobalClass.curTestRounds % 4),
                "id", getPackageName()));
        mImg.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("trial","onResume");

    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.e("trial","onPause");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("trial","OnStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("trial", "onRestart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("trial", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("trial", "onDestroy");

    }
}