package com.fec.yunmall.projectcore.helper;

import com.fec.yunmall.projectcore.base.bean.BaseObj;

/**
 * @author zhoubo
 * @date 2020/3/24
 * @describe
 */
public interface NetCallback<T>{
    void onSuccess(BaseObj<T> result);
}
