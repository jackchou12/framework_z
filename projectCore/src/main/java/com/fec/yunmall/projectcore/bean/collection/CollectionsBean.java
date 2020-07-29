package com.fec.yunmall.projectcore.bean.collection;

/**
 * @author zhoubo
 * @date 2020/3/26
 * @describe 收藏bean
 */
public class CollectionsBean {

    /**
     addTime (string, optional): 创建时间String
     ,

     farmskillId (Integereger, optional): 农技（收藏方：生产基地）
     ,

     goodsDemandId (Integereger, optional): 商品采购需求（收藏方：企业）
     ,

     goodsId (Integereger, optional): 农产品（收藏方：采购商）
     ,

     userCollectionId (Integereger, optional): 收藏主键
     ,

     userId (Integereger, optional): 用户id

     */

    private String addTime;//创建时间String
    private Integer farmskillId;//农技（收藏方：生产基地）
    private Integer goodsDemandId; //商品采购需求（收藏方：企业）
    private Integer goodsId;  //农产品（收藏方：采购商）
    private Integer userCollectionId; //收藏主键
    private Integer userId; //用户id
    private Integer jobWantedId; //求职收藏
    private Integer agribusinessId;//农工收藏
    private Integer agrMacId;//农机收藏
    public Integer getJobWantedId() {
        return jobWantedId;
    }

    public void setJobWantedId(Integer jobWantedId) {
        this.jobWantedId = jobWantedId;
    }

    public Integer getAgribusinessId() {
        return agribusinessId;
    }

    public void setAgribusinessId(Integer agribusinessId) {
        this.agribusinessId = agribusinessId;
    }

    public Integer getAgrMacId() {
        return agrMacId;
    }

    public void setAgrMacId(Integer agrMacId) {
        this.agrMacId = agrMacId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public Integer getFarmskillId() {
        return farmskillId;
    }

    public void setFarmskillId(Integer farmskillId) {
        this.farmskillId = farmskillId;
    }

    public Integer getGoodsDemandId() {
        return goodsDemandId;
    }

    public void setGoodsDemandId(Integer goodsDemandId) {
        this.goodsDemandId = goodsDemandId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getUserCollectionId() {
        return userCollectionId;
    }

    public void setUserCollectionId(Integer userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
