package com.wzt.sun.alliance.activity;

import android.app.Activity;
import android.os.Bundle;

import com.wzt.sun.alliance.R;

/**
 * Created by Administrator on 2015/11/28 0028.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        initView();
        loadData();
    }

    public void initView(){

    }

    public void loadData(){

    }
}
