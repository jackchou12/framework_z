package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/15
 * @describe 订单入参对象
 */
public class OrderForm {

    /**
     * address : 买家的地址ID:7
     * goodsId : 80
     * goodsNumber : 10
     * remark : 备注字段，用于给卖家看的信息
     * uniqueness : 0012345678910
     */

    private String address;
    private String goodsId;
    private int goodsNumber;
    private String remark;
    private String uniqueness;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
    }
}
