package com.example.simon_task_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics());
        TextView testEnd = (TextView)findViewById(R.id.testEnd);
        testEnd.setTextSize(pixels);
        testEnd.setText(getString(R.string.end_test));

        Button endButton = (Button)findViewById(R.id.endButton);
        endButton.setText(getString(R.string.end_button));
        endButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
            }
        });
    }
}