package com.fec.yunmall.projectcore.base.router;

import android.support.v4.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author
 * @date 2019/1/28  14:17
 * @describe ${路由中心}
 */
public class RouterCenter {

    /**
     * 获取农户主页面
     */
    public static Fragment toPeasantHome() {

        return RouterCenter.getFragment(RouterPath.PEASANT_HOME);
    }




    private static Fragment getFragment(String desc) {
        Fragment fragment = (Fragment) ARouter.getInstance().build(desc).navigation();
        if (fragment == null) fragment = new Fragment();
        return fragment;
    }

}
