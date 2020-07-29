package com.fec.yunmall.projectcore.bean.order;

/**
 * @author zhoubo
 * @date 2020/3/24
 * @describe 订单数据
 */
public class OrderListBean {

    private String time;//时间
    private int type; //类型 0：未接单1：已接单，2已付款，3:已发货,4已完成，5退款中，6已取消，7，已删除。新建订单默认为1 ,
    private String pic; //图片
    private String title; //标题
    private int freight; //运费
    private double price; //单价
    private int weight;   //重量
    private int orderId;   //订单编号
    private String consigneeName; //收货人姓名
    private String consigneeAddress;//收货人地址
    private double realPrice; //实际价格
    private boolean isSee = false;  //是否查看过

    public double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(double realPrice) {
        this.realPrice = realPrice;
    }

    public boolean isSee() {
        return isSee;
    }

    public void setSee(boolean see) {
        isSee = see;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
