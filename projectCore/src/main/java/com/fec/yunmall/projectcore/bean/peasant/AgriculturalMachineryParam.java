package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/5/26
 * @describe 发布农机入参
 */
public class AgriculturalMachineryParam {
    /**
     * agrMacAddress : 农机地址
     * agrMacCharacteristic : 农机特点
     * agrMacCount : 数量
     * agrMacEndTime : 结束时间
     * agrMacId : ID
     * agrMacName : 农机名称
     * agrMacPicId : 图片ID
     * agrMacPrice : 价格
     * agrMacStartTime : 开始时间
     * agrMacTypeId : 农机类型ID
     * area : 区
     * city : 市
     * defaultPicId : 默认图片
     * latitude : 纬度
     * longitude : 经度
     * province : 省
     * town : 镇
     */

    private String agrMacAddress;
    private String agrMacCharacteristic;
    private Integer agrMacCount;
    private String agrMacEndTime;
    private Integer agrMacId;
    private String agrMacName;
    private String agrMacPicId;
    private double agrMacPrice;
    private String agrMacStartTime;
    private Integer agrMacTypeId;
    private String area;
    private String city;
    private Integer defaultPicId;
    private double latitude;
    private double longitude;
    private String province;
    private String town;

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


}
