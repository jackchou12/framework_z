package com.fec.yunmall.projectcore.helper;

import android.app.Activity;
import android.content.Intent;

import com.bigkoo.alertview.AlertView;
import com.bigkoo.alertview.OnItemClickListener;
import com.fec.yunmall.core.net.common_callback.INetCallback;
import com.fec.yunmall.core.util.SPUtil;
import com.fec.yunmall.projectcore.api.ApiService;
import com.fec.yunmall.projectcore.base.application.BaseApplication;
import com.fec.yunmall.projectcore.base.bean.BaseObj;
import com.fec.yunmall.projectcore.base.vp.inter.IView;
import com.fec.yunmall.projectcore.base.vp.observer.BaseObserver;
import com.fec.yunmall.projectcore.global.AppConfig;
import com.fec.yunmall.projectcore.util.AppUtils;
import com.fec.yunmall.projectcore.util.L;
import com.fec.yunmall.projectcore.util.RxUtils;
import com.orhanobut.logger.Logger;

import io.reactivex.Observable;

/**
 * @author
 * @date 2019/1/28  17:26
 * @describe ${TODO}
 */
public class ModelPeasantService {
    private ModelPeasantService mModelService;
    private static AlertView tk;

    /**
     * 获取api的回调
     *
     * @param <T>
     */
    public interface SelectListener<T> {
        Observable<BaseObj<T>> selectApi(ApiService service);
    }

    public ModelPeasantService(ModelPeasantService modelService) {
        mModelService = modelService;

    }

    public static <T> BaseObserver<BaseObj<T>> getRemoteData(boolean isShowHUD, IView mView, SelectListener<T> select, INetCallback<T> callback) {
        //设置不同的BaseUrl
        return select.selectApi(HttpHelper.getDefault()
                .create(ApiService.class))
                .compose(RxUtils.<BaseObj<T>>rxSchedulerHelper())
                //.compose(RxUtils.handleResult())
                .subscribeWith(new BaseObserver<BaseObj<T>>(mView, isShowHUD) {
                                   @Override
                                   public void onNext(BaseObj<T> result) {
                                       L.d("获取message", ":" + result.getMessage());
                                       if (BaseObj.SUCCESS .equals(result.getCode()) ) {
                                           callback.onSuccess(result.getData());
                                       } else {
                                           mView.showRequestError(result.getMessage(), result.getCode());
                                       }
                                   }
                               }
                );
    }



    public static <T> BaseObserver<BaseObj<T>> getRemoteData(boolean isShowHUD, IView mView, SelectListener<T> select, NetCallback<T> callback) {
        //设置不同的BaseUrl
        return select.selectApi(HttpHelper.getDefault()
                .create(ApiService.class))
                .compose(RxUtils.<BaseObj<T>>rxSchedulerHelper())
                //.compose(RxUtils.handleResult())
                .subscribeWith(new BaseObserver<BaseObj<T>>(mView, isShowHUD) {
                                   @Override
                                   public void onNext(BaseObj<T> result) {
                                       L.d("获取message", ":" + result.getMessage());
                                      // if (BaseObj.SUCCESS.equals(result.getCode())) {
                                       if (BaseObj.LOGINERROR.equals(result.getCode())){
                                           if (tk!=null&&tk.isShowing())return;
                                           Activity currentAtivity = BaseApplication.getApplication().getActivityControl().getCurrentAtivity();
                                           AppConfig.clearUserDate();
                                           SPUtil.put(currentAtivity,AppConfig.APP_USER,"");
                                           SPUtil.put(currentAtivity,AppConfig.APP_TOKEN,"");

                                           tk = new AlertView("提示", "您的账号已在别处登录,是否重新登录!", null, null, new String[]{"取消", "确定"}, currentAtivity, AlertView.Style.Alert, new OnItemClickListener() {
                                               @Override
                                               public void onItemClick(Object o, int position) {
                                                   try {
                                                   if (position == 1){
                                                      String fullname = AppUtils.getAppPackageName()+".mall.ui.login.NewLoginActivity";
                                                       Intent intent = null;
                                                           intent = new Intent(currentAtivity, Class.forName(fullname));
                                                           intent.putExtra("type",503);
                                                           currentAtivity.startActivity(intent);
                                                           //   Activity type = (Activity) ARouter.getInstance().build(RouterPath.COMPANY_LOGIN).withInt("type", 503).navigation(currentAtivity);
                                                           //BaseApplication.getApplication().mActivityControl.finishiAll();

                                                   }else{
                                                       String mainactivityname = AppUtils.getAppPackageName()+".mall.ui.activity.MainActivity";
                                                       Intent intent2 = new Intent(currentAtivity,Class.forName(mainactivityname));
                                                       currentAtivity.startActivity(intent2);
                                                       //BaseApplication.getApplication().mActivityControl.finishiAll();
                                                       // BaseApplication.getApplication().getActivityControl().appExit();
                                                   }
                                                   } catch (ClassNotFoundException e) {
                                                       Logger.e("登录页面未找到 ,请检查TokenInterceptor Activity路径设置");
                                                       e.printStackTrace();
                                                   }
                                               }
                                           });
                                           tk.show();
                                           return;
                                       }

                                           callback.onSuccess(result);
                                     //  } else {
                                      //     mView.showRequestError(result.getMessage(), result.getCode());
                                     //  }
                                   }
                               }
                );
    }


}
