package com.lcc.drinkwater.api;


import com.lcc.drinkwater.request.MyDataRequest;
import com.lcc.drinkwater.request.WaterSourceRequest;
import com.lcc.drinkwater.request.WaterSourcesBaseInfoRequest;
import com.lcc.drinkwater.response.*;
import com.lcc.drinkwater.vo.WaterSources;
import com.lcc.drinkwater.vo.utils.Page;
import com.lcc.drinkwater.vo.utils.PageParameter;
import com.lcc.water.common.base.BaseService;

import java.util.List;

public interface WaterSourcesApi extends BaseService<WaterSources, String> {

    //相关问题列表
    Page<QuestionListResponse> searchQuestionList(PageParameter parameter);

    //查询水源地基本信息
    WaterSourcesBaseInfoResponse searchWaterSourcesBaseInfo(String wsc);

    List<MyDataBaseInfoResponse> getBaseInfoByTBR(MyDataRequest myDataRequest);

    Page<MyDataBaseInfoResponse> queryBaseInfoByTBRPage(PageParameter page);


    //查询水源地基本信息列表Web
    Page<BaseInfoListWebResponse> searchWaterSourcesBaseInfoListWeb(PageParameter pageParameter);

    //查询水源地列表
    List<WaterSourcesListResponse> searchWaterSourcesList(String cityName);
    List<WaterSourcesListResponse> searchWaterSourcesList2(String cityName, String code);

    //保存水源地基本信息
    boolean saveWaterSourcesBaseInfo(WaterSourcesBaseInfoRequest waterSourcesBaseInfoRequest);

    List<BaseInfoResponse> exportBaseInfo(WaterSourceRequest waterSourceRequest);

}
