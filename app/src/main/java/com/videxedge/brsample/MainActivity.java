package com.videxedge.brsample;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    BroadcastBatt broadcastBatt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcastBatt = new BroadcastBatt();
    }

    @Override
    protected void onResume() {
        super.onResume();

        registerReceiver(broadcastBatt, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(broadcastBatt);
    }
}
