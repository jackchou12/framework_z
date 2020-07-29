package com.fec.yunmall.projectcore.bean.collection;

import com.fec.yunmall.projectcore.bean.peasant.CollectionNGData;
import com.fec.yunmall.projectcore.bean.peasant.CollectionNJData;
import com.fec.yunmall.projectcore.bean.peasant.CollectionQZData;
import com.fec.yunmall.projectcore.bean.peasant.News;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 收藏列表
 */
public class CollectionListBean {

    private List<News> farmingSkill;
    private List<GoodsCollectionBean> goodsCollection;
    private List<ReleaseXqBean> releaseXq;
    private List<CollectionNJData> agriculturalMachinery;
    private List<CollectionNGData> agribusiness;
    private List<CollectionQZData> jobWanted;

    public List<CollectionQZData> getJobWanted() {
        return jobWanted;
    }

    public void setJobWanted(List<CollectionQZData> jobWanted) {
        this.jobWanted = jobWanted;
    }

    public List<CollectionNJData> getAgriculturalMachinery() {
        return agriculturalMachinery;
    }

    public void setAgriculturalMachinery(List<CollectionNJData> agriculturalMachinery) {
        this.agriculturalMachinery = agriculturalMachinery;
    }

    public List<CollectionNGData> getAgribusiness() {
        return agribusiness;
    }

    public void setAgribusiness(List<CollectionNGData> agribusiness) {
        this.agribusiness = agribusiness;
    }

    public List<News> getFarmingSkill() {
        return farmingSkill!=null?farmingSkill:new ArrayList<News>();
    }

    public void setFarmingSkill(List<News> farmingSkill) {
        this.farmingSkill = farmingSkill;
    }

    public List<GoodsCollectionBean> getGoodsCollection() {
        return goodsCollection!= null?goodsCollection:new ArrayList<GoodsCollectionBean>();
    }

    public void setGoodsCollection(List<GoodsCollectionBean> goodsCollection) {
        this.goodsCollection = goodsCollection;
    }

    public List<ReleaseXqBean> getReleaseXq() {
        return releaseXq != null?releaseXq:new ArrayList<ReleaseXqBean>();
    }

    public void setReleaseXq(List<ReleaseXqBean> releaseXq) {
        this.releaseXq = releaseXq;
    }

    public static class FarmingSkillBean {
        /**
         * addTime : string
         * addUser : string
         * famskillDescription : string
         * famskillVideoUrl : string
         * farmingSkillId : 0
         * farmskillName : string
         * picId : 0
         * updateTime : string
         * updateUser : string
         * userCollectionId : 0
         */

        private String addTime;
        private String addUser;
        private String famskillDescription;
        private String famskillVideoUrl;
        private int farmingSkillId;
        private String farmskillName;
        private int picId;
        private String picUrl;
        private String updateTime;
        private String updateUser;
        private int userCollectionId;

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getAddUser() {
            return addUser;
        }

        public void setAddUser(String addUser) {
            this.addUser = addUser;
        }

        public String getFamskillDescription() {
            return famskillDescription;
        }

        public void setFamskillDescription(String famskillDescription) {
            this.famskillDescription = famskillDescription;
        }

        public String getFamskillVideoUrl() {
            return famskillVideoUrl;
        }

        public void setFamskillVideoUrl(String famskillVideoUrl) {
            this.famskillVideoUrl = famskillVideoUrl;
        }

        public int getFarmingSkillId() {
            return farmingSkillId;
        }

        public void setFarmingSkillId(int farmingSkillId) {
            this.farmingSkillId = farmingSkillId;
        }

        public String getFarmskillName() {
            return farmskillName;
        }

        public void setFarmskillName(String farmskillName) {
            this.farmskillName = farmskillName;
        }

        public int getPicId() {
            return picId;
        }

        public void setPicId(int picId) {
            this.picId = picId;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
        }

        public int getUserCollectionId() {
            return userCollectionId;
        }

        public void setUserCollectionId(int userCollectionId) {
            this.userCollectionId = userCollectionId;
        }
    }

    public static class GoodsCollectionBean {
        /**
         * baseName : string
         * checkingYield : 0
         * companyId : 0
         * finalCheckingYield : 0
         * goodsAcreage : 0
         * goodsCategory : string
         * goodsCloseTime : 2020-03-30T01:20:25.767Z
         * goodsDescription : string
         * goodsEarnestMoney : 0
         * goodsId : 0
         * goodsPeriod : 0
         * goodsPredict : 0
         * goodsPrice : 0
         * goodsPublishTime : 2020-03-30T01:20:25.767Z
         * goodsSpecs : string
         * goodsStatus : 0
         * goodsSupplyTime : 2020-03-30T01:20:25.767Z
         * goodsTitle : string
         * goodsType : string
         * goodsVarieties : string
         * inventory : 0
         * picId : string
         * userCollectionId : 0
         * userId : 0
         */

        private String baseName;
        private int checkingYield;
        private int companyId;
        private double finalCheckingYield;
        private double goodsAcreage;
        private String goodsCategory;
        private String goodsCloseTime;
        private String goodsDescription;
        private int goodsEarnestMoney;
        private int goodsId;
        private int goodsPeriod;
        private double goodsPredict;
        private double goodsPrice;
        private String goodsPublishTime;
        private String goodsSpecs;
        private int goodsStatus;
        private String goodsSupplyTime;
        private String goodsTitle;
        private String goodsType;
        private String goodsVarieties;
        private double inventory;
        private String picId;
        private int userCollectionId;
        private int userId;
        private String flatPattern;

        public String getFlatPattern() {
            return flatPattern;
        }

        public void setFlatPattern(String flatPattern) {
            this.flatPattern = flatPattern;
        }

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

        public double getFinalCheckingYield() {
            return finalCheckingYield;
        }

        public void setFinalCheckingYield(double finalCheckingYield) {
            this.finalCheckingYield = finalCheckingYield;
        }

        public double getGoodsAcreage() {
            return goodsAcreage;
        }

        public void setGoodsAcreage(double goodsAcreage) {
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

        public int getGoodsEarnestMoney() {
            return goodsEarnestMoney;
        }

        public void setGoodsEarnestMoney(int goodsEarnestMoney) {
            this.goodsEarnestMoney = goodsEarnestMoney;
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

        public double getGoodsPredict() {
            return goodsPredict;
        }

        public void setGoodsPredict(double goodsPredict) {
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

        public double getInventory() {
            return inventory;
        }

        public void setInventory(double inventory) {
            this.inventory = inventory;
        }

        public String getPicId() {
            return picId;
        }

        public void setPicId(String picId) {
            this.picId = picId;
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

    public static class ReleaseXqBean {
        /**
         * addTime : string
         * addUser : string
         * goodsId : 0
         * releaseDescription : string
         * releaseExpectAddress : string
         * releaseNumber : 0
         * releaseOverTime : 2020-03-30T01:20:25.767Z
         * releaseSpeces : string
         * releaseStartTime : 2020-03-30T01:20:25.767Z
         * releaseTakeAddress : string
         * releaseTitle : string
         * releaseXqId : 0
         * updateTime : string
         * updateUser : string
         * userCollectionId : 0
         * userId : string
         */

        private String addTime;
        private String addUser;
        private int goodsId;
        private String releaseDescription;
        private String releaseExpectAddress;
        private int releaseNumber;
        private String releaseOverTime;
        private String releaseSpeces;
        private String releaseStartTime;
        private String releaseTakeAddress;
        private String releaseTitle;
        private int releaseXqId;
        private String updateTime;
        private String updateUser;
        private int userCollectionId;
        private String userId;

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getAddUser() {
            return addUser;
        }

        public void setAddUser(String addUser) {
            this.addUser = addUser;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getReleaseDescription() {
            return releaseDescription;
        }

        public void setReleaseDescription(String releaseDescription) {
            this.releaseDescription = releaseDescription;
        }

        public String getReleaseExpectAddress() {
            return releaseExpectAddress;
        }

        public void setReleaseExpectAddress(String releaseExpectAddress) {
            this.releaseExpectAddress = releaseExpectAddress;
        }

        public int getReleaseNumber() {
            return releaseNumber;
        }

        public void setReleaseNumber(int releaseNumber) {
            this.releaseNumber = releaseNumber;
        }

        public String getReleaseOverTime() {
            return releaseOverTime;
        }

        public void setReleaseOverTime(String releaseOverTime) {
            this.releaseOverTime = releaseOverTime;
        }

        public String getReleaseSpeces() {
            return releaseSpeces;
        }

        public void setReleaseSpeces(String releaseSpeces) {
            this.releaseSpeces = releaseSpeces;
        }

        public String getReleaseStartTime() {
            return releaseStartTime;
        }

        public void setReleaseStartTime(String releaseStartTime) {
            this.releaseStartTime = releaseStartTime;
        }

        public String getReleaseTakeAddress() {
            return releaseTakeAddress;
        }

        public void setReleaseTakeAddress(String releaseTakeAddress) {
            this.releaseTakeAddress = releaseTakeAddress;
        }

        public String getReleaseTitle() {
            return releaseTitle;
        }

        public void setReleaseTitle(String releaseTitle) {
            this.releaseTitle = releaseTitle;
        }

        public int getReleaseXqId() {
            return releaseXqId;
        }

        public void setReleaseXqId(int releaseXqId) {
            this.releaseXqId = releaseXqId;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
        }

        public int getUserCollectionId() {
            return userCollectionId;
        }

        public void setUserCollectionId(int userCollectionId) {
            this.userCollectionId = userCollectionId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
