package com.example.simon_task_java_header;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                             WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        TextView testIntro = (TextView)findViewById(R.id.test_intro);
        testIntro.setText(getString(R.string.test_intro));
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
        testIntro.setTextSize(pixels);
        Button startButton = (Button)findViewById(R.id.start_button);
        startButton.setText(getString(R.string.start_button));

    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    public void startPractice(View v){
        Intent practiceIntent = new Intent(MainActivity.this, PracticeActivity.class);
        practiceIntent.putExtra("SESSION","practice");
        startActivity(practiceIntent);
    }



}