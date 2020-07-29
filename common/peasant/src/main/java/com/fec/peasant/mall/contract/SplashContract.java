package com.fec.peasant.mall.contract;

import com.fec.yunmall.projectcore.base.vp.inter.IPresenter;
import com.fec.yunmall.projectcore.base.vp.inter.IView;

/**
 * @author zhoubo
 * @date 2020/3/20
 * @describe 关于我们接口管理类
 */
public interface SplashContract {
    interface View extends IView{}
    interface Presenter extends IPresenter<View>{}
}
