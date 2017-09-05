package com.shawn.wordshelper;

import android.app.Application;

import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Shawn on 17/8/23.
 */

public class WhelperApplication extends Application {

    @Override
    public void onCreate() {

        SpeechUtility.createUtility(WhelperApplication.this, "appid=" + "599d43a");
        super.onCreate();
    }
}
