package com.fec.yunmall.projectcore.base.router;

/**
 * @author
 * @date 2019/1/24  17:14
 * @describe ${基本的RouterPath}
 * 注意:path路径模式”/app/xxxx/”,Aouter 要求path必须有至少两级的路径,
 * 不同module的一级路径必须不同，否则会导致一个moudle中的一级路径失效！
 */
public interface RouterPath {


    String PEASANT_HOME = "/peasant_chosedate_item/home";
    String PEASANT_FARM = "/peasant_chosedate_item/farm";
    String PEASANT_MESSAGE = "/peasant_chosedate_item/message";
    String PEASANT_MINE = "/peasant_chosedate_item/mine";


}
