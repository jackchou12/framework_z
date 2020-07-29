package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/13
 * @describe 需求
 */
public class DemandBean {

    /**
     * addTime : 2020-04-15 12:00:00
     * addUser : 3
     * goodsId : 10
     * releaseDescription : 需求的商品的大概描述
     * releaseExpectAddress : 期望的地址
     * releaseNumber : 30
     * releaseOverTime : 2020-12-15 12:00:00
     * releaseSpeces : 采购的具体需求
     * releaseStartTime : 2020-04-15 12:00:00
     * releaseTakeAddress : 采购商的收货地址
     * releaseTitle : 采购需求的标题
     * releaseXqId : 10
     * updateTime : 2020-04-15 12:00:00
     * updateUser : 3
     * userId : 3
     * goodsType (string, optional): 商品种类:ex长粒香 ,
     * goodsTypeName (string, optional): 商品种类 ,
     * goodsVarieties (string, optional): 商品品种:ex大米 ,
     * goodsVarietiesName (string, optional): 商品品种 ,
     */

    private String addTime;
    private String addUser;
    private int goodsId;
    private String releaseDescription;
    private String releaseExpectAddress;
    private int releaseNumber;
    private String releaseOverTime;
    private String releaseSpeces;
    private String releaseStartTime;
    private String releaseTakeAddress;
    private String releaseTitle;
    private int releaseXqId;
    private String updateTime;
    private String updateUser;
    private String userId;
    private String goodsType;
    private String goodsTypeName;
    private String goodsVarieties;
    private String goodsVarietiesName;

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsVarieties() {
        return goodsVarieties;
    }

    public void setGoodsVarieties(String goodsVarieties) {
        this.goodsVarieties = goodsVarieties;
    }

    public String getGoodsVarietiesName() {
        return goodsVarietiesName;
    }

    public void setGoodsVarietiesName(String goodsVarietiesName) {
        this.goodsVarietiesName = goodsVarietiesName;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getReleaseDescription() {
        return releaseDescription;
    }

    public void setReleaseDescription(String releaseDescription) {
        this.releaseDescription = releaseDescription;
    }

    public String getReleaseExpectAddress() {
        return releaseExpectAddress;
    }

    public void setReleaseExpectAddress(String releaseExpectAddress) {
        this.releaseExpectAddress = releaseExpectAddress;
    }

    public int getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(int releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public String getReleaseOverTime() {
        return releaseOverTime;
    }

    public void setReleaseOverTime(String releaseOverTime) {
        this.releaseOverTime = releaseOverTime;
    }

    public String getReleaseSpeces() {
        return releaseSpeces;
    }

    public void setReleaseSpeces(String releaseSpeces) {
        this.releaseSpeces = releaseSpeces;
    }

    public String getReleaseStartTime() {
        return releaseStartTime;
    }

    public void setReleaseStartTime(String releaseStartTime) {
        this.releaseStartTime = releaseStartTime;
    }

    public String getReleaseTakeAddress() {
        return releaseTakeAddress;
    }

    public void setReleaseTakeAddress(String releaseTakeAddress) {
        this.releaseTakeAddress = releaseTakeAddress;
    }

    public String getReleaseTitle() {
        return releaseTitle;
    }

    public void setReleaseTitle(String releaseTitle) {
        this.releaseTitle = releaseTitle;
    }

    public int getReleaseXqId() {
        return releaseXqId;
    }

    public void setReleaseXqId(int releaseXqId) {
        this.releaseXqId = releaseXqId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
