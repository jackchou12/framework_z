package com.fec.yunmall.projectcore.bean.peasant;

import java.io.Serializable;

/**
 * @author zhoubo
 * @date 2020/4/10
 * @describe New
 */
public class News implements Serializable {

    /**
     addTime (string, optional),
     addUser (string, optional),
     famskillDescription (string, optional): 说明 ,
     famskillVideoUrl (string, optional): 农技访问地址 ,
     farmingSkillId (integer, optional),
     farmskillName (string, optional): 农技名称 ,
     multipartFile (file, optional): 上传文件名 ,
     picUrl (string, optional): 图片路径 ,
     updateTime (string, optional),
     updateUser (string, optional),
     userCollectionId (integer, optional)
     */

    private String addTime;
    private String addUser;
    private String famskillDescription;
    private String famskillVideoUrl;
    private int farmingSkillId;
    private String farmskillName;
    private String picUrl;
    private String updateTime;
    private String updateUser;
    private int userCollectionId;
    private Integer isCollection;
    private String typeExplain;


    public String getTypeExplain() {
        return typeExplain;
    }

    public void setTypeExplain(String typeExplain) {
        this.typeExplain = typeExplain;
    }

    public Integer getIsCollection() {
        return isCollection;
    }

    public void setIsCollection(Integer isCollection) {
        this.isCollection = isCollection;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getAddUser() {
        return addUser;
    }

    public void setAddUser(String addUser) {
        this.addUser = addUser;
    }

    public String getFamskillDescription() {
        return famskillDescription;
    }

    public void setFamskillDescription(String famskillDescription) {
        this.famskillDescription = famskillDescription;
    }

    public String getFamskillVideoUrl() {
        return famskillVideoUrl;
    }

    public void setFamskillVideoUrl(String famskillVideoUrl) {
        this.famskillVideoUrl = famskillVideoUrl;
    }

    public int getFarmingSkillId() {
        return farmingSkillId;
    }

    public void setFarmingSkillId(int farmingSkillId) {
        this.farmingSkillId = farmingSkillId;
    }

    public String getFarmskillName() {
        return farmskillName;
    }

    public void setFarmskillName(String farmskillName) {
        this.farmskillName = farmskillName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(int userCollectionId) {
        this.userCollectionId = userCollectionId;
    }
}
