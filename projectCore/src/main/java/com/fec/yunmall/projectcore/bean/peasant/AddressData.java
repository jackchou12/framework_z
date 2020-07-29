package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/12
 * @describe 搜索全国地址返回
 */
public class AddressData {

    /**
     * chinaAddressDictionaryId : 0
     * code : string
     * createTime : 2020-04-12T08:37:05.587Z
     * level : 0
     * name : string
     * parentCode : string
     */

    private int chinaAddressDictionaryId;
    private String code;
    private String createTime;
    private int level;
    private String name;
    private String parentCode;


    public int getChinaAddressDictionaryId() {
        return chinaAddressDictionaryId;
    }

    public void setChinaAddressDictionaryId(int chinaAddressDictionaryId) {
        this.chinaAddressDictionaryId = chinaAddressDictionaryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }
}
