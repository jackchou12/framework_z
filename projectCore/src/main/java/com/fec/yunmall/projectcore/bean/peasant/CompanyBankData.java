package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/5/16
 * @describe
 */
public class CompanyBankData {

    /**
     * companyAccountNumber : 810000177772000001
     * companyName : 湖南誉元大数据产业发展有限公司郴州分公司
     * account : 长沙银行郴州分行
     */

    private String companyAccountNumber;
    private String companyName;
    private String account;

    public String getCompanyAccountNumber() {
        return companyAccountNumber;
    }

    public void setCompanyAccountNumber(String companyAccountNumber) {
        this.companyAccountNumber = companyAccountNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
