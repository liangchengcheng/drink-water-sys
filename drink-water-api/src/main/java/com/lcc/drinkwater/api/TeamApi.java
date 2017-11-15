package com.lcc.drinkwater.api;

import com.lcc.drinkwater.response.TeamAppResponse;
import com.lcc.drinkwater.response.TeamResponse;
import com.lcc.drinkwater.vo.Team;
import com.lcc.water.common.base.BaseService;

import java.util.List;
import java.util.Map;


public interface TeamApi extends BaseService<Team, String> {

    //新增团队
    boolean insertTeam(Team team);

    //修改团队
    boolean updateTeam(Team team);

    Team findById(String id);

    Team findByTeamName(String teamName);

    int updateStateTate(Map<String, Object> map);

    //获取成员分组
    List<TeamResponse> queryTeamByUser(Map<String, Object> map);

    List<TeamResponse> queryTeamList(Map<String, Object> map);

    List<String> queryTeamByUserId(Map<String, Object> map);

    List<TeamAppResponse> queryTeamAppByUser(Map<String, Object> map);


    List<TeamAppResponse> queryTeamAppList(Map<String, Object> map);


}
