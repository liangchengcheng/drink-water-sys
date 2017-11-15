package com.lcc.drinkwater.api;

import com.lcc.drinkwater.request.DataRequest;
import com.lcc.drinkwater.request.MyDataRequest;
import com.lcc.drinkwater.request.WaterSourceRequest;
import com.lcc.drinkwater.response.*;
import com.lcc.drinkwater.vo.WaterSourcesInvestigation;
import com.lcc.drinkwater.vo.utils.Page;
import com.lcc.drinkwater.vo.utils.PageParameter;
import com.lcc.water.common.base.BaseService;

import java.util.List;
import java.util.Map;


public interface WaterSourcesInvestigationApi extends BaseService<WaterSourcesInvestigation, String> {

    //水源地排查情况列表
    List<WaterSourcesInvestigationResponse> searchInvestigationSituationList(String wsc);

    //水源地排查情况列表web
    Page<InvestigationSituationListWebResponse> searchInvestigationSituationListWeb(PageParameter pageParameter);

    //水源地排查情况明细
    WaterSourcesInvestigationInfoResponse searchInvestigationSituation(String id);

    //上传水源地排查情况
    Boolean addInvestigationSituation(DataRequest dataRequest, List<Map<String, byte[]>> list);

    List<CheckStatisticsResponse> getCheckStatistics(WaterSourceRequest waterSourceRequest);

    //导出水源地排查信息
    List<CheckInfoResponse> exportCheckInfo(WaterSourceRequest waterSourceRequest);

    List<MyDataCheckResponse> getCheckByTBR(MyDataRequest myDataRequest);

    Page<MyDataCheckResponse> queryCheckByTBRPage(PageParameter pageParameter);


}
