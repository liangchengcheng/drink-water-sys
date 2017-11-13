package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class UserLoginRequest extends ApiParam {


    @SerializedName("username")
    private String u;
    @SerializedName("password")
    private String p;

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

}
