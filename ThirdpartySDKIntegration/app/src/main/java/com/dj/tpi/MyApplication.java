package com.dj.tpi;

import android.app.Application;

import cn.jiguang.jmlinksdk.api.JMLinkAPI;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        JMLinkAPI.getInstance().setDebugMode(true);
        JMLinkAPI.getInstance().init(getApplicationContext());
        JMLinkAPI.getInstance().registerWithAnnotation();//开启注解绑定
    }
}
