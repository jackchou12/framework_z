package com.fec.yunmall.projectcore.bean.login;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/23
 * @describe 用户数据模型
 */
public class UserBean implements Serializable {
    /**
     * addressCode : 431025
     * city : 4310
     * companyId : 2
     * county : 431025
     * createTime : 2020-04-16
     * loginStatus : 0
     * province : 43
     * roleId : 3
     * userAddress :
     * userBalance : 0
     * userId : 5
     * userName : 强
     * userPhone : 13631313232
     */

    private int addressCode;
    private int city;
    private int companyId;
    private int county;
    private String createTime;
    private int loginStatus;
    private int province;
    private int roleId;
    private String userAddress;
    private double userBalance;
    private int userId;
    private String userName;
    private String userPhone;
    private String roleName;
    private int userAge;
    private String userCard;
    private int userParentId;
    private String userPass;
    private String userPaypass;
    private String userPic;
    private int roleStatus;
    private Integer town;
    private boolean isVip;
    private Integer userLevel; //1 省  2 市 3 区
    private Integer isAuth;

    public Integer getIsAuth() {
        return isAuth;
    }

    public void setIsAuth(Integer isAuth) {
        this.isAuth = isAuth;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public Integer getTown() {
        return town;
    }

    public void setTown(Integer town) {
        this.town = town;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
    }

    public int getUserParentId() {
        return userParentId;
    }

    public void setUserParentId(int userParentId) {
        this.userParentId = userParentId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPaypass() {
        return userPaypass;
    }

    public void setUserPaypass(String userPaypass) {
        this.userPaypass = userPaypass;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public int getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(int addressCode) {
        this.addressCode = addressCode;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCounty() {
        return county;
    }

    public void setCounty(int county) {
        this.county = county;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
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

    /**
     companyId (integer, optional),

     createTime (string, optional),

     loginStatus (integer, optional): 启用状态，0：正常，1：停用,2：黑名单
     ,

     rileStatus (integer, optional): 身份状态：1贫苦户，2退伍军人
     ,

     roleId (integer, optional): 身份标识：1：采购商，2：生产基地，3：企业主管，4：销售员，5：质检员
     ,

     roleName (string, optional),

     userAddress (integer, optional): 用户地址
     ,

     userAge (integer, optional),

     userBalance (number, optional): 钱包余额2
     ,

     userCard (string, optional): 用户身份证
     ,

     userId (integer, optional),

     userName (string, optional),

     userParentId (integer, optional): 上级用户
     ,

     userPass (string, optional),

     userPaypass (string, optional): 支付密码
     ,

     userPhone (string, optional),

     userPic (string, optional): 用户头像

     */

   /* private int companyId;
    private String createTime;
    private int loginStatus;
    private int rileStatus;
    private int roleId;
    private String roleName;
    private String userAddress;
    private int userAge;
    private double userBalance;
    private String userCard;
    private int userId;
    private String userName;
    private int userParentId;
    private String userPass;
    private String userPaypass;
    private String userPhone;
    private String userPic;
    private int roleStatus;

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }

    public int getRileStatus() {
        return rileStatus;
    }

    public void setRileStatus(int rileStatus) {
        this.rileStatus = rileStatus;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
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

    public int getUserParentId() {
        return userParentId;
    }

    public void setUserParentId(int userParentId) {
        this.userParentId = userParentId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserPaypass() {
        return userPaypass;
    }

    public void setUserPaypass(String userPaypass) {
        this.userPaypass = userPaypass;
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
    }*/




}
