package com.fec.yunmall.projectcore.bean.login;

/**
 * @author zhoubo
 * @date 2020/3/23
 * @describe 登录数据模型
 */
public class LoginBean {
    private String token;
    private UserBean user;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }
}
