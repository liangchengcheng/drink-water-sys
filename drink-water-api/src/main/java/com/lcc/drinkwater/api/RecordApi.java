package com.lcc.drinkwater.api;

import com.lcc.drinkwater.vo.Record;
import com.lcc.water.common.base.BaseService;
import java.util.Date;
import java.util.Map;


public interface RecordApi extends BaseService<Record, String> {

    Map<String, Object> updateBaseData(Date date);

    //增量更新水源地数据
    Map<String, Object> updateInvestigationSituation(Date date, String xc);

}
