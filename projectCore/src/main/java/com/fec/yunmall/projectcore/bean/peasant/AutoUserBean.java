package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/11
 * @describe 实名认证入参
 */
public class AutoUserBean {
    private String userName;
    private String identityCard;
    private int contraryPicId;
    private int frontPicId;

    public int getContraryPicId() {
        return contraryPicId;
    }

    public void setContraryPicId(int contraryPicId) {
        this.contraryPicId = contraryPicId;
    }

    public int getFrontPicId() {
        return frontPicId;
    }

    public void setFrontPicId(int frontPicId) {
        this.frontPicId = frontPicId;
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


}
