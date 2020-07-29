package com.fec.peasant.mall.ui.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.fec.yunmall.core.base.BaseHost;
import com.fec.yunmall.core.base.CoreApplication;
import com.fec.yunmall.core.util.SPUtil;
import com.umeng.message.UmengNotifyClickActivity;

public class SplashActivity extends UmengNotifyClickActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showDialog();
    }
    private void showDialog(){
        final String[] gender = new String[]{"测试服","正式服"};
        AlertDialog.Builder builder1=new AlertDialog.Builder(this);
        builder1.setTitle("请选择服务器:");
        builder1.setItems(gender, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int id = 2;
                switch (which) {
                    case 0 :
                        id = 2;
                        break;
                    case 1 :
                        id = 4;
                        break;
                }
                SPUtil.put(CoreApplication.getApplication(), BaseHost.SELECT_SERVER,id);
            }
        });
        builder1.show();
    }

}
