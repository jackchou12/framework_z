package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/5/26
 * @describe 查询农工入参
 */
public class AgribusinessRequest implements Serializable {

    /**
     addressCode (string, optional): 省市区Code ,
     latitude (number, optional): 纬度 ,
     longitude (number, optional): 经度 ,
     orderBy (integer, optional): 综合排序 ,
     page (integer, optional): 页码 ,
     size (integer, optional): 每页大小 ,
     title (string, optional): 农工标题
     */

    private String addressCode;
    private double latitude;
    private double longitude;
    private int orderBy;
    private int page;
    private int size;
    private String title;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}