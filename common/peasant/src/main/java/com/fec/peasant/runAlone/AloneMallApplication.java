package com.fec.peasant.runAlone;

import android.support.multidex.MultiDex;

import com.fec.yunmall.core.base.BaseHost;
import com.fec.yunmall.core.base.CoreApplication;
import com.fec.yunmall.core.util.SPUtil;
import com.fec.yunmall.projectcore.base.application.BaseApplication;
import com.fec.yunmall.projectcore.util.TipsUtil;

/**
 * @Created by  .
 * @时间 2018/4/26 10:26
 * @描述 ${模块路由初始化}
 */

public class AloneMallApplication extends BaseApplication {
    private String UMENG_APPKEY = "5eeacf91167edd707f00025b";
    private String UMENG_MESSAGE_SECRET = "43bf157abc45d105ef4c363398e7623c";
    private String UMENG_XIAOMIAPPID = "2882303761518422750";
    private String UMENG_XIAOMIAPPKEY = "5831842287750";
    private String UMENG_HUAWEI = "CV8BeSKhaW+tWp7ONnB/Ub9+cDwPLnOmdZ59cks48yB90OPXvZYwyayl24yIx+sVwGjniSKyIo1mJMXtRQXy6DbjRbmM";
    private String UMENG_OPPOKEY = "1b59c42464934e67a32436e9086c3146";
    private String UMENG_OPPOSECRET = "87f8af1ad8ea439c9ef35f2d56323e04";
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(mApplication);
        //RouterConfig.init(this, true);
        initCacheDate();
        /*测试服务器*/
        SPUtil.put(CoreApplication.getApplication(), BaseHost.SELECT_SERVER,1);

    }


    private void initCacheDate(){
        TipsUtil.init(this);
    }

}
