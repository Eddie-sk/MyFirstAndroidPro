package com.example.sunkai.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String msg = "Android: ";

    /*当活动第一次被创建时调用*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreat() event");
    }

    /*当活动即将可见时调用*/
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");
    }

    /*当活动可见时调用*/
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }

    /*当其他活动获取焦点*/
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }

    /*当活动不可见时*/
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestory() event");
    }
}
