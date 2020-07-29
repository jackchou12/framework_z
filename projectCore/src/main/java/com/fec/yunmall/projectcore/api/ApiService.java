package com.fec.yunmall.projectcore.api;

import com.fec.yunmall.projectcore.base.bean.BaseObj;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author
 * @date 2019/1/28  17:24
 * @describe ${API}
 */
public interface ApiService {


    /* 用户接口*/

    /**
     * 用户短信验证码输入校验接口
     *
     * @param
     * @return
     */
    @FormUrlEncoded
    @POST("userLogin/SMSAuth")
    Observable<BaseObj<Object>> SMSAuth(@Field("userPhone") String userPhone, @Field("smsCode") String smsCode);

    /**
     * POST /app/picture/uploadPicture
     * 上传图片,返回图片Id
     * @param file
     * @return
     */
    @POST("picture/uploadPicture")
    Observable<BaseObj<Object>> upload(@Body MultipartBody file);

}
