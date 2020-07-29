package com.fec.yunmall.projectcore.base.bean;

/**
 * @Created by  .
 * @时间 2018/5/31 16:36
 * @描述 ${TODO}
 */

public class BaseObj<T> {

    public static final String SUCCESS = "200";
    public static final String ORDERSUCCESS = "200";
    public static final String LOGINERROR = "503";
    public static final String STATE = "0";

    private String code;
    private String message ;
    private T data;
    private boolean success;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
