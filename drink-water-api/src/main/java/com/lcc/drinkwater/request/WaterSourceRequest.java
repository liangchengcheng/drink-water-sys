package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

import java.util.Date;


public class WaterSourceRequest extends ApiParam {

    @SerializedName("name")
    private String n;
    @SerializedName("beginTime")
    private Date bt;
    @SerializedName("endTime")
    private Date et;
    @SerializedName("xzqh")
    private String ct;
    @SerializedName("since")
    private String is;

    private String teamIds;

    public String getTeamIds() {
        return teamIds;
    }

    public void setTeamIds(String teamIds) {
        this.teamIds = teamIds;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    private String userCode;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public Date getBt() {
        return bt;
    }

    public void setBt(Date bt) {
        this.bt = bt;
    }

    public Date getEt() {
        return et;
    }

    public void setEt(Date et) {
        this.et = et;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }
}
