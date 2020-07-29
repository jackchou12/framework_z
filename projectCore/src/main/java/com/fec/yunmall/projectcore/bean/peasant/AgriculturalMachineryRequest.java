package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/5/26
 * @describe 请求农机列表入参
 */
public class AgriculturalMachineryRequest {


    /**
     addressCode (string, optional): 省市区Code ,
     agrMacName (string, optional): 农机名称 ,
     latitude (number, optional): 纬度 ,
     longitude (number, optional): 经度 ,
     orderBy (integer, optional): 综合排序 ,
     page (integer, optional): 当前页 ,
     size (integer, optional): 每页需要显示的条数 ,
     typeId (integer, optional): 农机类型

     */

    private String addressCode;
    private String agrMacName;
    private double latitude;
    private double longitude;
    private int orderBy;
    private int page;
    private int size;
    private int typeId;

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public String getAgrMacName() {
        return agrMacName;
    }

    public void setAgrMacName(String agrMacName) {
        this.agrMacName = agrMacName;
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

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
