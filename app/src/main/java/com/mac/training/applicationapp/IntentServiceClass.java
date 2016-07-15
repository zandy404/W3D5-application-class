package com.mac.training.applicationapp;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class IntentServiceClass extends IntentService {
    private static final String TAG = "IntentServiceClass-->";

    public IntentServiceClass() {
        super("IntentServiceClass");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        ApplicationApp.attr++;
        Log.d(TAG, "onHandleIntent:, attr " + ApplicationApp.attr+ ", Thread:" + Thread.currentThread().toString());
    }
}
