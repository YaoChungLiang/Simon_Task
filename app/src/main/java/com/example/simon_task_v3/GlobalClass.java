package com.example.simon_task_v3;

import android.app.Application;

public class GlobalClass extends Application {
    public static final int maxTestRounds = 4;
    public static final int maxPracticeRounds = 4;
    public static int curTestRounds = 0;
    public static int curPracticeRounds = 0;
    public static String record;

}
