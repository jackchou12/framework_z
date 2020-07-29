package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/5/14
 * @describe 购物车数据实体
 */
public class ShoppingCartData implements Serializable {

    /**
     * flatPattern : string
     * goodsId : 0
     * goodsPrice : 0
     * goodsTitle : string
     * id : 0
     * inventory : 0
     * joinTime : string
     * number : 0
     * orderId : string
     * overTime : string
     * shoppingCarId : string
     * status : false
     * userId : 0
     */

    private String flatPattern; //图片
    private Integer goodsId;
    private double goodsPrice; //价格
    private String goodsTitle; //标题
    private Integer id;
    private double realInventory;//商品库存
    private double startBatch; //起批量
    private String joinTime; //加入时间
    private Integer number; //购买数量
    private String orderId; //订单编号
    private String overTime;
    private String shoppingCarId; //统一提交订单
    private boolean status;  //购物车状态
    private Integer userId; //用户id
    private String buyNumber = "1";//购买数量

    public double getRealInventory() {
        return realInventory;
    }

    public void setRealInventory(double realInventory) {
        this.realInventory = realInventory;
    }

    public double getStartBatch() {
        return startBatch;
    }

    public void setStartBatch(double startBatch) {
        this.startBatch = startBatch;
    }

    public String getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(String buyNumber) {
        this.buyNumber = buyNumber;
    }

    public String getFlatPattern() {
        return flatPattern;
    }

    public void setFlatPattern(String flatPattern) {
        this.flatPattern = flatPattern;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public String getShoppingCarId() {
        return shoppingCarId;
    }

    public void setShoppingCarId(String shoppingCarId) {
        this.shoppingCarId = shoppingCarId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
