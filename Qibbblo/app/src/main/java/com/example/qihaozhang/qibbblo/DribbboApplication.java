package com.example.qihaozhang.qibbblo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by qihaozhang on 2017-04-17.
 */

public class DribbboApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
