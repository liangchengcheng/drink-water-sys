package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class UserSaveRequest extends ApiParam {
    @SerializedName("phoneNum")
    private String p;
    @SerializedName("id")
    private String i;
    @SerializedName("realName")
    private String n;
    @SerializedName("password")
    private String w;
    @SerializedName("jobUnitCode")
    private String ju;
    @SerializedName("code")
    private String uc;
    @SerializedName("isAdministrator")
    private int ia;
    @SerializedName("userName")
    private String un;
    @SerializedName("isAvailabled")
    private int id;
    @SerializedName("userCode")
    private String c;

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }

    public String getJu() {
        return ju;
    }

    public void setJu(String ju) {
        this.ju = ju;
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public int getIa() {
        return ia;
    }

    public void setIa(int ia) {
        this.ia = ia;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
