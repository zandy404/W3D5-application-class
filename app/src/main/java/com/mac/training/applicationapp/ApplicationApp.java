package com.mac.training.applicationapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class ApplicationApp extends Application {

    private static final String TAG = "ApplicationApp-->";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }


}
