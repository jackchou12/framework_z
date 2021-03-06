package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/1
 * @describe 农工详情data
 */
public class AgribusinessDetailData {

    /**
     * addTime : 发布时间
     * agribusinessId : 主键
     * agribusinessStatus : 状态 0空闲时 1服务时
     * area : 区
     * city : 市
     * deleteStatus : 状态 0使用 1禁用
     * distance : 距离
     * endTime : 结束时间
     * isCollection : 是否收藏
     * latitude : 纬度
     * longitude : 经度
     * phone : 电话号码
     * price : 价格/天
     * province : 省
     * requirement : 用工要求
     * startTime : 开始时间
     * title : 标题
     * town : 镇
     * updateTime : 修改时间
     * userId : 用户ID
     * workplace : 工作地点
     */

    private String addTime;
    private Integer agribusinessId;
    private Integer agribusinessStatus;
    private String area;
    private String city;
    private Integer deleteStatus;
    private double distance;
    private String endTime;
    private Integer isCollection;
    private double latitude;
    private double longitude;
    private String phone;
    private double price;
    private String province;
    private String requirement;
    private String startTime;
    private String title;
    private String town;
    private String updateTime;
    private Integer userId;
    private String workplace;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getAgribusinessId() {
        return agribusinessId;
    }

    public void setAgribusinessId(Integer agribusinessId) {
        this.agribusinessId = agribusinessId;
    }

    public Integer getAgribusinessStatus() {
        return agribusinessStatus;
    }

    public void setAgribusinessStatus(Integer agribusinessStatus) {
        this.agribusinessStatus = agribusinessStatus;
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

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Integer isCollection) {
        this.isCollection = isCollection;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }
}
