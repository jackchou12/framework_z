package com.fec.yunmall.projectcore.util;

/**
 * @author zhoubo
 * @date 2020/4/7
 * @describe 防止连点
 */
public class ClickUtils {
    private static final int MIN_CLICK_DELAY_TIME = 500;
    private static long lastClickTime;

    public static boolean isFastClick() {
        boolean flag = false;
        long curClickTime = System.currentTimeMillis();
        if ((curClickTime - lastClickTime) >= MIN_CLICK_DELAY_TIME) {
            flag = true;
        }
        lastClickTime = curClickTime;
        return flag;
    }

}
