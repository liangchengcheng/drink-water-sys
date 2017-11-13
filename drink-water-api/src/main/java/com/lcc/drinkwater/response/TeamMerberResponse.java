package com.lcc.drinkwater.response;

import java.io.Serializable;

/**
 * Created by yangjiahui on 2017/8/15.
 */
public class TeamMerberResponse implements Serializable{


    private String teamId;
    private String userId;
    private String teamName;
    private String userName;
    private String jobUnit;
    private String phone;


    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobUnit() {
        return jobUnit;
    }

    public void setJobUnit(String jobUnit) {
        this.jobUnit = jobUnit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCareateTime() {
        return careateTime;
    }

    public void setCareateTime(String careateTime) {
        this.careateTime = careateTime;
    }

    private String careateTime;
}
