package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/4/11
 * @describe 商品种类
 */
public class GoodsType implements Serializable {

    /**
     * goodsId : 0
     * goodsTypeId : 0
     * name : string
     * parentId : 0
     * specsId : 0
     * specsName : string
     * specsRank : string
     */

    private int goodsId;
    private int goodsTypeId;
    private String name;
    private int parentId;
    private int specsId;
    private String specsName;
    private String specsRank;
    private String firstLetter;
    private String yieldUnit;  //种植/养殖单位

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getSpecsId() {
        return specsId;
    }

    public void setSpecsId(int specsId) {
        this.specsId = specsId;
    }

    public String getSpecsName() {
        return specsName;
    }

    public void setSpecsName(String specsName) {
        this.specsName = specsName;
    }

    public String getSpecsRank() {
        return specsRank;
    }

    public void setSpecsRank(String specsRank) {
        this.specsRank = specsRank;
    }
}
