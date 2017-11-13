package com.lcc.drinkwater.response;

import java.io.Serializable;

/**
 * Created by yangjiahui on 2017/8/15.
 */
public class TeamResponse implements Serializable {

    private String teamId;
    private String teamName;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int state;

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    private String members;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
