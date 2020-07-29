package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author ：luoxiang
 * @description：  vip状态表
 * @date ：2020/5/19 11:12
 */
public class VipData {



    private Integer asVipId;

    /*@TableField("user_id")
    @ApiModelProperty("用户id")*/
    private Integer userId;

   /* @TableField("vip_status")
    @ApiModelProperty("是否开通vip；vip状态；0不是，1是；")*/
    private Boolean vipStatus;

   /* @TableField("valid_time")
    @ApiModelProperty("有效时间")*/
    private String validTime;

   /* @TableField("pay_money")
    @ApiModelProperty("支付金额")*/
    private Double payMoney;

   /* @TableField("create_time")
    @ApiModelProperty("生效时间")*/
    private String createTime;

   /* @TableField("close_time")
    @ApiModelProperty("失效时间")*/
    private String closeTime;


    public Integer getAsVipId() {
        return asVipId;
    }

    public void setAsVipId(Integer asVipId) {
        this.asVipId = asVipId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Boolean vipStatus) {
        this.vipStatus = vipStatus;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }
}
