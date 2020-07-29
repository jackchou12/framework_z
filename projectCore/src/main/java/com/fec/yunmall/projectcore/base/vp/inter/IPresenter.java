package com.fec.yunmall.projectcore.base.vp.inter;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;


public interface IPresenter<V extends IView> extends LifecycleObserver {

    /**
     * 创建view时调用  调用在initView 之后
     * @param view
     */
    void attachView(V view);

    /**
     * view销毁时调用释放资源
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void detachView();

    Context getContext();

}
