package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/13
 * @describe 发布农产品类
 */
public class PublishProductBean {

    /**
     * acreage : 100  面积
     * category : ex:粮油ID
     * description : 精致的回龙山大米，采用上好的XX
     * goodsType : 种类：长粒香
     * inventory : 0
     * oprice : 10
     * period : 120 周期
     * picUrl : 10,9
     * predict : 500   预计产量
     * specs : 级别：一级
     * status : 0
     * supplyTime : 2020-04-05
     * title : 如：回龙山精致大米
     * uniqueness : string
     * varieties : 品种：大米
     */

    private Double acreage;
    private String category;
    private String description;
    private String goodsType;
    private Integer inventory;
    private double oprice;
    private Integer period;
    private String picUrl;
    private double predict;
    private String specs;
    private Integer status;
    private String supplyTime;
    private String title;
    private String uniqueness;
    private String varieties;
    private Integer goodsPeriod;
    private Integer goodsStatus;
    private int goodsId;
    private double sold; //已销量
    private double startBatch; //起批量

    public double getStartBatch() {
        return startBatch;
    }

    public void setStartBatch(double startBatch) {
        this.startBatch = startBatch;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Integer getGoodsPeriod() {
        return goodsPeriod;
    }

    public void setGoodsPeriod(Integer goodsPeriod) {
        this.goodsPeriod = goodsPeriod;
    }

    public Double getAcreage() {
        return acreage;
    }

    public void setAcreage(Double acreage) {
        this.acreage = acreage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public double getPredict() {
        return predict;
    }

    public void setPredict(double predict) {
        this.predict = predict;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSupplyTime() {
        return supplyTime;
    }

    public void setSupplyTime(String supplyTime) {
        this.supplyTime = supplyTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }
}
