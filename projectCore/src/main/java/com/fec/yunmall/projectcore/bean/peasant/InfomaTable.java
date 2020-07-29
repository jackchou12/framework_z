package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/6/5
 * @describe 举报入参
 */
public class InfomaTable {

    /**
     * createTime : 投诉时间
     * details : 详情描述
     * infoId : 对应信息(商品id，农工信息id)id
     * informTableId : id
     * informUserId : 举报人id
     * title : 标题
     * type : 类型；1商品，2农机，3农工，4求职，5采购需求
     * typeName : string
     */

    private String createTime;
    private String details;
    private Integer infoId;
    private Integer informTableId;
    private Integer informUserId;
    private String title;
    private Integer type;
    private String typeName;

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public Integer getInformTableId() {
        return informTableId;
    }

    public void setInformTableId(Integer informTableId) {
        this.informTableId = informTableId;
    }

    public Integer getInformUserId() {
        return informUserId;
    }

    public void setInformUserId(Integer informUserId) {
        this.informUserId = informUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
