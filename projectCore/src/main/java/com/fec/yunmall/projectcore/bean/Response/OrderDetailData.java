package com.fec.yunmall.projectcore.bean.Response;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe
 */
public class OrderDetailData implements Serializable {


    /**
     * addTime : 2020-03-24 15:08:13
     * address : 郴州鹏和超市
     * buyMessageStatus : 1
     * comorderDescription : 尽快发货，急需
     * comorderFreight : 0
     * comorderId : 9
     * comorderNumber : 100
     * comorderPrice : 100
     * comorderStatus : 2
     * comorderTotal : 10000
     * goods : {"goodsId":3,"goodsTitle":"早早米一级","picId":"http://192.168.0.219:8080/upload/adminAvatar/201707/goods.png"}
     * newStatus : newS
     * orderPrompt : 等待发货
     * phone : 13135010868
     * picId : http://192.168.0.219:8080/upload/adminAvatar/201707/goods.png
     * sellMessageStatus : 1
     * status : 待发货
     * userId : 4
     * userName : 周标鹏
     */

    private String addTime;
    private String address;
    private int buyMessageStatus;
    private String comorderDescription;
    private double comorderFreight;
    private String comorderId;
    private int comorderNumber;
    private double comorderPrice;
    private int comorderStatus;
    private double comorderTotal;
    private GoodsBean goods;
    private String newStatus;
    private String orderPrompt;
    private String phone;
    private String picId;
    private int sellMessageStatus;
    private String status;
    private int userId;
    private String userName;
    private String comorderDeposit;
    private String deliveryTime;


    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getComorderDeposit() {
        return comorderDeposit;
    }

    public void setComorderDeposit(String comorderDeposit) {
        this.comorderDeposit = comorderDeposit;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuyMessageStatus() {
        return buyMessageStatus;
    }

    public void setBuyMessageStatus(int buyMessageStatus) {
        this.buyMessageStatus = buyMessageStatus;
    }

    public String getComorderDescription() {
        return comorderDescription;
    }

    public void setComorderDescription(String comorderDescription) {
        this.comorderDescription = comorderDescription;
    }

    public double getComorderFreight() {
        return comorderFreight;
    }

    public void setComorderFreight(double comorderFreight) {
        this.comorderFreight = comorderFreight;
    }

    public String getComorderId() {
        return comorderId;
    }

    public void setComorderId(String comorderId) {
        this.comorderId = comorderId;
    }

    public int getComorderNumber() {
        return comorderNumber;
    }

    public void setComorderNumber(int comorderNumber) {
        this.comorderNumber = comorderNumber;
    }

    public double getComorderPrice() {
        return comorderPrice;
    }

    public void setComorderPrice(double comorderPrice) {
        this.comorderPrice = comorderPrice;
    }

    public int getComorderStatus() {
        return comorderStatus;
    }

    public void setComorderStatus(int comorderStatus) {
        this.comorderStatus = comorderStatus;
    }

    public double getComorderTotal() {
        return comorderTotal;
    }

    public void setComorderTotal(double comorderTotal) {
        this.comorderTotal = comorderTotal;
    }

    public GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(GoodsBean goods) {
        this.goods = goods;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }

    public String getOrderPrompt() {
        return orderPrompt;
    }

    public void setOrderPrompt(String orderPrompt) {
        this.orderPrompt = orderPrompt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public int getSellMessageStatus() {
        return sellMessageStatus;
    }

    public void setSellMessageStatus(int sellMessageStatus) {
        this.sellMessageStatus = sellMessageStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public static class GoodsBean implements Serializable{
        /**
         * goodsId : 3
         * goodsTitle : 早早米一级
         * picId : http://192.168.0.219:8080/upload/adminAvatar/201707/goods.png
         */

        private int goodsId;
        private String goodsTitle;
        private String picId;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
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
    }
}
