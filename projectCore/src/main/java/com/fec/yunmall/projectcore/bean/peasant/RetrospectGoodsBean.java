package com.fec.yunmall.projectcore.bean.peasant;

import com.fec.yunmall.projectcore.bean.Response.QueryProductData;

/**
 * @author zhoubo
 * @date 2020/4/14
 * @describe
 */
public class RetrospectGoodsBean {
    /**
     * goods : {"baseName":"基地名称","checkingYield":0,"companyId":3,"finalCheckingYield":0,"goodsAcreage":20,"goodsCategory":"ex粮油","goodsCloseTime":"2020-08-11 12:12:12","goodsDescription":"商品描述","goodsId":10,"goodsPeriod":60,"goodsPredict":1500,"goodsPrice":10,"goodsPublishTime":"2020-04-11 12:12:12","goodsSpecs":"商品规格","goodsStatus":1,"goodsSupplyTime":"2020-05-11 12:12:12","goodsTitle":"商品标题","goodsType":"ex长粒香","goodsVarieties":"ex大米","inventory":0,"picId":"10","roleStatus":0,"traceStatus":0,"userCollectionId":0,"userId":3}
     * goodsTrace : {"checkingComment":"string","checkingDate":"2020-04-14T01:36:23.985Z","checkingYield":0,"companyId":0,"fertilizeComment":"string","fertilizeDate":"2020-04-14T01:36:23.985Z","finalCheckingComment":"string","finalCheckingDate":"2020-04-14T01:36:23.985Z","finalCheckingName":"string","finalCheckingYield":0,"goodsDescription":"string","goodsId":0,"goodsPredict":0,"goodsPublishTime":"2020-04-14T01:36:23.985Z","goodsTraceId":0,"picId":"string","picUrl":"string","sowComment":"string","sowDate":"2020-04-14T01:36:23.985Z","traceStatus":0,"userId":0}
     */

    private QueryProductData.GoodsBean goods;

    public QueryProductData.GoodsTraceBean getGoodsTrace() {
        return goodsTrace;
    }

    public void setGoodsTrace(QueryProductData.GoodsTraceBean goodsTrace) {
        this.goodsTrace = goodsTrace;
    }

    private QueryProductData.GoodsTraceBean goodsTrace;

    public QueryProductData.GoodsBean getGoods() {
        return goods;
    }

    public void setGoods(QueryProductData.GoodsBean goods) {
        this.goods = goods;
    }



    public static class GoodsBean {
        /**
         baseName (string, optional): 基地名称 ,
         checkingYield (number, optional): 自检数量 ,
         companyId (integer, optional): 所属企业ID ,
         finalCheckingYield (number, optional): 终检数量 ,
         goodsAcreage (number, optional): 面积 ,
         goodsCategory (string, optional): 商品总类别:ex粮油 ,
         goodsCloseTime (string, optional): 关闭时间 ,
         goodsDescription (string, optional): 描述 ,
         goodsId (integer, optional): 主键 ,
         goodsPeriod (integer, optional): 保质期 ,
         goodsPredict (number, optional): 预计产量 ,
         goodsPrice (number, optional): 单价 ,
         goodsPublishTime (string, optional): 发布时间 ,
         goodsSpecs (string, optional): 商品规格 ,
         goodsStatus (integer, optional): 期货现货 ,
         goodsSupplyTime (string, optional): 供货时间 ,
         goodsTitle (string, optional): 商品标题 ,
         goodsType (string, optional): 商品种类:ex长粒香 ,
         goodsVarieties (string, optional): 商品品种:ex大米 ,
         inventory (number, optional): 库存数量 ,
         picId (string, optional): 图片 ,
         roleStatus (integer, optional): 是否是贫困户:0普通用户，1贫困户，2退伍军人 ,
         traceStatus (integer, optional),
         userCollectionId (integer, optional),
         userId (integer, optional): 用户
         */

        private String baseName;
        private int checkingYield;
        private int companyId;
        private int finalCheckingYield;
        private int goodsAcreage;
        private String goodsCategory;
        private String goodsCloseTime;
        private String goodsDescription;
        private int goodsId;
        private int goodsPeriod;
        private int goodsPredict;
        private double goodsPrice;
        private String goodsPublishTime;
        private String goodsSpecs;
        private int goodsStatus;
        private String goodsSupplyTime;
        private String goodsTitle;
        private String goodsType;
        private String goodsVarieties;
        private int inventory;
        private String picId;
        private int roleStatus;
        private int traceStatus;
        private int userCollectionId;
        private int userId;

        public String getBaseName() {
            return baseName;
        }

        public void setBaseName(String baseName) {
            this.baseName = baseName;
        }

        public int getCheckingYield() {
            return checkingYield;
        }

        public void setCheckingYield(int checkingYield) {
            this.checkingYield = checkingYield;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public int getFinalCheckingYield() {
            return finalCheckingYield;
        }

        public void setFinalCheckingYield(int finalCheckingYield) {
            this.finalCheckingYield = finalCheckingYield;
        }

        public int getGoodsAcreage() {
            return goodsAcreage;
        }

        public void setGoodsAcreage(int goodsAcreage) {
            this.goodsAcreage = goodsAcreage;
        }

        public String getGoodsCategory() {
            return goodsCategory;
        }

        public void setGoodsCategory(String goodsCategory) {
            this.goodsCategory = goodsCategory;
        }

        public String getGoodsCloseTime() {
            return goodsCloseTime;
        }

        public void setGoodsCloseTime(String goodsCloseTime) {
            this.goodsCloseTime = goodsCloseTime;
        }

        public String getGoodsDescription() {
            return goodsDescription;
        }

        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public int getGoodsPeriod() {
            return goodsPeriod;
        }

        public void setGoodsPeriod(int goodsPeriod) {
            this.goodsPeriod = goodsPeriod;
        }

        public int getGoodsPredict() {
            return goodsPredict;
        }

        public void setGoodsPredict(int goodsPredict) {
            this.goodsPredict = goodsPredict;
        }

        public double getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(double goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public String getGoodsPublishTime() {
            return goodsPublishTime;
        }

        public void setGoodsPublishTime(String goodsPublishTime) {
            this.goodsPublishTime = goodsPublishTime;
        }

        public String getGoodsSpecs() {
            return goodsSpecs;
        }

        public void setGoodsSpecs(String goodsSpecs) {
            this.goodsSpecs = goodsSpecs;
        }

        public int getGoodsStatus() {
            return goodsStatus;
        }

        public void setGoodsStatus(int goodsStatus) {
            this.goodsStatus = goodsStatus;
        }

        public String getGoodsSupplyTime() {
            return goodsSupplyTime;
        }

        public void setGoodsSupplyTime(String goodsSupplyTime) {
            this.goodsSupplyTime = goodsSupplyTime;
        }

        public String getGoodsTitle() {
            return goodsTitle;
        }

        public void setGoodsTitle(String goodsTitle) {
            this.goodsTitle = goodsTitle;
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

        public String getPicId() {
            return picId;
        }

        public void setPicId(String picId) {
            this.picId = picId;
        }

        public int getRoleStatus() {
            return roleStatus;
        }

        public void setRoleStatus(int roleStatus) {
            this.roleStatus = roleStatus;
        }

        public int getTraceStatus() {
            return traceStatus;
        }

        public void setTraceStatus(int traceStatus) {
            this.traceStatus = traceStatus;
        }

        public int getUserCollectionId() {
            return userCollectionId;
        }

        public void setUserCollectionId(int userCollectionId) {
            this.userCollectionId = userCollectionId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }

    public static class GoodsTraceBean {
        /**
         checkingComment (string, optional): 自检描述 ,
         checkingDate (string, optional): 自检时间 ,
         checkingYield (number, optional): 自检数量 ,
         companyId (integer, optional): 所属企业ID ,
         fertilizeComment (string, optional): 施肥描述 ,
         fertilizeDate (string, optional): 施肥时间 ,
         finalCheckingComment (string, optional): 终检描述 ,
         finalCheckingDate (string, optional): 终检时间 ,
         finalCheckingName (string, optional): 终检员名称 ,
         finalCheckingYield (number, optional): 终检数量 ,
         goodsDescription (string, optional): 商品描述 ,
         goodsId (integer, optional): 商品ID ,
         goodsPredict (number, optional): 预计产量 ,
         goodsPublishTime (string, optional): 发布时间 ,
         goodsTraceId (integer, optional): 主键 ,
         picId (string, optional): 图片 ,
         picUrl (string, optional): 二维码地址 ,
         sowComment (string, optional): 播种描述 ,
         sowDate (string, optional): 播种时间 ,
         traceStatus (integer, optional): 溯源状态0：未溯源 1：已播种 2：已施肥 3：已自检 4：已终检 ,
         userId (integer, optional): 用户ID
         */

        private String checkingComment;
        private String checkingDate;
        private int checkingYield;
        private int companyId;
        private String fertilizeComment;
        private String fertilizeDate;
        private String finalCheckingComment;
        private String finalCheckingDate;
        private String finalCheckingName;
        private int finalCheckingYield;
        private String goodsDescription;
        private int goodsId;
        private int goodsPredict;
        private String goodsPublishTime;
        private int goodsTraceId;
        private String picId;
        private String picUrl;
        private String sowComment;
        private String sowDate;
        private int traceStatus;
        private int userId;

        public String getCheckingComment() {
            return checkingComment;
        }

        public void setCheckingComment(String checkingComment) {
            this.checkingComment = checkingComment;
        }

        public String getCheckingDate() {
            return checkingDate;
        }

        public void setCheckingDate(String checkingDate) {
            this.checkingDate = checkingDate;
        }

        public int getCheckingYield() {
            return checkingYield;
        }

        public void setCheckingYield(int checkingYield) {
            this.checkingYield = checkingYield;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public String getFertilizeComment() {
            return fertilizeComment;
        }

        public void setFertilizeComment(String fertilizeComment) {
            this.fertilizeComment = fertilizeComment;
        }

        public String getFertilizeDate() {
            return fertilizeDate;
        }

        public void setFertilizeDate(String fertilizeDate) {
            this.fertilizeDate = fertilizeDate;
        }

        public String getFinalCheckingComment() {
            return finalCheckingComment;
        }

        public void setFinalCheckingComment(String finalCheckingComment) {
            this.finalCheckingComment = finalCheckingComment;
        }

        public String getFinalCheckingDate() {
            return finalCheckingDate;
        }

        public void setFinalCheckingDate(String finalCheckingDate) {
            this.finalCheckingDate = finalCheckingDate;
        }

        public String getFinalCheckingName() {
            return finalCheckingName;
        }

        public void setFinalCheckingName(String finalCheckingName) {
            this.finalCheckingName = finalCheckingName;
        }

        public int getFinalCheckingYield() {
            return finalCheckingYield;
        }

        public void setFinalCheckingYield(int finalCheckingYield) {
            this.finalCheckingYield = finalCheckingYield;
        }

        public String getGoodsDescription() {
            return goodsDescription;
        }

        public void setGoodsDescription(String goodsDescription) {
            this.goodsDescription = goodsDescription;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public int getGoodsPredict() {
            return goodsPredict;
        }

        public void setGoodsPredict(int goodsPredict) {
            this.goodsPredict = goodsPredict;
        }

        public String getGoodsPublishTime() {
            return goodsPublishTime;
        }

        public void setGoodsPublishTime(String goodsPublishTime) {
            this.goodsPublishTime = goodsPublishTime;
        }

        public int getGoodsTraceId() {
            return goodsTraceId;
        }

        public void setGoodsTraceId(int goodsTraceId) {
            this.goodsTraceId = goodsTraceId;
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

        public String getSowComment() {
            return sowComment;
        }

        public void setSowComment(String sowComment) {
            this.sowComment = sowComment;
        }

        public String getSowDate() {
            return sowDate;
        }

        public void setSowDate(String sowDate) {
            this.sowDate = sowDate;
        }

        public int getTraceStatus() {
            return traceStatus;
        }

        public void setTraceStatus(int traceStatus) {
            this.traceStatus = traceStatus;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }
}
