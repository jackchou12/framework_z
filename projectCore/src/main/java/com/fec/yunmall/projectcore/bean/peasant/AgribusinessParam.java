package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/5/26
 * @describe 发布农工入参
 */
public class AgribusinessParam {
    /**
     * agribusinessId : ID
     * area : 区
     * city : 市
     * endTime : 结束时间
     * latitude : 纬度
     * longitude : 经度
     * price : 价格
     * province : 省
     * requirement : 用工要求
     * startTime : 开始时间
     * title : 标题
     * town : 镇
     * workplace : 工作地点
     */

    private Integer agribusinessId;
    private String area;
    private String city;
    private String endTime;
    private double latitude;
    private double longitude;
    private double price;
    private String province;
    private String requirement;
    private String startTime;
    private String title;
    private String town;
    private String workplace;

    public Integer getAgribusinessId() {
        return agribusinessId;
    }

    public void setAgribusinessId(Integer agribusinessId) {
        this.agribusinessId = agribusinessId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

}
