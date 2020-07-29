package com.fec.yunmall.projectcore.bean.goods;

/**
 * @author zhoubo
 * @date 2020/3/26
 * @describe 按基地分类数据
 */
public class ResponseGoodBean {
    /**
     checkingYield (number, optional): 已销售总数 ,
     goodsPredict (number, optional): 总产量 ,
     inventory (number, optional): 库存总数 ,
     name (string, optional)
     */

    private int checkingYield;
    private int goodsPredict;
    private int inventory;
    private String name;

    public int getCheckingYield() {
        return checkingYield;
    }

    public void setCheckingYield(int checkingYield) {
        this.checkingYield = checkingYield;
    }

    public int getGoodsPredict() {
        return goodsPredict;
    }

    public void setGoodsPredict(int goodsPredict) {
        this.goodsPredict = goodsPredict;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
