package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/11
 * @describe 实名认证返回
 */
public class AutoUserData {

    /**
     * authUserId : 3
     * userId : 148
     * userName : 罗大佑
     * identityCard : 430122198511210251
     * frontPicId : 607
     * frontPic : https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591847250978
     * contraryPicId : 606
     * contraryPic : https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591847242815
     * status : 0
     * cause : null
     * createTime : 2020-06-11 11:47:53
     * authTime : null
     */

    private int authUserId;
    private int userId;
    private String userName;
    private String identityCard;
    private int frontPicId;
    private String frontPic;
    private int contraryPicId;
    private String contraryPic;
    private int status;
    private String cause;
    private String createTime;
    private String authTime;

    public int getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(int authUserId) {
        this.authUserId = authUserId;
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

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getFrontPicId() {
        return frontPicId;
    }

    public void setFrontPicId(int frontPicId) {
        this.frontPicId = frontPicId;
    }

    public String getFrontPic() {
        return frontPic;
    }

    public void setFrontPic(String frontPic) {
        this.frontPic = frontPic;
    }

    public int getContraryPicId() {
        return contraryPicId;
    }

    public void setContraryPicId(int contraryPicId) {
        this.contraryPicId = contraryPicId;
    }

    public String getContraryPic() {
        return contraryPic;
    }

    public void setContraryPic(String contraryPic) {
        this.contraryPic = contraryPic;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuthTime() {
        return authTime;
    }

    public void setAuthTime(String authTime) {
        this.authTime = authTime;
    }
}
