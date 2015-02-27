package com.cybob.android.sourcetreetest;

import android.app.ActionBar;
import android.app.Activity;

import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getActionBar();
        ab.setElevation(15.0f);


        Log.i(TAG, " some log");
    }

}
