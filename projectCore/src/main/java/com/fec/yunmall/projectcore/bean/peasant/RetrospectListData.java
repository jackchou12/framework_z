package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/14
 * @describe 溯源详情列表展示对象
 */
public class RetrospectListData {
    private int id;
    private String title;
    private String desc;
    private String time;
    private int weight;
    private int status;  //所属溯源状态
    private boolean type;
    private int goodsStataus;
    private int lasttype = -1;

    public int getLasttype() {
        return lasttype;
    }

    public void setLasttype(int lasttype) {
        this.lasttype = lasttype;
    }

    public int getGoodsStataus() {
        return goodsStataus;
    }

    public void setGoodsStataus(int goodsStataus) {
        this.goodsStataus = goodsStataus;
    }

    public RetrospectListData(int id, String title, String desc, String time, int weight, int status, boolean type, int goodsStatus,int lasttype) {
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.weight = weight;
        this.status = status;
        this.type = type;
        this.id = id;
        this.goodsStataus = goodsStatus;
        this.lasttype = lasttype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
}
