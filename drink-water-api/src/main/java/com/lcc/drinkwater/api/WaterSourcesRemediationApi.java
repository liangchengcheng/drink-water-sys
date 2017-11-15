package com.lcc.drinkwater.api;

import com.lcc.drinkwater.request.MyDataRequest;
import com.lcc.drinkwater.request.WaterSourceRequest;
import com.lcc.drinkwater.response.*;
import com.lcc.drinkwater.vo.WaterSourcesRemediation;
import com.lcc.drinkwater.vo.utils.Page;
import com.lcc.drinkwater.vo.utils.PageParameter;
import com.lcc.water.common.base.BaseService;

import java.util.List;


public interface WaterSourcesRemediationApi extends BaseService<WaterSourcesRemediation, String> {

    //整治情况明细
    List<WaterSourcesRemediationResponse> searchRemediationSituation(String id);

    //整治情况明细app
    List<WaterSourcesRemediationResponse> searchRemediationSituationApp(String id);

    //查询水源地整治情况列表Web
    Page<RemediationListWebResponse> searchRemediationSituationListWeb(PageParameter pageParameter);


    //整治明细表导出
    List<RemediationInfoResponse> exportRemediationInfo(WaterSourceRequest waterSourceRequest);
   List<RenovateStatisticsResponse> getRenovateStatistics(WaterSourceRequest waterSourceRequest);

    List<MyDataRenovateResponse> getRenovateByTBR(MyDataRequest myDataRequest);

    Page<RemediationResponse> getRemediationList(PageParameter pageParameter);

    Page<MyDataRenovateResponse> queryRenovateByTBRPage(PageParameter pageParameter);

}
