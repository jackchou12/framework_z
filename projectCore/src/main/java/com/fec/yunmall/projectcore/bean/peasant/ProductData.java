package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/20
 * @describe 我的_产品列表数据bean
 */
public class ProductData {


    /**
     {
     baseName (string, optional): 基地名称 ,
     checkingComment (string, optional): 自检描述 ,
     checkingDate (string, optional): 自检时间 ,
     checkingYield (string, optional): 自检数量 ,
     fertilizeComment (string, optional): 施肥描述 ,
     fertilizeDate (string, optional): 施肥时间 ,
     finalCheckingComment (string, optional): 终检描述 ,
     finalCheckingDate (string, optional): 终检时间 ,
     finalCheckingYield (number, optional): 终检数量 ,
     flatPattern (string, optional): 展示图 ,
     goodsCategory (string, optional): 类别 ,
     goodsId (integer, optional): 商品ID ,
     goodsPredict (string, optional): 预计产量 ,
     goodsPrice (number, optional): 单价 ,
     goodsPublishTime (string, optional): 商品发布时间 ,
     goodsSpecs (string, optional): 商品规格 ,
     goodsSupplyTime (string, optional): 商品供货时间 ,
     goodsTitle (string, optional): 商品标题 ,
     goodsVarieties (string, optional): 品种 ,
     isCollection (boolean, optional): isCollection ,
     picId (string, optional): 图片ID ,
     picUrl (string, optional): 图片url ,
     sowComment (string, optional): 播种描述 ,
     sowDate (string, optional): 播种时间 ,
     traceStatus (integer, optional): 溯源状态0：未溯源 1：已播种 2：已施肥 3：已自检 4：已终检 ,
     type (string, optional),
     userId (integer, optional): userId ,
     userPhone (string, optional): userPhone
     }
     */

    private String baseName;
    private String checkingComment;
    private String checkingDate;
    private String checkingYield;
    private String fertilizeComment;
    private String fertilizeDate;
    private String finalCheckingComment;
    private String finalCheckingDate;
    private int finalCheckingYield;
    private String flatPattern;
    private String goodsCategory;
    private int goodsId;
    private String goodsPredict;
    private double goodsPrice;
    private String goodsPublishTime;
    private String goodsSpecs;
    private String goodsSupplyTime;
    private String goodsTitle;
    private String goodsVarieties;
    private boolean isCollection;
    private String picId;
    private String picUrl;
    private String sowComment;
    private String sowDate;
    private int traceStatus;
    private String type;
    private int userId;
    private String userPhone;
    private int goodsStatus;
    private int goodsPeriod;
    private String refuseMessage;
    private Integer auditStatus;//0审核中1已上架2已下架3未通过


    public String getRefuseMessage() {
        return refuseMessage;
    }

    public void setRefuseMessage(String refuseMessage) {
        this.refuseMessage = refuseMessage;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getGoodsPeriod() {
        return goodsPeriod;
    }

    public void setGoodsPeriod(int goodsPeriod) {
        this.goodsPeriod = goodsPeriod;
    }

    public int getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(int goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public String getCheckingComment() {
        return checkingComment;
    }

    public void setCheckingComment(String checkingComment) {
        this.checkingComment = checkingComment;
    }

    public String getCheckingDate() {
        return checkingDate;
    }

    public void setCheckingDate(String checkingDate) {
        this.checkingDate = checkingDate;
    }

    public String getCheckingYield() {
        return checkingYield;
    }

    public void setCheckingYield(String checkingYield) {
        this.checkingYield = checkingYield;
    }

    public String getFertilizeComment() {
        return fertilizeComment;
    }

    public void setFertilizeComment(String fertilizeComment) {
        this.fertilizeComment = fertilizeComment;
    }

    public String getFertilizeDate() {
        return fertilizeDate;
    }

    public void setFertilizeDate(String fertilizeDate) {
        this.fertilizeDate = fertilizeDate;
    }

    public String getFinalCheckingComment() {
        return finalCheckingComment;
    }

    public void setFinalCheckingComment(String finalCheckingComment) {
        this.finalCheckingComment = finalCheckingComment;
    }

    public String getFinalCheckingDate() {
        return finalCheckingDate;
    }

    public void setFinalCheckingDate(String finalCheckingDate) {
        this.finalCheckingDate = finalCheckingDate;
    }

    public int getFinalCheckingYield() {
        return finalCheckingYield;
    }

    public void setFinalCheckingYield(int finalCheckingYield) {
        this.finalCheckingYield = finalCheckingYield;
    }

    public String getFlatPattern() {
        return flatPattern;
    }

    public void setFlatPattern(String flatPattern) {
        this.flatPattern = flatPattern;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPredict() {
        return goodsPredict;
    }

    public void setGoodsPredict(String goodsPredict) {
        this.goodsPredict = goodsPredict;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsPublishTime() {
        return goodsPublishTime;
    }

    public void setGoodsPublishTime(String goodsPublishTime) {
        this.goodsPublishTime = goodsPublishTime;
    }

    public String getGoodsSpecs() {
        return goodsSpecs;
    }

    public void setGoodsSpecs(String goodsSpecs) {
        this.goodsSpecs = goodsSpecs;
    }

    public String getGoodsSupplyTime() {
        return goodsSupplyTime;
    }

    public void setGoodsSupplyTime(String goodsSupplyTime) {
        this.goodsSupplyTime = goodsSupplyTime;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsVarieties() {
        return goodsVarieties;
    }

    public void setGoodsVarieties(String goodsVarieties) {
        this.goodsVarieties = goodsVarieties;
    }

    public boolean isIsCollection() {
        return isCollection;
    }

    public void setIsCollection(boolean isCollection) {
        this.isCollection = isCollection;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getSowComment() {
        return sowComment;
    }

    public void setSowComment(String sowComment) {
        this.sowComment = sowComment;
    }

    public String getSowDate() {
        return sowDate;
    }

    public void setSowDate(String sowDate) {
        this.sowDate = sowDate;
    }

    public int getTraceStatus() {
        return traceStatus;
    }

    public void setTraceStatus(int traceStatus) {
        this.traceStatus = traceStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
