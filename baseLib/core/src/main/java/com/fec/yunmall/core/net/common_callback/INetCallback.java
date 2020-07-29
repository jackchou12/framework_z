package com.fec.yunmall.core.net.common_callback;



/**
 * @Created by  .
 * @时间 2018/5/31 15:54
 * @描述 ${网络请求成功回调}
 */
@FunctionalInterface
public interface INetCallback<T> {

   void onSuccess(T result);


}

