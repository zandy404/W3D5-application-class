package com.mac.training.applicationapp;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class ApplicationApp extends Application {

    private static final String TAG = "ApplicationApp-->";
    public static int attr = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        attr++;
        Log.d(TAG, "onCreate: , attr value=" + attr);

    }


}
