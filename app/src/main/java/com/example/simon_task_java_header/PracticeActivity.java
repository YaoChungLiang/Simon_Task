package com.example.simon_task_java_header;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;


public class PracticeActivity extends AppCompatActivity{
    private static final long TRIAL_START_TIME_IN_MILLIS = 10000;
    private static final long FIXATION_START_TIME_IN_MILLIS = 800;
    private ImageView mImg;
    private TextView mFixation;
    private Button mSelectedButton;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTrialLeftTime = TRIAL_START_TIME_IN_MILLIS;
    private long mFixationLeftTime = FIXATION_START_TIME_IN_MILLIS;
    private String mRecord;
    private String mSession;
    private int mRounds;
    private int[] mOrders;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        mSession = getIntent().getStringExtra("SESSION");

        if(mSession.equals("practice")){
            mRounds = 8;
            mOrders = new int[]{1,2,3,4, 3,2,1,2};
        }else if(mSession.equals("test")){
            mRounds = 15;
            mOrders = new int[]{1,2,3,4,3, 2,1,2,3,4, 3,2,1,2,3};
        }else{
            Log.e("FAIL: wrong session", mSession);
        }
        getSupportActionBar().hide();
        hideAll();
        mFixation = (TextView)findViewById(R.id.fixationView);

    }

    @Override
    protected void onStart(){
        super.onStart();
        mFixation.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Handler handler = new Handler();
        for(int target : mOrders){
            Log.e("WARN: which round", ""+target);
            mFixation.setVisibility(View.VISIBLE);
            handler.postDelayed(new Runnable() {
                public void run() {
                    // Actions to do after 10 seconds
                    mFixation.setVisibility(View.INVISIBLE);
                }
            }, 1000);

//            startFixationTimer();
        };
    }

    @Override
    protected void onPause(){
        super.onPause();
        mFixation.setVisibility(View.VISIBLE);
    }

    public void hideAll(){
        // hide all images
        for(int i = 1 ; i < 5 ; i++){
            mImg = (ImageView)findViewById(getResources().getIdentifier("imageView"+i,
                    "id", getPackageName()));
            mImg.setVisibility(View.INVISIBLE);
        }
        //
        mSelectedButton = (Button)findViewById(R.id.buttonLeft);
        mSelectedButton.setVisibility(View.INVISIBLE);
        mSelectedButton = (Button)findViewById(R.id.buttonRight);
        mSelectedButton.setVisibility(View.INVISIBLE);
        mFixation = (TextView)findViewById(R.id.fixationView);
        mFixation.setVisibility(View.INVISIBLE);
    }

    private void startFixationTimer(){
        mCountDownTimer = new CountDownTimer(mFixationLeftTime, mFixationLeftTime) {
            @Override
            public void onTick(long millisUntilFinished) {
                mFixationLeftTime = millisUntilFinished;
            }

            @Override
            public void onFinish() {
                mFixation.setVisibility(View.INVISIBLE);
            }
        };
        mCountDownTimer.start();
        mFixation.setVisibility(View.VISIBLE);
    }

    private void startTrialTimer(){

    }

    private void resetFixationTimer(){
        mCountDownTimer.cancel();
    }

    private void resetTestTimer(){

    }

    private void pauseFixationTimer(){

    }


    private void updateRecord(){

    }

}
