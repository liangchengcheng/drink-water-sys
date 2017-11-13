package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class SetUserRequest extends ApiParam {

    @SerializedName("phone")
    private String p;
    @SerializedName("name")
    private String n;
    @SerializedName("userName")
    private String u;
    @SerializedName("password")
    private String pw;
    @SerializedName("newPassword")
    private String np;
    @SerializedName("rePassword")
    private String rp;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }
}
