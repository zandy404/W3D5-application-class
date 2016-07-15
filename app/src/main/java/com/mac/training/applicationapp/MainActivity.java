package com.mac.training.applicationapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity-->";

    public void clickService(View view) {
        Intent intent = new Intent(this, IntentServiceClass.class);
        startService(intent);
    }

    // Method to start the service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), ServiceClass.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), ServiceClass.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationApp.attr++;
        Log.d(TAG, "onCreate: 1, attr value=" + ApplicationApp.attr+ ", Thread:" + Thread.currentThread().toString());

        Intent intent = new Intent(this, ServiceClass.class);
        startService(intent);

        Intent intent2 = new Intent(this, IntentServiceClass.class);
        startService(intent2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 2"+ ", Thread:" + Thread.currentThread().toString());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: 6"+ ", Thread:" + Thread.currentThread().toString());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 5"+ ", Thread:" + Thread.currentThread().toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: 3"+ ", Thread:" + Thread.currentThread().toString());

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: 4"+ ", Thread:" + Thread.currentThread().toString());
    }

    public void startActivity(View view) {
        Intent intent = new Intent(this, ImageActivity.class);
        startActivity(intent);
    }
}
