package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/2
 * @describe 农机订单详情返回对象
 */
public class AgribusinessMachineryOrderData {

    /**
     * addTime : 添加时间
     * address : 0
     * agribusinessMachineryOrderId : ID
     * day : 租用天数
     * deposit : 定金
     * endTime : 租用结束时间
     * imgs : 订单封面图
     * orderDescribe : 订单备注描述
     * orderId : 订单ID
     * orderState : 0
     * pay : 支付渠道
     * purchaser : 购买方（买方）
     * purchaserMessage : 买方信息提示标识
     * seller : 出租方（卖方）
     * sellerMessage : 出租方信息提示标识
     * startTime : 租用开始时间
     * state : 状态
     * totalPrices : 总价
     * updateTime : 修改时间
     */

    private String addTime;
    private String address;
    private Integer agribusinessMachineryOrderId;
    private Integer day;
    private double deposit;
    private String endTime;
    private String imgs;
    private String orderDescribe;
    private String orderId;
    private String orderState;
    private String pay;
    private String purchaser;
    private String purchaserMessage;
    private String seller;
    private String sellerMessage;
    private String startTime;
    private String state;
    private double totalPrices;
    private String updateTime;

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

    public Integer getAgribusinessMachineryOrderId() {
        return agribusinessMachineryOrderId;
    }

    public void setAgribusinessMachineryOrderId(Integer agribusinessMachineryOrderId) {
        this.agribusinessMachineryOrderId = agribusinessMachineryOrderId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getPurchaserMessage() {
        return purchaserMessage;
    }

    public void setPurchaserMessage(String purchaserMessage) {
        this.purchaserMessage = purchaserMessage;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSellerMessage() {
        return sellerMessage;
    }

    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(double totalPrices) {
        this.totalPrices = totalPrices;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
