package com.example.simon_task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int maxFixationRounds = 8;
    int maxTrialFounds = 10;
    int curFixationRounds = 0;
    int curTrialRounds = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("main", "onCreate");

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        TextView testIntro = (TextView)findViewById(R.id.test_intro);
        testIntro.setText(getString(R.string.test_intro));
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
        testIntro.setTextSize(pixels);
        Button startButton = (Button)findViewById(R.id.start_button);
        startButton.setText(getString(R.string.start_button));
    }

    public void startPractice(View v){
        Intent fixationIntent = new Intent(MainActivity.this, FixationActivity.class);
        finish();
        startActivity(fixationIntent);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("main","onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("main","onPause");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("main","OnStart");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("main", "onRestart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("main", "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("main", "onDestroy");

    }
}