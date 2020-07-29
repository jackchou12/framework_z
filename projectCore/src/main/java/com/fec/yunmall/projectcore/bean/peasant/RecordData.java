package com.fec.yunmall.projectcore.bean.peasant;

/**
 * @author zhoubo
 * @date 2020/4/14
 * @describe 溯源recorddata
 */
public class RecordData {

    /**
     * name : string
     * total : 0
     * traceStatus : 0
     */

    private String name;
    private int total;
    private Integer traceStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Integer getTraceStatus() {
        return traceStatus;
    }

    public void setTraceStatus(Integer traceStatus) {
        this.traceStatus = traceStatus;
    }
}
