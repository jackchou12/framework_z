package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/23
 * @describe 关键字查询产品分类
 */
public class SerachProductData {
    private String parentId;//第一级id
    private String parentName; //第一级名称
    private String goodsType;//第二级名称
    private String goodsTypeId; //第二级id
    private String goodsClassId; //第三级id
    private String goodsClass;//第三级姓名
    private String yieldUnit; //面积单位

    public String getYieldUnit() {
        return yieldUnit;
    }
    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public String getGoodsClassId() {
        return goodsClassId;
    }

    public void setGoodsClassId(String goodsClassId) {
        this.goodsClassId = goodsClassId;
    }

    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }
}
