package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/10
 * @describe 生产端首页列表数据
 */
public class SupplyData {

    /**
     goodsCloseTime (string, optional): 商品关闭时间 ,
     goodsId (integer, optional): 商品ID ,
     goodsPublishTime (string, optional): 商品发布时间 ,
     goodsSupplyTime (string, optional): 商品供货时间 ,
     goodsTitle (string, optional): 商品标题 ,
     picId (string, optional): 图片ID ,
     userAddress (string, optional): 用户地址
     */

    private String goodsCloseTime;
    private int goodsId;
    private String goodsPublishTime;
    private String goodsSupplyTime;
    private String goodsTitle;
    private String picId;
    private String flatPattern;
    private String userAddress;
    private double goodsPrice;
    private String goodsStatus; //0现货 //1期货

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getFlatPattern() {
        return flatPattern;
    }

    public void setFlatPattern(String flatPattern) {
        this.flatPattern = flatPattern;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsCloseTime() {
        return goodsCloseTime;
    }

    public void setGoodsCloseTime(String goodsCloseTime) {
        this.goodsCloseTime = goodsCloseTime;
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

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
