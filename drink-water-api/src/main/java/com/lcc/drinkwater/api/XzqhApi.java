package com.lcc.drinkwater.api;

import com.lcc.drinkwater.vo.Xzqh;
import com.lcc.water.common.base.BaseService;
import java.util.List;
import java.util.Map;

public interface XzqhApi extends BaseService<Xzqh, String> {

    Map<String, Object> getXzqhJson();

    List<Xzqh> xzqhtree();

    List<Xzqh> getXzqhList(String name);
}
