package com.fec.yunmall.projectcore.bean.order;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 订单详情返回数据
 */
public class RecordsBean implements Serializable {
    /**
     addTime (string, optional): 创建时间 ,
     address (string, optional): 地址 ,
     buyMessageStatus (integer, optional): 是否新状态。如果为1，则是买家未读。为2则已读 ,
     comorderCar (string, optional): 车辆信息主键 ,
     comorderConsumeid (string, optional): 买家 ,
     comorderDescription (string, optional): 描述 ,
     comorderFreight (number, optional): 运费 ,
     comorderId (integer, optional): 订单ID ,
     comorderLogistics (string, optional): 运输方式。0:卖方配送（车辆运送）。1:物流发送 ,
     comorderNumber (integer, optional): 商品数量 ,
     comorderPrice (number, optional): 单价 ,
     comorderProvideid (string, optional): 卖家 ,
     comorderStatus (integer, optional): 1和0：新订单（只是区别接单状态），2已付款，3:已发货,4已完成，5退款中，6已取消，7，已删除。新建订单默认为1 ,
     comorderTotal (number, optional): 总价 ,
     goods (ResultGoods, optional): 商品 ,
     newStatus (string, optional): 是否是新状态 ,
     orderPrompt (string, optional): 订单提示语 ,
     phone (string, optional): 买家联系方式 ,
     picId (string, optional): 图片 ,
     sellMessageStatus (integer, optional): 是否新状态。如果为1，则是卖家未读。未2则已读 ,
     status (string, optional): 状态描述 ,
     userId (integer, optional): 买家ID ,
     userName (string, optional): 买家姓名
     */

    private String addTime;
    private String address;
    private int buyMessageStatus;
    private String comorderCar;
    private String comorderConsumeid;
    private String comorderDescription;
    private double comorderFreight;
    private String comorderId;
    private String comorderLogistics;
    private int comorderNumber;
    private double comorderPrice;
    private String comorderProvideid;
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

    public String getComorderCar() {
        return comorderCar;
    }

    public void setComorderCar(String comorderCar) {
        this.comorderCar = comorderCar;
    }

    public String getComorderConsumeid() {
        return comorderConsumeid;
    }

    public void setComorderConsumeid(String comorderConsumeid) {
        this.comorderConsumeid = comorderConsumeid;
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

    public String getComorderLogistics() {
        return comorderLogistics;
    }

    public void setComorderLogistics(String comorderLogistics) {
        this.comorderLogistics = comorderLogistics;
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

    public String getComorderProvideid() {
        return comorderProvideid;
    }

    public void setComorderProvideid(String comorderProvideid) {
        this.comorderProvideid = comorderProvideid;
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
         * goodsId : 0
         * goodsTitle : string
         * picId : string
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
