package com.fec.yunmall.projectcore.bean.base;

/**
 * @author zhoubo
 * @date 2020/5/8
 * @describe 基地详情返回bean
 */
public class BaseDetailBean {

    /**
     addressCount (integer, optional): 用户地址数量 ,
     goodsCount (integer, optional): 农产品数量 ,
     loginStatus (integer, optional): 启用状态，0：正常，1：停用,2：黑名单 ,
     orderCount (integer, optional): 农产品订单数 ,
     releaseCount (integer, optional): 农产品需求数 ,
     roleStatus (integer, optional): 0普通，1普通，贫苦户，2普通，退伍军人，3都是 ,
     traceCount (integer, optional): 溯源数量 ,
     userAddress (string, optional),
     userId (integer, optional),
     userName (string, optional),
     userPhone (string, optional),
     userPic (string, optional): 用户头像
     */

    private int addressCount;
    private int goodsCount;
    private int loginStatus;
    private int orderCount;
    private int releaseCount;
    private int roleStatus;
    private int traceCount;
    private String userAddress;
    private int userId;
    private String userName;
    private String userPhone;
    private String userPic;

    public int getAddressCount() {
        return addressCount;
    }

    public void setAddressCount(int addressCount) {
        this.addressCount = addressCount;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public int getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getReleaseCount() {
        return releaseCount;
    }

    public void setReleaseCount(int releaseCount) {
        this.releaseCount = releaseCount;
    }

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public int getTraceCount() {
        return traceCount;
    }

    public void setTraceCount(int traceCount) {
        this.traceCount = traceCount;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }
}
