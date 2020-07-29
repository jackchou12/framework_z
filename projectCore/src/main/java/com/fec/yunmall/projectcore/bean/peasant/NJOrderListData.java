package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/6/2
 * @describe 农机订单列表数据
 */
public class NJOrderListData {

    /**
     * offset : 0
     * limit : 2147483647
     * total : 1
     * size : 30
     * pages : 1
     * current : 1
     * searchCount : true
     * openSort : true
     * optimizeCount : false
     * orderByField : null
     * records : [{"pay":"","deposit":120.30000000000001,"totalPrices":1203,"state":"0","purchaser":{"userId":4,"userName":"周三","phone":"18569545858","address":"湖南省郴州市北湖区鹏和超市","img":null,"vip":false},"seller":{"userId":23,"userName":"雷军1生产基地","phone":"15366619999","address":"湖南省 长沙市 芙蓉�  � 学士路","img":"","vip":false},"product":[{"order":"NJ1591086728862242035433078015","seller":"23","productId":"36","price":1203,"number":1,"img":null,"title":"打土机","gender":null,"age":null,"skill":null}],"addTime":"2020-06-02 16:32:08","updateTime":"2020-06-02 16:32:08","purchaserMessage":"1","sellerMessage":"0","imgs":"https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591065084439","startTime":"2020-06-23 00:00:00","endTime":"2020-06-24 00:00:00","orderDescribe":"你好","day":1,"address":"23","statueStr":"未支付"}]
     * condition : null
     * asc : true
     * offsetCurrent : 0
     */

    private int offset;
    private int limit;
    private int total;
    private int size;
    private int pages;
    private int current;
    private boolean searchCount;
    private boolean openSort;
    private boolean optimizeCount;
    private boolean asc;
    private int offsetCurrent;
    private List<RecordsBean> records;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public boolean isOpenSort() {
        return openSort;
    }

    public void setOpenSort(boolean openSort) {
        this.openSort = openSort;
    }

    public boolean isOptimizeCount() {
        return optimizeCount;
    }

    public void setOptimizeCount(boolean optimizeCount) {
        this.optimizeCount = optimizeCount;
    }



    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public int getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(int offsetCurrent) {
        this.offsetCurrent = offsetCurrent;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class RecordsBean {
        /**
         * pay :
         * deposit : 120.30000000000001
         * totalPrices : 1203
         * state : 0
         * purchaser : {"userId":4,"userName":"周三","phone":"18569545858","address":"湖南省郴州市北湖区鹏和超市","img":null,"vip":false}
         * seller : {"userId":23,"userName":"雷军1生产基地","phone":"15366619999","address":"湖南省 长沙市 芙蓉�  � 学士路","img":"","vip":false}
         * product : [{"order":"NJ1591086728862242035433078015","seller":"23","productId":"36","price":1203,"number":1,"img":null,"title":"打土机","gender":null,"age":null,"skill":null}]
         * addTime : 2020-06-02 16:32:08
         * updateTime : 2020-06-02 16:32:08
         * purchaserMessage : 1
         * sellerMessage : 0
         * imgs : https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591065084439
         * startTime : 2020-06-23 00:00:00
         * endTime : 2020-06-24 00:00:00
         * orderDescribe : 你好
         * day : 1
         * address : 23
         * statueStr : 未支付
         */

        private String pay;
        private double deposit;
        private double totalPrices;
        private String state;
        private PurchaserBean purchaser;
        private SellerBean seller;
        private String addTime;
        private String updateTime;
        private String purchaserMessage;
        private String sellerMessage;
        private String imgs;
        private String startTime;
        private String endTime;
        private String orderDescribe;
        private int day;
        private String address;
        private String statueStr;
        private List<ProductBean> product;

        public String getPay() {
            return pay;
        }

        public void setPay(String pay) {
            this.pay = pay;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public double getTotalPrices() {
            return totalPrices;
        }

        public void setTotalPrices(double totalPrices) {
            this.totalPrices = totalPrices;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public PurchaserBean getPurchaser() {
            return purchaser;
        }

        public void setPurchaser(PurchaserBean purchaser) {
            this.purchaser = purchaser;
        }

        public SellerBean getSeller() {
            return seller;
        }

        public void setSeller(SellerBean seller) {
            this.seller = seller;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getPurchaserMessage() {
            return purchaserMessage;
        }

        public void setPurchaserMessage(String purchaserMessage) {
            this.purchaserMessage = purchaserMessage;
        }

        public String getSellerMessage() {
            return sellerMessage;
        }

        public void setSellerMessage(String sellerMessage) {
            this.sellerMessage = sellerMessage;
        }

        public String getImgs() {
            return imgs;
        }

        public void setImgs(String imgs) {
            this.imgs = imgs;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
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

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getStatueStr() {
            return statueStr;
        }

        public void setStatueStr(String statueStr) {
            this.statueStr = statueStr;
        }

        public List<ProductBean> getProduct() {
            return product;
        }

        public void setProduct(List<ProductBean> product) {
            this.product = product;
        }

        public static class PurchaserBean {
            /**
             * userId : 4
             * userName : 周三
             * phone : 18569545858
             * address : 湖南省郴州市北湖区鹏和超市
             * img : null
             * vip : false
             */

            private int userId;
            private String userName;
            private String phone;
            private String address;
            private Object img;
            private boolean vip;

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

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public Object getImg() {
                return img;
            }

            public void setImg(Object img) {
                this.img = img;
            }

            public boolean isVip() {
                return vip;
            }

            public void setVip(boolean vip) {
                this.vip = vip;
            }
        }

        public static class SellerBean {
            /**
             * userId : 23
             * userName : 雷军1生产基地
             * phone : 15366619999
             * address : 湖南省 长沙市 芙蓉�  � 学士路
             * img :
             * vip : false
             */

            private int userId;
            private String userName;
            private String phone;
            private String address;
            private String img;
            private boolean vip;

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

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isVip() {
                return vip;
            }

            public void setVip(boolean vip) {
                this.vip = vip;
            }
        }

        public static class ProductBean {
            /**
             * order : NJ1591086728862242035433078015
             * seller : 23
             * productId : 36
             * price : 1203
             * number : 1
             * img : null
             * title : 打土机
             * gender : null
             * age : null
             * skill : null
             *
             * "order":"NG1591098121208023350030536115",
             * "seller":"13",
             * "productId":"26",
             * "price":200.0,
             * "number":1,
             * "img":"https://hnyydsj.oss-cn-shenzhen.aliyuncs.com/2020/5/0/1591066110236",
             * "title":"奇哥",
             * "gender":"男",
             * "age":"20",
             * "skill":"会做事"
             */

            private String order;
            private String seller;
            private String productId;
            private int price;
            private int number;
            private String img;
            private String title;
            private String gender;
            private String age;
            private String skill;

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }

            public String getSeller() {
                return seller;
            }

            public void setSeller(String seller) {
                this.seller = seller;
            }

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getAge() {
                return age;
            }

            public void setAge(String age) {
                this.age = age;
            }

            public String getSkill() {
                return skill;
            }

            public void setSkill(String skill) {
                this.skill = skill;
            }
        }
    }
}
