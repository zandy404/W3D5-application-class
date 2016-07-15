package com.mac.training.applicationapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class ServiceClass extends Service {

    private static final String TAG = "ServiceClass-->";

    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationApp.attr++;
        Log.d(TAG, "onCreate:, attr value=" + ApplicationApp.attr);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
