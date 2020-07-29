package com.fec.yunmall.projectcore.bean.Response;

/**
 * @author zhoubo
 * @date 2020/3/27
 * @describe 分类弹窗显示数据
 */
public class ResTypeBean {
    private int Id;
    private int PId;
    private String name;
    private String firstLast;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLast() {
        return firstLast;
    }

    public void setFirstLast(String firstLast) {
        this.firstLast = firstLast;
    }
}
