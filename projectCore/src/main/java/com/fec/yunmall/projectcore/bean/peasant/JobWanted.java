package com.fec.yunmall.projectcore.bean.peasant;

import java.util.List;

/**
 * @author zhoubo
 * @date 2020/5/27
 * @describe 农工列表返回参数
 */
public class JobWanted {

    /**
     * count : 0
     * result : [{"addTime":"发布时间","agribusinessId":"主键","agribusinessStatus":"状态 0空闲时 1服务时","area":"区","city":"市","deleteStatus":"状态 0使用 1禁用","distance":"距离","endTime":"结束时间","isCollection":"是否收藏","latitude":"纬度","longitude":"经度","phone":"电话号码","price":"价格/天","province":"省","requirement":"用工要求","startTime":"开始时间","title":"标题","town":"镇","updateTime":"修改时间","userId":"用户ID","workplace":"工作地点"}]
     */

    private int count;
    private List<JobWantedData> result;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<JobWantedData> getResult() {
        return result;
    }

    public void setResult(List<JobWantedData> result) {
        this.result = result;
    }
}
