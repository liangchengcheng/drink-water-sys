package com.lcc.drinkwater.api;

import com.lcc.drinkwater.response.TeamMerberAppResponse;
import com.lcc.drinkwater.vo.TeamMerber;
import com.lcc.water.common.base.BaseService;
import java.util.List;

public interface TeamMerberApi extends BaseService<TeamMerber, String> {

    //添加成员
    boolean saveMerber(TeamMerber merber);

    //删除成员
    boolean deleteByTeamIdAndUserId(String teamId, String userId);

    TeamMerber selectByTeamIdAndUserId(String teamId, String userId);

    //获取分组成员
    List<TeamMerber> queryTeamMerberByTeamId(String teamId);
    List<TeamMerberAppResponse> queryTeamAppMerberByTeamId(String teamId);


    List<String> getNameList(String teamId);

}
