package com.mac.training.applicationapp;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkReceiver extends BroadcastReceiver {
    private static final String TAG = "NetworkReceiver -->";

    public NetworkReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
//        throw new UnsupportedOperationException("Not yet implemented");

        Log.d(TAG, "onReceive: ");
        Intent intent2 = new Intent (context, IntentServiceClass.class);
        context.startService(intent2);
        Toast.makeText(context, "Network changed", Toast.LENGTH_LONG).show();
        Toast.makeText(context, "My context: " + context.getApplicationContext().toString() + Thread.currentThread(), Toast.LENGTH_LONG).show();
        ApplicationApp.attr++;
        Log.d(TAG, "onReceive: , attr " + ApplicationApp.attr+ ", Thread:" + Thread.currentThread().toString());

    }
}
