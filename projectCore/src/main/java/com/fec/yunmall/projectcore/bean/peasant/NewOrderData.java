package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/5/15
 * @describe 购物车提交订单返回
 */
public class NewOrderData{
    private String item;
    private List<OrderData1> order;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<OrderData1> getOrder() {
        return order;
    }

    public void setOrder(List<OrderData1> order) {
        this.order = order;
    }
    public static class OrderData1{


        /**
         * comorderId : YY1589537715859364875446300263
         * goodsId : 29
         * address : 北京市市辖区西城区西长安街街道办事处觉得亟待解决
         * picId : 75
         * comorderConsumeid : 8
         * phone : 13636363636
         * comorderProvideid : 2
         * productionId : 19
         * comorderNumber : 1
         * comorderTotal : 100
         * comorderPrice : 100
         * comorderStatus : 0
         * comorderDescription : null
         * comorderFreight : 0
         * addUser : 8
         * updateUser : 8
         * updateTime : 2020-05-15T10:15:16.000+0000
         * comorderCar : null
         * comorderLogistics : null
         * addTime : 2020-05-15T10:15:16.000+0000
         * rmCarriage : 2
         * buyMessageStatus : 1
         * sellMessageStatus : 1
         * comorderDeposit : 20.0
         * deliveryTime : null
         * shopping_car_id : null
         * version : 1
         */

        private String comorderId;
        private int goodsId;
        private String address;
        private String picId;
        private String comorderConsumeid;
        private String phone;
        private String comorderProvideid;
        private String productionId;
        private String comorderNumber;
        private String comorderTotal;
        private String comorderPrice;
        private String comorderStatus;
        private String comorderDescription;
        private String comorderFreight;
        private String addUser;
        private String updateUser;
        private String updateTime;
        private Object comorderCar;
        private Object comorderLogistics;
        private String addTime;
        private String rmCarriage;
        private String buyMessageStatus;
        private String sellMessageStatus;
        private String comorderDeposit;
        private Object deliveryTime;
        private Object shopping_car_id;
        private String version;

        public String getComorderId() {
            return comorderId;
        }

        public void setComorderId(String comorderId) {
            this.comorderId = comorderId;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPicId() {
            return picId;
        }

        public void setPicId(String picId) {
            this.picId = picId;
        }

        public String getComorderConsumeid() {
            return comorderConsumeid;
        }

        public void setComorderConsumeid(String comorderConsumeid) {
            this.comorderConsumeid = comorderConsumeid;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getComorderProvideid() {
            return comorderProvideid;
        }

        public void setComorderProvideid(String comorderProvideid) {
            this.comorderProvideid = comorderProvideid;
        }

        public String getProductionId() {
            return productionId;
        }

        public void setProductionId(String productionId) {
            this.productionId = productionId;
        }

        public String getComorderNumber() {
            return comorderNumber;
        }

        public void setComorderNumber(String comorderNumber) {
            this.comorderNumber = comorderNumber;
        }

        public String getComorderTotal() {
            return comorderTotal;
        }

        public void setComorderTotal(String comorderTotal) {
            this.comorderTotal = comorderTotal;
        }

        public String getComorderPrice() {
            return comorderPrice;
        }

        public void setComorderPrice(String comorderPrice) {
            this.comorderPrice = comorderPrice;
        }

        public String getComorderStatus() {
            return comorderStatus;
        }

        public void setComorderStatus(String comorderStatus) {
            this.comorderStatus = comorderStatus;
        }

        public String getComorderDescription() {
            return comorderDescription;
        }

        public void setComorderDescription(String comorderDescription) {
            this.comorderDescription = comorderDescription;
        }

        public String getComorderFreight() {
            return comorderFreight;
        }

        public void setComorderFreight(String comorderFreight) {
            this.comorderFreight = comorderFreight;
        }

        public String getAddUser() {
            return addUser;
        }

        public void setAddUser(String addUser) {
            this.addUser = addUser;
        }

        public String getUpdateUser() {
            return updateUser;
        }

        public void setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public Object getComorderCar() {
            return comorderCar;
        }

        public void setComorderCar(Object comorderCar) {
            this.comorderCar = comorderCar;
        }

        public Object getComorderLogistics() {
            return comorderLogistics;
        }

        public void setComorderLogistics(Object comorderLogistics) {
            this.comorderLogistics = comorderLogistics;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getRmCarriage() {
            return rmCarriage;
        }

        public void setRmCarriage(String rmCarriage) {
            this.rmCarriage = rmCarriage;
        }

        public String getBuyMessageStatus() {
            return buyMessageStatus;
        }

        public void setBuyMessageStatus(String buyMessageStatus) {
            this.buyMessageStatus = buyMessageStatus;
        }

        public String getSellMessageStatus() {
            return sellMessageStatus;
        }

        public void setSellMessageStatus(String sellMessageStatus) {
            this.sellMessageStatus = sellMessageStatus;
        }

        public String getComorderDeposit() {
            return comorderDeposit;
        }

        public void setComorderDeposit(String comorderDeposit) {
            this.comorderDeposit = comorderDeposit;
        }

        public Object getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(Object deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public Object getShopping_car_id() {
            return shopping_car_id;
        }

        public void setShopping_car_id(Object shopping_car_id) {
            this.shopping_car_id = shopping_car_id;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }
    }
}
