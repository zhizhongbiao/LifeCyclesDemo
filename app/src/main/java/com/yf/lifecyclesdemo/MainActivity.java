package com.yf.lifecyclesdemo;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.LifecycleRegistry;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements LifecycleOwner{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.e("MainActivity  onCreate");
        //不用SupportActivity就要调用该方法,并且是每一个对应的状态都对应一个或者多个生命周期，否则无效
        lifecycleRegistry.markState(Lifecycle.State.CREATED);
        getLifecycle().addObserver(new MyPresenter());
    }




    @Override
    public void onStart() {
        super.onStart();
        LogUtils.e("MainActivity  onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.e("MainActivity  onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.e("MainActivity  onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.e("MainActivity  onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.e("MainActivity  onDestroy");
    }

    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return lifecycleRegistry;
    }

    private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
}
