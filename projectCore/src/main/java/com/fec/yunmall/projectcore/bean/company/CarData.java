package com.fec.yunmall.projectcore.bean.company;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 车辆数据
 */
public class CarData implements Serializable {

    /**
     * addTime : string
     * addUser : string
     * carId : 0
     * companyId : 0
     * gps : string
     * mobile : string
     * motorman : string
     * plateNumber : string
     * status : 0
     * type : string
     * updateTime : string
     * updateUser : string
     */

    private String addTime;
    private String addUser;
    private int carId;
    private int companyId;
    private String gps;
    private String mobile;
    private String motorman;
    private String plateNumber;
    private int status;
    private String type;
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

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMotorman() {
        return motorman;
    }

    public void setMotorman(String motorman) {
        this.motorman = motorman;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
