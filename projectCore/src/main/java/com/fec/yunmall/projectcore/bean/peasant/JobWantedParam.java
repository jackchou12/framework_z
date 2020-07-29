package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/1
 * @describe 农户找工作入参对象
 */
public class JobWantedParam {

    /**
     * age : 年龄
     * area : 区
     * city : 市
     * defaultPicId : 默认图片ID
     * education : 学历 0小学 1中学 2高中 3专科 4本科
     * employmentStatus : 就业状态
     * expectedIncome : 期望收入
     * jobWantedId : ID
     * latitude : 纬度
     * longitude : 经度
     * name : 本人真实姓名
     * picId : 图片ID
     * professionalSkills : 职业技能
     * province : 省
     * scopeWork : 工作范围
     * sex : 性别 0男 1女
     * town : 镇
     */

    private Integer age;
    private String area;
    private String city;
    private Integer defaultPicId;
    private Integer education;
    private Integer employmentStatus;
    private double expectedIncome;
    private Integer jobWantedId;
    private double latitude;
    private double longitude;
    private String name;
    private String picId;
    private String professionalSkills;
    private String province;
    private String scopeWork;
    private Integer sex;
    private String town;

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

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
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
}
