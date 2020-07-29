package com.fec.yunmall.projectcore.bean.Response;

import com.fec.yunmall.projectcore.bean.goods.ResponseGoods;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/3/28
 * @describe
 */
public class QueryProductByGoodsData {

    /**
     * goods : {"baseName":"string","checkingYield":0,"companyId":0,"finalCheckingYield":0,"goodsAcreage":0,"goodsCategory":"string","goodsCloseTime":"2020-03-28T03:51:00.342Z","goodsDescription":"string","goodsEarnestMoney":0,"goodsId":0,"goodsPeriod":0,"goodsPredict":0,"goodsPrice":0,"goodsPublishTime":"2020-03-28T03:51:00.342Z","goodsSpecs":"string","goodsStatus":0,"goodsSupplyTime":"2020-03-28T03:51:00.342Z","goodsTitle":"string","goodsType":"string","goodsVarieties":"string","inventory":0,"picId":"string","userCollectionId":0,"userId":0}
     * goodsTrace : [{"checkingComment":"string","checkingDate":"2020-03-28T03:51:00.342Z","checkingYield":0,"companyId":0,"fertilizeComment":"string","fertilizeDate":"2020-03-28T03:51:00.342Z","finalCheckingComment":"string","finalCheckingDate":"2020-03-28T03:51:00.342Z","finalCheckingName":"string","finalCheckingYield":0,"goodsDescription":"string","goodsId":0,"goodsPredict":0,"goodsPublishTime":"2020-03-28T03:51:00.342Z","goodsTraceId":0,"picId":"string","picUrl":"string","sowComment":"string","sowDate":"2020-03-28T03:51:00.342Z","traceStatus":0}]
     */

    private ResponseGoods goods;
    private List<ResponseTraceData> goodsTrace;

    public ResponseGoods getGoods() {
        return goods;
    }

    public void setGoods(ResponseGoods goods) {
        this.goods = goods;
    }

    public List<ResponseTraceData> getGoodsTrace() {
        return goodsTrace;
    }

    public void setGoodsTrace(List<ResponseTraceData> goodsTrace) {
        this.goodsTrace = goodsTrace;
    }
}
