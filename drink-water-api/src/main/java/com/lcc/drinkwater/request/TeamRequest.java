package com.lcc.drinkwater.request;

import com.lcc.drinkwater.vo.Team;
import com.lcc.water.common.ApiParam;

import java.util.List;

public class TeamRequest extends ApiParam {

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }



    private Team team;

    public List<TeamMemberRequest> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<TeamMemberRequest> memberList) {
        this.memberList = memberList;
    }

    private List<TeamMemberRequest> memberList;


}
