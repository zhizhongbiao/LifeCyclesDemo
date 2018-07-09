package com.yf.lifecyclesdemo;

import android.arch.lifecycle.LifecycleObserver;

/**
 * Filename :  MyPresenter
 * Author   :  zhizhongbiao
 * Date     :  2018/7/9
 * Describe :
 */

public class MyPresenter
        implements LifecycleObserver
        , IPresenter {


    @Override
    public void onCreate() {
        LogUtils.e("MyPresenter  onCreate");
    }

    @Override
    public void onStart() {
        LogUtils.e("MyPresenter  onStart");
    }

    @Override
    public void onResume() {
        LogUtils.e("MyPresenter  onResume");
    }

    @Override
    public void onPause() {
        LogUtils.e("MyPresenter  onPause");
    }

    @Override
    public void onStop() {
        LogUtils.e("MyPresenter  onStop");
    }

    @Override
    public void onDestroy() {
        LogUtils.e("MyPresenter  onDestroy");
    }


}
