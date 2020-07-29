package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/7/27
 * @describe
 */
public class TopSkillTypeData {

    /**
     * goodsTypeId : 1
     * parentId : 0
     * name : 水果
     * type : 0
     * typeName : null
     * priceUnit : 元
     * yieldUnit : 亩
     */

    private int goodsTypeId;
    private int parentId;
    private String name;
    private int type;
    private Object typeName;
    private String priceUnit;
    private String yieldUnit;

    public int getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(int goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Object getTypeName() {
        return typeName;
    }

    public void setTypeName(Object typeName) {
        this.typeName = typeName;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
    }

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }
}
