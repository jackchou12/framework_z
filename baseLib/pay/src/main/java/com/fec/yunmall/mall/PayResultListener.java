package com.fec.yunmall.mall;

/**
 * @author zhoubo
 * @date 2020/3/18
 * @describe 支付回调
 */
public interface PayResultListener {
    /**
     * 支付成功
     */
    public void OnSuccess();

    /**
     * 支付错误
     */
    public void OnPayError();

    /**
     * 支付取消
     */
    public void OnPayCanel();
}
