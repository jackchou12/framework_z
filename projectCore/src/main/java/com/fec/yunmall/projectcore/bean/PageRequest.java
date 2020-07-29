package com.fec.yunmall.projectcore.bean;

/**
 * @author zhoubo
 * @date 2020/3/26
 * @describe 页面数据
 */
public class PageRequest {

    /**
     * condition : string
     * page : 0
     * size : 0
     */
    private String id;
    private String condition;//描述
    private int page; //页码
    private int size; //数量


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
