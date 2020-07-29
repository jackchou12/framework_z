package com.fec.yunmall.projectcore.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

import java.lang.reflect.Method;

/**
 * @Created SiberiaDante
 * @Describe：
 * @CreateTime: 2018/1/16
 * @UpDateTime:
 * @Email: 2654828081@qq.com
 * @GitHub: https://github.com/SiberiaDante
 * @Blogs: http://www.cnblogs.com/shen-hua/
 */

public class DeviceUtil {

    /**
     * 是否是华为
     */
    public static boolean isHUAWEI() {
        return android.os.Build.MANUFACTURER.equals("HUAWEI");
    }
    // 是否是小米手机
    public static boolean isXiaomi() {
        return "Xiaomi".equals(Build.MANUFACTURER);
    }
    //是否是OPPO
    public static boolean isOppo() {
        return "Oppo".equals(Build.MANUFACTURER);
    }
    //是否是VIVO
    public static boolean isVivo() {
        return "Vivo".equals(Build.MANUFACTURER);
    }



    //获取是否存在NavigationBar
    public static boolean checkDeviceHasNavigationBar(Context context) {
        boolean hasNavigationBar = false;
        try {
            Resources rs = context.getResources();
            int id = rs.getIdentifier("config_showNavigationBar", "bool", "android");
            if (id > 0) {
                hasNavigationBar = rs.getBoolean(id);
            }
            Class systemPropertiesClass = Class.forName("android.os.SystemProperties");
            Method m = systemPropertiesClass.getMethod("get", String.class);
            String navBarOverride = (String) m.invoke(systemPropertiesClass, "qemu.hw.mainkeys");
            if ("1".equals(navBarOverride)) {
                hasNavigationBar = false;
            } else if ("0".equals(navBarOverride)) {
                hasNavigationBar = true;
            }
        } catch (Exception e) {

        }
        return hasNavigationBar;
    }
}
