package com.lcc.drinkwater.api;

import com.lcc.drinkwater.request.UnitRequest;
import com.lcc.drinkwater.vo.Unit;
import com.lcc.water.common.base.BaseService;

import java.util.Map;


public interface UnitApi extends BaseService<Unit, String> {

    Map<String, Object> getUnitJson();

    Integer delete(String id);

    Integer update(UnitRequest unitRequest);

    Integer add(UnitRequest unitRequest);

    Unit findById(String id);

    Integer getMaxValue(Map<String, Object> map);

    int deleteByCode(Map<String, Object> map);

    Integer getMaxValueForParentIs0(Map<String, Object> map);

}
