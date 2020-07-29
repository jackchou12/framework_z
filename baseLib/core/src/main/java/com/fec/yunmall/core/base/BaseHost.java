package com.fec.yunmall.core.base;

/**
 * @Created by  .
 * @描述 ${TODO}
 */

public class BaseHost {

    /**
     * 选择服务器
     */
    public static final String SELECT_SERVER = "selectServer";

    /**
     * 正式服务器baseUrl
     */
    public static final String RELEASE_SERVER = "";

    /**
     * 测试服务器baseUrl
     */
    public static final String DEBUG_SERVER = "http://192.168.0.219:8888/app/";

    /**
     * 本地服务器baseUrl
     */
    public static final String LOCAL_SERVER = "";


    /**
     * 获取对应的host
     *
     * @param hostType host类型
     * @return host
     */
    public static String getHost(int hostType) {
        String host;
        switch (hostType) {
            case RELEASE_SERVER_1:
                host = RELEASE_SERVER ;
                break;
            case DEBUG_SERVER_2:
                host = DEBUG_SERVER;
                break;
            case LOCAL_SERVER_3:
                host = LOCAL_SERVER;
                break;
            default:
                host = DEBUG_SERVER;
                break;
        }
        return host;
    }

    /*-------------------------------------------------------------*/
    /**
     * 总共多少种Host类型
     */
    public static final int TYPE_COUNT = 3;

    /**
     * 正式服务器baseUrl
     */
    public static final int RELEASE_SERVER_1 = 1;

    /**
     * 测试服务器baseUrl
     */
    public static final int DEBUG_SERVER_2 = 2;

    /**
     * 本地服务器baseUrl
     */
    public static final int LOCAL_SERVER_3 = 3;
}
