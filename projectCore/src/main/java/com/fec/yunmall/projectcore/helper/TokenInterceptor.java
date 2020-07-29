package com.fec.yunmall.projectcore.helper;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fec.yunmall.projectcore.base.application.BaseApplication;
import com.fec.yunmall.projectcore.base.router.RouterPath;
import com.orhanobut.logger.Logger;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * @author zhoubo
 * @date 2020/3/24
 * @describe token失效统一处理拦截器
 */
public class TokenInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);//执行请求
        String responseBodyStr = handResponse(response);//获得处理后的数据字符串
        boolean b = tokenException(responseBodyStr);
        if (tokenException(responseBodyStr)) {//判断是否token过期
            //token已过期
            ARouter.getInstance().build(RouterPath.PEASANT_HOME).withInt("type",503).navigation(BaseApplication.mApplication.getActivityControl().getCurrentAtivity());

        }
            return response.newBuilder()
                    .body(ResponseBody.create(response.body().contentType(), responseBodyStr))
                    .build();


    }


    /**
     * 判断是否被告知Token过期
     *
     * @param responseBodyStr
     * @return
     */
    private boolean tokenException(String responseBodyStr) {

        try {
            JSONObject jsonObject = null;
            jsonObject = new JSONObject(responseBodyStr);
            int code = (int) jsonObject.get("code");
            return 503 == code;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 处理response
     *
     * @param response
     * @return
     * @throws IOException
     */
    private String handResponse(Response response) throws IOException {
        ResponseBody responseBody = response.body();
        String responseBodyStr = responseBody.string();
        String requestUrl = response.request().url().url().toString();//请求路径
        Logger.d("MobileAPI:" + requestUrl + "  返回数据==>" + responseBodyStr);
        return responseBodyStr;
    }
}
