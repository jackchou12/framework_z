package com.fec.peasant.wxapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.fec.yunmall.mall.ConfigurationSettings;
import com.fec.yunmall.mall.PayListenerUtils;
import com.fec.yunmall.mall.R;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

/**
 * @author zhoubo
 * @date 2020/3/18
 * @describe 微信支付必须支付activity
 */
public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {
    private IWXAPI api;
    private String TAG = WXPayEntryActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        api = WXAPIFactory.createWXAPI(this, ConfigurationSettings.WECHAT_APP_ID);
        api.handleIntent(getIntent(), this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        api.handleIntent(intent, this);
    }

    @Override
    public void onReq(BaseReq baseReq) {

    }

    @Override
    public void onResp(BaseResp baseResp) {
        Log.e(TAG, "WX code:------>" + baseResp.errCode);
        switch (baseResp.errCode) {
            case 0:
                //成功
                PayListenerUtils.getInstance(this).addSuccess();
                break;
            case -1:
                //失败
                PayListenerUtils.getInstance(this).addError();
                break;
            case -2:
                //用户取消
                PayListenerUtils.getInstance(this).addCancel();
                break;
        }
        finish();

    }
}
