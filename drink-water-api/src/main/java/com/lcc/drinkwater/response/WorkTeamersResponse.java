package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sk on 2017/8/2.
 */
public class WorkTeamersResponse implements Serializable {

    @SerializedName("name")
    private String n;
    @SerializedName("jobUnit")
    private String ju;
    @SerializedName("phone")
    private String p;

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getJu() {
        return ju;
    }

    public void setJu(String ju) {
        this.ju = ju;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
