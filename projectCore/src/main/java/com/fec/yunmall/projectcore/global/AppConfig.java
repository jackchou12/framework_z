package com.fec.yunmall.projectcore.global;

/**
 * @author zhoubo
 * @date 2020/3/23
 * @describe App数据初始化
 */
public class AppConfig {
    public static String APP_TOKEN = "token";
    public static String APP_USER = "user";
    static int versionCode; //版本号
    static String versionName; //版本名
    static String token = ""; //用户token
    static double lat =0;
    static double lon =0;

    public static double getLat() {
        return lat;
    }

    public static void setLat(double lat) {
        AppConfig.lat = lat;
    }

    public static double getLon() {
        return lon;
    }

    public static void setLon(double lon) {
        AppConfig.lon = lon;
    }


    public static int getVersionCode() {
        return versionCode;
    }

    public static void setVersionCode(int versionCode) {
        AppConfig.versionCode = versionCode;
    }

    public static String getVersionName() {
        return versionName;
    }

    public static void setVersionName(String versionName) {
        AppConfig.versionName = versionName;
    }

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        AppConfig.token = token;
    }
    public static void clearUserDate(){
        AppConfig.token = "";
    }
}
