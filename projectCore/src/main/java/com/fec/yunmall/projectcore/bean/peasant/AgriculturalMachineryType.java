package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/5/28
 * @describe 查询农机分类返回对象
 */
public class AgriculturalMachineryType {

    /**
     addTime (string, optional): 农机类型添加时间 ,
     agrMacTypeId (integer, optional): agrMacTypeId ,
     agrMacTypeName (string, optional): 农机类型名称 ,
     agrMacTypeParentId (integer, optional): 农机类型父级ID ,
     agrMacTypeStatus (integer, optional): 农机类型状态 ,
     agriculturalMachineryTypes (Array[AgriculturalMachineryType], optional): 类型子集 ,
     elaborate (string, optional): 农机类型描述 ,
     updateTime (string, optional): 修改时间
     */

    private String addTime;
    private Integer agrMacTypeId;
    private String agrMacTypeName;
    private Integer agrMacTypeParentId;
    private String agrMacTypeStatus;
    private List<Integer> agriculturalMachineryTypes;
    private String elaborate;
    private String updateTime;
    private String firstLetter;

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getAgrMacTypeId() {
        return agrMacTypeId;
    }

    public void setAgrMacTypeId(Integer agrMacTypeId) {
        this.agrMacTypeId = agrMacTypeId;
    }

    public String getAgrMacTypeName() {
        return agrMacTypeName;
    }

    public void setAgrMacTypeName(String agrMacTypeName) {
        this.agrMacTypeName = agrMacTypeName;
    }

    public Integer getAgrMacTypeParentId() {
        return agrMacTypeParentId;
    }

    public void setAgrMacTypeParentId(Integer agrMacTypeParentId) {
        this.agrMacTypeParentId = agrMacTypeParentId;
    }

    public String getAgrMacTypeStatus() {
        return agrMacTypeStatus;
    }

    public void setAgrMacTypeStatus(String agrMacTypeStatus) {
        this.agrMacTypeStatus = agrMacTypeStatus;
    }

    public List<Integer> getAgriculturalMachineryTypes() {
        return agriculturalMachineryTypes;
    }

    public void setAgriculturalMachineryTypes(List<Integer> agriculturalMachineryTypes) {
        this.agriculturalMachineryTypes = agriculturalMachineryTypes;
    }

    public String getElaborate() {
        return elaborate;
    }

    public void setElaborate(String elaborate) {
        this.elaborate = elaborate;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
