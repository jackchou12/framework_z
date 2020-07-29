package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/2
 * @describe 农机订单返回
 */
public class NJOrderCreateData {

    /**
     * agribusinessMachineryOrderId : 162
     * orderId : NJ1591082448593101364411586117
     * totalPrices : 13600
     * pay :
     * deposit : 1360
     * state : 0
     * purchaser : 4
     * seller : 13
     * addTime : 2020-06-02 15:20:48
     * updateTime : 2020-06-02 15:20:48
     * purchaserMessage : 0
     * sellerMessage : 0
     * imgs : https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591066206607
     * startTime : 2020-06-23
     * endTime : 2020-07-10
     * orderDescribe : 哈哈哈
     * day : 17
     * address : 23
     * orderState : 1
     */

    private int agribusinessMachineryOrderId;
    private String orderId;
    private double totalPrices;
    private String pay;
    private double deposit;
    private String state;
    private String purchaser;
    private String seller;
    private String addTime;
    private String updateTime;
    private String purchaserMessage;
    private String sellerMessage;
    private String imgs;
    private String startTime;
    private String endTime;
    private String orderDescribe;
    private int day;
    private String address;
    private String orderState;

    public int getAgribusinessMachineryOrderId() {
        return agribusinessMachineryOrderId;
    }

    public void setAgribusinessMachineryOrderId(int agribusinessMachineryOrderId) {
        this.agribusinessMachineryOrderId = agribusinessMachineryOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrices() {
        return totalPrices;
    }

    public void setTotalPrices(double totalPrices) {
        this.totalPrices = totalPrices;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPurchaserMessage() {
        return purchaserMessage;
    }

    public void setPurchaserMessage(String purchaserMessage) {
        this.purchaserMessage = purchaserMessage;
    }

    public String getSellerMessage() {
        return sellerMessage;
    }

    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }
}
