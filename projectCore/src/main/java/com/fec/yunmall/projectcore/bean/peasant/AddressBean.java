package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/4/12
 * @describe 地址管理
 */
public class AddressBean implements Serializable {

    /**
     * addTime : string
     * addressArea : string
     * addressCity : string
     * addressDetailed : string
     * addressId : 0
     * addressPhone : string
     * addressProvince : string
     * addressTown : string
     * userId : 0
     * userName : string
     */

    private String addTime;
    private String addressArea;
    private String addressCity;
    private String addressDetailed;
    private int addressId;
    private String addressPhone;
    private String addressProvince;
    private String addressTown;
    private int userId;
    private String userName;
    private int defaultAddress; //0普通 1默认


    public int getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(int defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
