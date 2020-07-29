package com.fec.yunmall.projectcore.bean.goods;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 返回商品详情
 */
public class ResponseGoods implements Serializable {

    /**
     baseName (string, optional): 基地名称
     ,

     checkingComment (string, optional): 自检描述
     ,

     checkingDate (string, optional): 自检时间
     ,

     checkingYield (string, optional): 自检数量
     ,

     fertilizeComment (string, optional): 施肥描述
     ,

     fertilizeDate (string, optional): 施肥时间
     ,

     finalCheckingComment (string, optional): 终检描述
     ,

     finalCheckingDate (string, optional): 终检时间
     ,

     finalCheckingYield (number, optional): 终检数量
     ,

     goodsCategory (string, optional): 类别
     ,

     goodsPredict (string, optional): 预计产量
     ,

     goodsPrice (number, optional): 单价
     ,

     goodsSpecs (string, optional): 商品规格
     ,

     goodsSupplyTime (string, optional): 商品供货时间
     ,

     goodsTitle (string, optional): 商品标题
     ,

     goodsVarieties (string, optional): 品种
     ,

     picId (string, optional): 图片ID
     ,

     sowComment (string, optional): 播种描述
     ,

     sowDate (string, optional): 播种时间
     ,

     traceStatus (integer, optional): 溯源状态0：未溯源 1：已播种 2：已施肥 3：已自检 4：已终检
     ,

     type (string, optional)
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
    private String goodsCategory;
    private String goodsPredict;
    private double goodsPrice;
    private String goodsSpecs; //规格
    private String goodsSupplyTime;
    private String goodsTitle;
    private String goodsVarieties;
    private String picId;
    private String sowComment;
    private String sowDate;
    private int traceStatus;
    private String type;
    private String goodsPublishTime;
    private int goodsId;
    private boolean isCollection; //是否收藏
    private String userPhone;
    private String goodsSpecsId;
    private String goodsType;
    private String flatPattern;
    private int goodsStatus;
    private double realInventory;
    private double sold;//已销量
    private Double startBatch;//起批量
    private String description;//描述

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Double getStartBatch() {
        return startBatch;
    }

    public void setStartBatch(double startBatch) {
        this.startBatch = startBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRealInventory() {
        return realInventory;
    }

    public void setRealInventory(double realInventory) {
        this.realInventory = realInventory;
    }
    public int getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(int goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getFlatPattern() {
        return flatPattern;
    }

    public void setFlatPattern(String flatPattern) {
        this.flatPattern = flatPattern;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsSpecsId() {
        return goodsSpecsId;
    }

    public void setGoodsSpecsId(String goodsSpecsId) {
        this.goodsSpecsId = goodsSpecsId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public void setCollection(boolean collection) {
        isCollection = collection;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsPublishTime() {
        return goodsPublishTime;
    }

    public void setGoodsPublishTime(String goodsPublishTime) {
        this.goodsPublishTime = goodsPublishTime;
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

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
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
}
