package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhoubo
 * @date 2020/6/1
 * @describe 查询找工作列表数据
 */
public class JobWantedData implements Serializable {

    /**
     * addTime : 发布时间
     * age : 年龄
     * area : 区
     * city : 市
     * defaultPicId : 默认图片ID
     * deleteStatus : 0使用 1禁用
     * distance : 距离
     * education : 学历 0小学 1中学 2高中 3专科 4本科
     * employmentStatus : 就业状态 0空闲中 1工作中
     * expectedIncome : 期望收入/天
     * isCollection : 是否收藏
     * jobWantedId : 主键
     * latitude : 纬度
     * longitude : 经度
     * name : 本人真实姓名
     * phone : 电话
     * picId : 图片ID 多张图片
     * picUrl : 图片默认地址
     * picUrls : 图片地址集合
     * professionalSkills : 职业技能
     * province : 省
     * scopeWork : 工作范围
     * sex : 性别 0男 1女
     * town : 镇
     * updateTime : 修改时间
     * userId : 用户ID
     */

    private String addTime;
    private Integer age;
    private String area;
    private String city;
    private Integer defaultPicId;
    private Integer deleteStatus;
    private double distance;
    private Integer education;
    private Integer employmentStatus;
    private double expectedIncome;
    private Integer isCollection;
    private Integer jobWantedId;
    private double latitude;
    private double longitude;
    private String name;
    private String phone;
    private String picId;
    private String picUrl;
    private List<String> picUrls;
    private String professionalSkills;
    private String province;
    private String scopeWork;
    private Integer sex;
    private String town;
    private String updateTime;
    private Integer userId;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(Integer employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public double getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(double expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    public Integer getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Integer isCollection) {
        this.isCollection = isCollection;
    }

    public Integer getJobWantedId() {
        return jobWantedId;
    }

    public void setJobWantedId(Integer jobWantedId) {
        this.jobWantedId = jobWantedId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public List<String> getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(List<String> picUrls) {
        this.picUrls = picUrls;
    }

    public String getProfessionalSkills() {
        return professionalSkills;
    }

    public void setProfessionalSkills(String professionalSkills) {
        this.professionalSkills = professionalSkills;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getScopeWork() {
        return scopeWork;
    }

    public void setScopeWork(String scopeWork) {
        this.scopeWork = scopeWork;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
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
