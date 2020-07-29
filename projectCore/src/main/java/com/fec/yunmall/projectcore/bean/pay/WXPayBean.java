package com.fec.yunmall.projectcore.bean.pay;

/**
 * @author zhoubo
 * @date 2020/4/23
 * @describe
 */
public class WXPayBean {
    private SignMap signMap;

    public SignMap getSignMap() {
        return signMap;
    }

    public void setSignMap(SignMap signMap) {
        this.signMap = signMap;
    }

    public static class SignMap{
       private String appid;
       private String noncestr;
       private String orderNo;
       private String partnerid;
       private String prepayid;
       private String sign;
       private long timestamp;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getNoncestr() {
            return noncestr;
        }

        public void setNoncestr(String noncestr) {
            this.noncestr = noncestr;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getPartnerid() {
            return partnerid;
        }

        public void setPartnerid(String partnerid) {
            this.partnerid = partnerid;
        }

        public String getPrepayid() {
            return prepayid;
        }

        public void setPrepayid(String prepayid) {
            this.prepayid = prepayid;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(long timestamp) {
            this.timestamp = timestamp;
        }
    }
}
