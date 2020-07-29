package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhoubo
 * @date 2020/4/15
 * @describe 当地频道bean
 */
public class ChannelBean implements Serializable{

    /**
     * asc : true
     * condition : {}
     * current : 0
     * limit : 0
     * offset : 0
     * offsetCurrent : 0
     * openSort : true
     * optimizeCount : true
     * orderByField : string
     * pages : 0
     * records : [{"addTime":"2020-04-15T01:08:21.872Z","addUser":"string","chaBrowsevolume":0,"chaCategory":"string","chaDetails":"string","chaTitle":"string","channelId":0,"city":0,"county":0,"detailsState":"string","level":0,"picId":"string","province":0,"recommend":"string","updateTime":"2020-04-15T01:08:21.872Z","updateUser":"string"}]
     * searchCount : true
     * size : 0
     * total : 0
     */

    private boolean asc;
    private ConditionBean condition;
    private int current;
    private int limit;
    private int offset;
    private int offsetCurrent;
    private boolean openSort;
    private boolean optimizeCount;
    private String orderByField;
    private int pages;
    private boolean searchCount;
    private int size;
    private int total;
    private List<RecordsBean> records;

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public ConditionBean getCondition() {
        return condition;
    }

    public void setCondition(ConditionBean condition) {
        this.condition = condition;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(int offsetCurrent) {
        this.offsetCurrent = offsetCurrent;
    }

    public boolean isOpenSort() {
        return openSort;
    }

    public void setOpenSort(boolean openSort) {
        this.openSort = openSort;
    }

    public boolean isOptimizeCount() {
        return optimizeCount;
    }

    public void setOptimizeCount(boolean optimizeCount) {
        this.optimizeCount = optimizeCount;
    }

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class ConditionBean {
    }

    public static class RecordsBean implements Serializable {
        /**
         addTime (string, optional): 创建时间 ,
         addUser (string, optional): 创建人 ,
         chaBrowsevolume (integer, optional): 浏览量 ,
         chaCategory (string, optional): 类别 ,
         chaDetails (string, optional): 详情描述 ,
         chaTitle (string, optional): 标题 ,
         channelId (integer, optional): id ,
         city (integer, optional): 归属市 ,
         county (integer, optional): 归属县 ,
         detailsState (string, optional): 详情状态0:图文 1:视频 ,
         level (integer, optional): 级别信息1:省,2:市,3:县，根据发布者决定 ,
         picId (string, optional): 展览图 ,
         province (integer, optional): 归属省 ,
         recommend (string, optional): 是否推荐 ,
         updateTime (string, optional): 修改时间 ,
         updateUser (string, optional): 修改人
         */

        private String addTime;
        private String addUser;
        private int chaBrowsevolume;
        private String chaCategory;
        private String chaDetails;
        private String chaTitle;
        private int channelId;
        private int city;
        private int county;
        private String detailsState;
        private int level;
        private String picId;
        private int province;
        private String recommend;
        private String updateTime;
        private String updateUser;

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

        public int getChaBrowsevolume() {
            return chaBrowsevolume;
        }

        public void setChaBrowsevolume(int chaBrowsevolume) {
            this.chaBrowsevolume = chaBrowsevolume;
        }

        public String getChaCategory() {
            return chaCategory;
        }

        public void setChaCategory(String chaCategory) {
            this.chaCategory = chaCategory;
        }

        public String getChaDetails() {
            return chaDetails;
        }

        public void setChaDetails(String chaDetails) {
            this.chaDetails = chaDetails;
        }

        public String getChaTitle() {
            return chaTitle;
        }

        public void setChaTitle(String chaTitle) {
            this.chaTitle = chaTitle;
        }

        public int getChannelId() {
            return channelId;
        }

        public void setChannelId(int channelId) {
            this.channelId = channelId;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getCounty() {
            return county;
        }

        public void setCounty(int county) {
            this.county = county;
        }

        public String getDetailsState() {
            return detailsState;
        }

        public void setDetailsState(String detailsState) {
            this.detailsState = detailsState;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getPicId() {
            return picId;
        }

        public void setPicId(String picId) {
            this.picId = picId;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public String getRecommend() {
            return recommend;
        }

        public void setRecommend(String recommend) {
            this.recommend = recommend;
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
    }
}
