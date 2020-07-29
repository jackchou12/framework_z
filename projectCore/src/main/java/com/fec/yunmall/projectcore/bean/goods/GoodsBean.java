package com.fec.yunmall.projectcore.bean.goods;

/**
 * @author zhoubo
 * @date 2020/3/25
 * @describe 生产详情
 */
public class GoodsBean {

    /**
     * checkingTotal : 0
     * checkingYield : 0
     * fertilizeTotal : 0
     * finalCheckingTotal : 0
     * goodsCategory : string
     * goodsPredict : 0
     * goodsType : string
     * goodsVarieties : string
     * inventory : 0
     * sowTotal : 0
     * type : string
     */

    private int checkingTotal;
    private int checkingYield;
    private int fertilizeTotal;
    private int finalCheckingTotal;
    private String goodsCategory;
    private int goodsPredict;
    private String goodsType;
    private String goodsVarieties;
    private int inventory;
    private int sowTotal;
    private String type;

    public int getCheckingTotal() {
        return checkingTotal;
    }

    public void setCheckingTotal(int checkingTotal) {
        this.checkingTotal = checkingTotal;
    }

    public int getCheckingYield() {
        return checkingYield;
    }

    public void setCheckingYield(int checkingYield) {
        this.checkingYield = checkingYield;
    }

    public int getFertilizeTotal() {
        return fertilizeTotal;
    }

    public void setFertilizeTotal(int fertilizeTotal) {
        this.fertilizeTotal = fertilizeTotal;
    }

    public int getFinalCheckingTotal() {
        return finalCheckingTotal;
    }

    public void setFinalCheckingTotal(int finalCheckingTotal) {
        this.finalCheckingTotal = finalCheckingTotal;
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public int getGoodsPredict() {
        return goodsPredict;
    }

    public void setGoodsPredict(int goodsPredict) {
        this.goodsPredict = goodsPredict;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsVarieties() {
        return goodsVarieties;
    }

    public void setGoodsVarieties(String goodsVarieties) {
        this.goodsVarieties = goodsVarieties;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getSowTotal() {
        return sowTotal;
    }

    public void setSowTotal(int sowTotal) {
        this.sowTotal = sowTotal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
