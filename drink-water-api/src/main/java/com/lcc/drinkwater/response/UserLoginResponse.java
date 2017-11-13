package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserLoginResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("userId")
    private String ui;
    @SerializedName("userName")
    private String un;
    @SerializedName("phoneNum")
    private String pn;
    @SerializedName("isAdministrator")
    private int ia;
    @SerializedName("departmentCode")
    private String dc;
    @SerializedName("departmentName")
    private String dn;
    @SerializedName("tokenId")
    private String tk;
    @SerializedName("code")
    private String c;
    @SerializedName("realName")
    private String rn;

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }


    public String getUi() {
        return ui;
    }

    public void setUi(String ui) {
        this.ui = ui;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public int getIa() {
        return ia;
    }

    public void setIa(int ia) {
        this.ia = ia;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getTk() {
        return tk;
    }

    public void setTk(String tk) {
        this.tk = tk;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
