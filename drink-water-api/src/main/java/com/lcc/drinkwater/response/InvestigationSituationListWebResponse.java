package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class InvestigationSituationListWebResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("protectedType")
    private String pt;
    @SerializedName("protectedType")
    private String pn;
    @SerializedName("environmentType")
    private String it;
    @SerializedName("environmentType")
    private String in;
    @SerializedName("coveredArea")
    private double ca;
    @SerializedName("context")
    private String bs;
    @SerializedName("coveredAreaSensing")
    private double cas;
    @SerializedName("remark")
    private String rk;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public double getCas() {
        return cas;
    }

    public void setCas(double cas) {
        this.cas = cas;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }
}
