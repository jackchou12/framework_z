package com.fec.yunmall.mall;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * @author zhoubo
 * @date 2020/3/18
 * @describe 支付监听工具类
 */
public class PayListenerUtils {

    public static PayListenerUtils instance;

    private Context mContext;

    private final static ArrayList<PayResultListener> resultList = new ArrayList<PayResultListener>();

    private PayListenerUtils(Context context){
        this.mContext = context;
    }
    public static PayListenerUtils getInstance(Context context){
        if (instance == null){
            synchronized (PayListenerUtils.class){
                if (instance == null){
                    instance = new PayListenerUtils(context);
                }
            }
        }
        return instance;
    }

    /**
     * 添加支付监听
     * @param listener
     */
    public void addListener(PayResultListener listener){
        if (listener!=null&&(!resultList.contains(listener))){
            resultList.add(listener);
        }
    }

    /**
     * 移除支付监听
     * @param listener
     */
    public void removeListener(PayResultListener listener){
        if (listener!=null&&(!resultList.contains(listener))){
            resultList.remove(listener);
        }
    }

    public void removeAllListener(){
        resultList.clear();
    }
    /**
     * 调用所有支付监听成功方法
     */
    public void addSuccess(){
        for (PayResultListener listener :
                resultList) {
            Log.e("TAG","调用支付成功回调");
            listener.OnSuccess();
        }
    }

    /**
     * 调用所有支付监听错误方法
     */
    public void addError(){
        for (PayResultListener listener :
                resultList) {
            Log.e("TAG","调用支付错误回调");
            listener.OnPayError();
        }
    }

    /**
     * 调用所有支付取消方法
     */
    public void addCancel(){
        for (PayResultListener listener :
                resultList) {
            Log.e("TAG","调用支付取消回调");
            listener.OnPayCanel();
        }
    }
}
