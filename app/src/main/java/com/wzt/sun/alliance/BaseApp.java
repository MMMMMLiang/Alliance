package com.wzt.sun.alliance;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class BaseApp extends Application {
    private static BaseApp app;

    public static BaseApp getInstance(){
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public void showToast(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    public void showLog(String tag, String msg){
        Log.i(tag, msg);
    }
}
