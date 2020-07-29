package com.fec.yunmall.projectcore.bean.order;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe 订单返回数据
 */
public class OrderData {

    /**
     addTime (string, optional): 创建时间
     ,

     address (string, optional): 地址
     ,

     buyMessageStatus (integer, optional): 是否新状态。如果为1，则是买家未读。为2则已读
     ,

     comorderCar (string, optional): 车辆信息主键
     ,

     comorderConsumeid (string, optional): 买家
     ,

     comorderDescription (string, optional): 描述
     ,

     comorderFreight (number, optional): 运费
     ,

     comorderId (integer, optional): 订单ID
     ,

     comorderLogistics (string, optional): 运输方式。0:卖方配送（车辆运送）。1:物流发送
     ,

     comorderNumber (integer, optional): 商品数量
     ,

     comorderPrice (number, optional): 单价
     ,

     comorderProvideid (string, optional): 卖家
     ,

     comorderStatus (integer, optional): 1和0：新订单（只是区别接单状态），2已付款，3:已发货,4已完成，5退款中，6已取消，7，已删除。新建订单默认为1
     ,

     comorderTotal (number, optional): 总价
     ,

     goods (ResultGoods, optional): 商品
     ,

     newStatus (string, optional): 是否是新状态
     ,

     orderPrompt (string, optional): 订单提示语
     ,

     phone (string, optional): 买家联系方式
     ,

     picId (string, optional): 图片
     ,

     sellMessageStatus (integer, optional): 是否新状态。如果为1，则是卖家未读。未2则已读
     ,

     status (string, optional): 状态描述
     ,

     userId (integer, optional): 买家ID
     ,

     userName (string, optional): 买家姓名

     }ResultGoods {
     goodsId (integer, optional): 主键
     ,

     goodsTitle (string, optional): 商品标题
     ,

     picId (string, optional): 图片

     */

    private boolean asc;
    private ConditionBean condition;
    private int current;
    private int limit;
    private int offset;
    private int offsetCurrent;
    private boolean openSort;
    private boolean optimizeCount;
    private String orderByField;
    private int pages;
    private boolean searchCount;
    private int size;
    private int total;
    private List<RecordsBean> records;

    public boolean isAsc() {
        return asc;
    }

    public void setAsc(boolean asc) {
        this.asc = asc;
    }

    public ConditionBean getCondition() {
        return condition;
    }

    public void setCondition(ConditionBean condition) {
        this.condition = condition;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffsetCurrent() {
        return offsetCurrent;
    }

    public void setOffsetCurrent(int offsetCurrent) {
        this.offsetCurrent = offsetCurrent;
    }

    public boolean isOpenSort() {
        return openSort;
    }

    public void setOpenSort(boolean openSort) {
        this.openSort = openSort;
    }

    public boolean isOptimizeCount() {
        return optimizeCount;
    }

    public void setOptimizeCount(boolean optimizeCount) {
        this.optimizeCount = optimizeCount;
    }

    public String getOrderByField() {
        return orderByField;
    }

    public void setOrderByField(String orderByField) {
        this.orderByField = orderByField;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isSearchCount() {
        return searchCount;
    }

    public void setSearchCount(boolean searchCount) {
        this.searchCount = searchCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    public static class ConditionBean {
    }


}
