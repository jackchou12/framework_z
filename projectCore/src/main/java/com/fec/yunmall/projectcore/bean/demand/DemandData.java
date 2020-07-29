package com.fec.yunmall.projectcore.bean.demand;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/4/7
 * @describe 需求数据
 */
public class DemandData {
    private int currPage;
    private List<DemandListData> list;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public List<DemandListData> getList() {
        return list;
    }

    public void setList(List<DemandListData> list) {
        this.list = list;
    }
}
