package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/14
 * @describe 追加溯源信息
 */
public class AddRetrospectData {
    /**
     * add : false
     * checkingYield : 1000
     * describe : 描述溯源记录
     * goodsId : 10
     * goodsTraceId : 10
     * picPath : 图片的url地址
     * time : 2020-04-13 12:00:00
     * traceStatus : 3
     * uniqueness : string
     */

    private boolean add;
    private int checkingYield;
    private String describe;
    private int goodsId;
    private int goodsTraceId;
    private String picPath;
    private String time;
    private int traceStatus;
    private String uniqueness;

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }

    public int getCheckingYield() {
        return checkingYield;
    }

    public void setCheckingYield(int checkingYield) {
        this.checkingYield = checkingYield;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsTraceId() {
        return goodsTraceId;
    }

    public void setGoodsTraceId(int goodsTraceId) {
        this.goodsTraceId = goodsTraceId;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTraceStatus() {
        return traceStatus;
    }

    public void setTraceStatus(int traceStatus) {
        this.traceStatus = traceStatus;
    }

    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
    }
}
