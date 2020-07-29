package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/4/15
 * @describe 首页banner实体类
 */
public class BannerData implements Serializable {

    /**
     addTime (string, optional): 添加时间 ,
     addUser (string, optional): 添加人 ,
     city (integer, optional): 市 ,
     county (integer, optional): 县 ,
     details (string, optional): 详情描述 ,
     level (integer, optional): 级别信息1:省,2:市,3:县，根据发布者决定 ,
     province (integer, optional): 省 ,
     publishType (integer, optional): 0:平台 1:政府 ,
     rotUrl (string, optional): 图片地址 ,
     rotationChartId (integer, optional): 主键 ,
     sort (integer, optional): 排序字段,数字越大，优先越高 ,
     status (string, optional): 状态 0：启用，1禁用 ,
     title (string, optional): 标题 ,
     updateTime (string, optional): 修改时间 ,
     updateUser (string, optional): 修改人
     */
    private String addTime;
    private String addUser;
    private int city;
    private int county;
    private String details;
    private int level;
    private int province;
    private int publishType;
    private String rotUrl;
    private int rotationChartId;
    private int sort;
    private String status;
    private String title;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getPublishType() {
        return publishType;
    }

    public void setPublishType(int publishType) {
        this.publishType = publishType;
    }

    public String getRotUrl() {
        return rotUrl;
    }

    public void setRotUrl(String rotUrl) {
        this.rotUrl = rotUrl;
    }

    public int getRotationChartId() {
        return rotationChartId;
    }

    public void setRotationChartId(int rotationChartId) {
        this.rotationChartId = rotationChartId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
