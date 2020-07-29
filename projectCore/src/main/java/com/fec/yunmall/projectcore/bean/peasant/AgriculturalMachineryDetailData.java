package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhoubo
 * @date 2020/6/1
 * @describe 农机详情
 */
public class AgriculturalMachineryDetailData implements Serializable {

    /**
     * addTime : 发布时间
     * agrMacAddress : 农机服务范围
     * agrMacCharacteristic : 农机特点
     * agrMacCount : 农机总数量
     * agrMacDeleteStatus : 农机是否禁用状态
     * agrMacEndTime : 农机结束出租时间
     * agrMacId : 主键
     * agrMacName : 农机名称
     * agrMacNum : 农机库存数量
     * agrMacPicId : 农机图片ID
     * agrMacPrice : 农机出租价格
     * agrMacStartTime : 农机开始出租时间
     * agrMacStatus : 农机状态 0 空闲中 1 工作中
     * agrMacTypeId : 农机类型ID
     * area : 区(县)
     * city : 市
     * defaultPicId : 农机默认图片id
     * defaultPicUrl : 默认图片地址
     * distance : 距离
     * isCollection : 0
     * latitude : 纬度
     * longitude : 经度
     * phone : string
     * picUrls : 图片地址集合
     * province : 省
     * town : 镇
     * updateTime : 修改时间
     * userId : 用户ID
     */

    private String addTime;
    private String agrMacAddress;
    private String agrMacCharacteristic;
    private Integer agrMacCount;
    private Integer agrMacDeleteStatus;
    private String agrMacEndTime;
    private Integer agrMacId;
    private String agrMacName;
    private Integer agrMacNum;
    private String agrMacPicId;
    private double agrMacPrice;
    private String agrMacStartTime;
    private Integer agrMacStatus;
    private Integer agrMacTypeId;
    private String area;
    private String city;
    private Integer defaultPicId;
    private String defaultPicUrl;
    private double distance;
    private Integer isCollection;
    private double latitude;
    private double longitude;
    private String phone;
    private List<String> picUrls;
    private String province;
    private String town;
    private String updateTime;
    private Integer userId;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAgrMacAddress() {
        return agrMacAddress;
    }

    public void setAgrMacAddress(String agrMacAddress) {
        this.agrMacAddress = agrMacAddress;
    }

    public String getAgrMacCharacteristic() {
        return agrMacCharacteristic;
    }

    public void setAgrMacCharacteristic(String agrMacCharacteristic) {
        this.agrMacCharacteristic = agrMacCharacteristic;
    }

    public Integer getAgrMacCount() {
        return agrMacCount;
    }

    public void setAgrMacCount(Integer agrMacCount) {
        this.agrMacCount = agrMacCount;
    }

    public Integer getAgrMacDeleteStatus() {
        return agrMacDeleteStatus;
    }

    public void setAgrMacDeleteStatus(Integer agrMacDeleteStatus) {
        this.agrMacDeleteStatus = agrMacDeleteStatus;
    }

    public String getAgrMacEndTime() {
        return agrMacEndTime;
    }

    public void setAgrMacEndTime(String agrMacEndTime) {
        this.agrMacEndTime = agrMacEndTime;
    }

    public Integer getAgrMacId() {
        return agrMacId;
    }

    public void setAgrMacId(Integer agrMacId) {
        this.agrMacId = agrMacId;
    }

    public String getAgrMacName() {
        return agrMacName;
    }

    public void setAgrMacName(String agrMacName) {
        this.agrMacName = agrMacName;
    }

    public Integer getAgrMacNum() {
        return agrMacNum;
    }

    public void setAgrMacNum(Integer agrMacNum) {
        this.agrMacNum = agrMacNum;
    }

    public String getAgrMacPicId() {
        return agrMacPicId;
    }

    public void setAgrMacPicId(String agrMacPicId) {
        this.agrMacPicId = agrMacPicId;
    }

    public double getAgrMacPrice() {
        return agrMacPrice;
    }

    public void setAgrMacPrice(double agrMacPrice) {
        this.agrMacPrice = agrMacPrice;
    }

    public String getAgrMacStartTime() {
        return agrMacStartTime;
    }

    public void setAgrMacStartTime(String agrMacStartTime) {
        this.agrMacStartTime = agrMacStartTime;
    }

    public Integer getAgrMacStatus() {
        return agrMacStatus;
    }

    public void setAgrMacStatus(Integer agrMacStatus) {
        this.agrMacStatus = agrMacStatus;
    }

    public Integer getAgrMacTypeId() {
        return agrMacTypeId;
    }

    public void setAgrMacTypeId(Integer agrMacTypeId) {
        this.agrMacTypeId = agrMacTypeId;
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

    public Integer getDefaultPicId() {
        return defaultPicId;
    }

    public void setDefaultPicId(Integer defaultPicId) {
        this.defaultPicId = defaultPicId;
    }

    public String getDefaultPicUrl() {
        return defaultPicUrl;
    }

    public void setDefaultPicUrl(String defaultPicUrl) {
        this.defaultPicUrl = defaultPicUrl;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
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

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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
}
