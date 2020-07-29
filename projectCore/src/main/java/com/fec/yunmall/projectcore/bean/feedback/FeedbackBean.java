package com.fec.yunmall.projectcore.bean.feedback;

/**
 * @author zhoubo
 * @date 2020/5/6
 * @describe 用户反馈请求实体
 */
public class FeedbackBean {

    /**
     * addTime : string
     * details : string
     * opinionId : 0
     * readTime : string
     * status : 0
     * title : string
     * userId : 0
     */

    private String addTime;
    private String details;
    private Integer opinionId;
    private String readTime;
    private Integer status;
    private String title;
    private Integer userId;

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(int opinionId) {
        this.opinionId = opinionId;
    }

    public String getReadTime() {
        return readTime;
    }

    public void setReadTime(String readTime) {
        this.readTime = readTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
