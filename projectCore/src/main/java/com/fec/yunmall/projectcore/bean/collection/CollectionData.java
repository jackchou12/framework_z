package com.fec.yunmall.projectcore.bean.collection;

/**
 * @author zhoubo
 * @date 2020/3/30
 * @describe
 */
public class CollectionData {
    int type;
    CollectionListBean.FarmingSkillBean farmingSkillBean;
    CollectionListBean.GoodsCollectionBean goodsCollectionBean;
    CollectionListBean.ReleaseXqBean releaseXqBean;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CollectionListBean.FarmingSkillBean getFarmingSkillBean() {
        return farmingSkillBean;
    }

    public void setFarmingSkillBean(CollectionListBean.FarmingSkillBean farmingSkillBean) {
        this.farmingSkillBean = farmingSkillBean;
    }

    public CollectionListBean.GoodsCollectionBean getGoodsCollectionBean() {
        return goodsCollectionBean;
    }

    public void setGoodsCollectionBean(CollectionListBean.GoodsCollectionBean goodsCollectionBean) {
        this.goodsCollectionBean = goodsCollectionBean;
    }

    public CollectionListBean.ReleaseXqBean getReleaseXqBean() {
        return releaseXqBean;
    }

    public void setReleaseXqBean(CollectionListBean.ReleaseXqBean releaseXqBean) {
        this.releaseXqBean = releaseXqBean;
    }
}
