package com.mac.training.applicationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity-->";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 2");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 6");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 5");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 3");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 4");
    }
}
