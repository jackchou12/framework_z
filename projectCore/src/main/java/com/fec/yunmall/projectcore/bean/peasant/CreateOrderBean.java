package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/5/15
 * @describe
 */
public class CreateOrderBean {

    /**
     * addressId : 7
     * goods : [{"goodsId":20,"id":1,"number":20}]
     * uniqueness : string
     */

    private String addressId;
    private String uniqueness;
    private String remark;
    private List<GoodsBean> goods;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getUniqueness() {
        return uniqueness;
    }

    public void setUniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
    }

    public List<GoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsBean> goods) {
        this.goods = goods;
    }

    public static class GoodsBean {
        /**
         * goodsId : 20
         * id : 1
         * number : 20
         */

        private int goodsId;
        private String id;
        private String number;

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
