package com.fec.yunmall.projectcore.bean.Response;

/**
 * @author zhoubo
 * @date 2020/3/26
 * @describe 溯源统计列表
 */
public class    ResponseGoodsBean {

    /**
     baseName (string, optional): 基地名称 ,
     checkingComment (string, optional): 自检描述 ,
     checkingDate (string, optional): 自检时间 ,
     fertilizeComment (string, optional): 施肥描述 ,
     fertilizeDate (string, optional): 施肥时间 ,
     finalCheckingComment (string, optional): 终检描述 ,
     finalCheckingDate (string, optional): 终检时间 ,
     finalCheckingName (string, optional): 终检人姓名 ,
     goodsCategory (string, optional): 类别 ex粮油 ,
     goodsTitle (string, optional): 商品标题 ,
     goodsType (string, optional): 商品种类 ex长粒香 ,
     goodsVarieties (string, optional): 商品品种 ex大米 ,
     picId (string, optional): 图片地址 ,
     sowComment (string, optional): 播种描述 ,
     sowDate (string, optional): 播种时间 ,
     total (string, optional): 溯源信息总数 ,
     traceStatus (string, optional): 溯源状态0未溯源 1已播种 2已施肥 3已自检 4已终检
     */

    private String baseName;
    private String checkingComment;
    private String checkingDate;
    private String fertilizeComment;
    private String fertilizeDate;
    private String finalCheckingComment;
    private String finalCheckingDate;
    private String finalCheckingName;
    private String goodsCategory;
    private String goodsTitle;
    private String goodsType;
    private String goodsVarieties;
    private String picId;
    private String sowComment;
    private String sowDate;
    private String total;
    private String traceStatus;
    private int goodsTraceId;
    private String goodsSupplyTime;
    private String goodsPrice;
    private String goodsId;
    private String flatPattern;
    private String goodsPublishTime;
    private String checkingYield;



    public String getCheckingYield() {
        return checkingYield;
    }

    public void setCheckingYield(String checkingYield) {
        this.checkingYield = checkingYield;
    }

    public String getGoodsPublishTime() {
        return goodsPublishTime;
    }

    public void setGoodsPublishTime(String goodsPublishTime) {
        this.goodsPublishTime = goodsPublishTime;
    }

    public String getFlatPattern() {
        return flatPattern;
    }

    public void setFlatPattern(String flatPattern) {
        this.flatPattern = flatPattern;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsSupplyTime() {
        return goodsSupplyTime;
    }

    public void setGoodsSupplyTime(String goodsSupplyTime) {
        this.goodsSupplyTime = goodsSupplyTime;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsTraceId() {
        return goodsTraceId;
    }

    public void setGoodsTraceId(int goodsTraceId) {
        this.goodsTraceId = goodsTraceId;
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

    public String getFinalCheckingName() {
        return finalCheckingName;
    }

    public void setFinalCheckingName(String finalCheckingName) {
        this.finalCheckingName = finalCheckingName;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsVarieties() {
        return goodsVarieties;
    }

    public void setGoodsVarieties(String goodsVarieties) {
        this.goodsVarieties = goodsVarieties;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTraceStatus() {
        return traceStatus;
    }

    public void setTraceStatus(String traceStatus) {
        this.traceStatus = traceStatus;
    }
}
