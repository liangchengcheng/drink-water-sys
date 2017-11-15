package com.lcc.drinkwater.api;

import com.lcc.drinkwater.response.GeoResponse;
import com.lcc.drinkwater.vo.utils.Page;
import com.lcc.water.common.base.BaseService;

import java.util.List;

public interface GeoApi extends BaseService<GeoResponse, String> {

    List<GeoResponse> getGeoJson(String xzqh);


    void getGeoJsonXml(String xzqh, String type);

    void getGeoJsonXmlAll();

    /**
     * 分页查询
     *
     * @param xzqh    关键词
     * @param current 当前页
     * @param limit   每页显示条数
     * @return 返回符合条件的结果
     */
    Page<GeoResponse> queryGeoList(String xzqh, int current, int limit);
}
