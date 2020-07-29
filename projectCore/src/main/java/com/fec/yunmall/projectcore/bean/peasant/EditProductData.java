package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/21
 * @describe
 */
public class EditProductData {

    /**
     goodsAcreage (string, optional): 面积
      ,
     goodsPeriod (integer, optional): 保质期
      ,
     goodsPredict (string, optional): 预计产量
      ,
     goodsPrice (number, optional): 单价
      ,
     goodsSpecs (string, optional): 商品规格ID
      ,
     goodsSpecsName (string, optional): 商品规格名称
      ,
     goodsSupplyTime (string, optional): 供货时间
      ,
     goodsTitle (integer, optional): 商品标题
      ,
     goodsType (string, optional): 商品种类ID
      ,
     goodsTypeName (string, optional): 商品种类名称
      ,
     picId (string, optional): 图片ID
      ,
     picUrl (string, optional): 图片url
     */

    private String goodsType;
    private String goodsTypeName;
    private String goodsSpecs;
    private String goodsSpecsName;
    private String goodsTitle;
    private double goodsPrice;
    private String goodsAcreage;
    private String goodsPredict;
    private String goodsSupplyTime;
    private Integer goodsPeriod;
    private String picId;
    private String picUrl;
    private Integer goodsStatus;
    private Integer goodsId;
    private Integer goodsCategory;
    private String goodsVarietiesName;
    private String goodsVarieties;
    private double sold;
    private double startBatch;
    private String description;
    private String yieldUnit;
    private String refuseMessage;
    private Integer auditStatus;//0审核中1已上架2已下架3未通过


    public String getRefuseMessage() {
        return refuseMessage;
    }

    public void setRefuseMessage(String refuseMessage) {
        this.refuseMessage = refuseMessage;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getYieldUnit() {
        return yieldUnit;
    }

    public void setYieldUnit(String yieldUnit) {
        this.yieldUnit = yieldUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStartBatch() {
        return startBatch;
    }

    public void setStartBatch(double startBatch) {
        this.startBatch = startBatch;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public String getGoodsVarieties() {
        return goodsVarieties;
    }

    public void setGoodsVarieties(String goodsVarieties) {
        this.goodsVarieties = goodsVarieties;
    }

    public String getGoodsVarietiesName() {
        return goodsVarietiesName;
    }

    public void setGoodsVarietiesName(String goodsVarietiesName) {
        this.goodsVarietiesName = goodsVarietiesName;
    }

    public Integer getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(Integer goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getGoodsSpecs() {
        return goodsSpecs;
    }

    public void setGoodsSpecs(String goodsSpecs) {
        this.goodsSpecs = goodsSpecs;
    }

    public String getGoodsSpecsName() {
        return goodsSpecsName;
    }

    public void setGoodsSpecsName(String goodsSpecsName) {
        this.goodsSpecsName = goodsSpecsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsAcreage() {
        return goodsAcreage;
    }

    public void setGoodsAcreage(String goodsAcreage) {
        this.goodsAcreage = goodsAcreage;
    }

    public String getGoodsPredict() {
        return goodsPredict;
    }

    public void setGoodsPredict(String goodsPredict) {
        this.goodsPredict = goodsPredict;
    }

    public String getGoodsSupplyTime() {
        return goodsSupplyTime;
    }

    public void setGoodsSupplyTime(String goodsSupplyTime) {
        this.goodsSupplyTime = goodsSupplyTime;
    }

    public Integer getGoodsPeriod() {
        return goodsPeriod;
    }

    public void setGoodsPeriod(Integer goodsPeriod) {
        this.goodsPeriod = goodsPeriod;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
