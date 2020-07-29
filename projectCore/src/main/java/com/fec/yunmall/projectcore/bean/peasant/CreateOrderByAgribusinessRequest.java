package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/5/26
 * @describe 创建农机订单入参对象
 */
public class CreateOrderByAgribusinessRequest {

    /**
     * address : 12
     * day : 5
     * endTime : 2020-05-30
     * orderDescribe : 订单描述
     * product : [{"id":1,"number":2}]
     * startTime : 2020-05-25
     */

    private String address;
    private int day;
    private String endTime;
    private String orderDescribe;
    private String startTime;
    private List<ProductBean> product;
    private Integer state; //农机传1  农工传2

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }

    public void setOrderDescribe(String orderDescribe) {
        this.orderDescribe = orderDescribe;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public List<ProductBean> getProduct() {
        return product;
    }

    public void setProduct(List<ProductBean> product) {
        this.product = product;
    }

    public static class ProductBean {
        /**
         * id : 1
         * number : 2
         */

        private int id;
        private int number;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
