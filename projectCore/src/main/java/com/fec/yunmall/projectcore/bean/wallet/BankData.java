package com.fec.yunmall.projectcore.bean.wallet;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 银行卡数据
 */
public class BankData implements Serializable {


    /**
     addTime (string, optional): 创建时间 ,
     bankCardId (integer, optional),
     bankName (string, optional): 银行名称 ,
     bankNumber (string, optional): 银行卡号 ,
     openBank (string, optional): 开户银行 ,
     openPhone (string, optional): 银行名称 ,
     type (integer, optional): 对应银行码：中国银行1，农业银行2，工商银行3，建设银行4，交通银行5，中国邮政储蓄银行6，长沙银行7，招商银行8，其他银行9 ,
     userCard (string, optional): 用户身份证 ,
     userId (integer, optional): 用户id ,
     userName (string, optional)
     */

    private String addTime;
    private int bankCardId;
    private String bankName;
    private String bankNumber;
    private String openBank;
    private String openPhone;
    private int type;
    private String userCard;
    private int userId;
    private String userName;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(int bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenPhone() {
        return openPhone;
    }

    public void setOpenPhone(String openPhone) {
        this.openPhone = openPhone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard;
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
