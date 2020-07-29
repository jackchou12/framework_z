package com.fec.yunmall.projectcore.bean.bill;

/**
 * @author zhoubo
 * @date 2020/3/31
 * @describe 账单
 */
public class BillBean {

    /**
     accountDetail (number, optional): 变动数目 ,
     accountFlowId (integer, optional),
     addTime (string, optional): 添加时间 ,
     comorderId (integer, optional): 相关订单id ,
     title (string, optional): 标题 ,
     userId (integer, optional)
     */

    private double accountDetail;
    private int accountFlowId;
    private String addTime;
    private String comorderId;
    private String title;
    private int userId;
    private Integer accountStatus;//状态 0 入账 1  出账


    public Integer getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(double accountDetail) {
        this.accountDetail = accountDetail;
    }

    public int getAccountFlowId() {
        return accountFlowId;
    }

    public void setAccountFlowId(int accountFlowId) {
        this.accountFlowId = accountFlowId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getComorderId() {
        return comorderId;
    }

    public void setComorderId(String comorderId) {
        this.comorderId = comorderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
