package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class PcqkRecordResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private String i;
    @SerializedName("wsCode")
    private String wsc;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("protectedType")
    private String pt;
    @SerializedName("environmentType")
    private String it;
    @SerializedName("unitCode")
    private String un;
    @SerializedName("createTime")
    private Date fit;
    @SerializedName("coveredArea")
    private double ca;
    @SerializedName("context")
    private String bs;
    @SerializedName("remark")
    private String rk;
    @SerializedName("ptx")
    private double lona;
    @SerializedName("pty")
    private double lata;
    @SerializedName("devicePtx")
    private double lonb;
    @SerializedName("devicePty")
    private double latb;
    @SerializedName("creater")
    private String rn;
    @SerializedName("phoneNum")
    private String rp;
    @SerializedName("updateType")
    private int ut;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
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

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public Date getFit() {
        return fit;
    }

    public void setFit(Date fit) {
        this.fit = fit;
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

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    public double getLona() {
        return lona;
    }

    public void setLona(double lona) {
        this.lona = lona;
    }

    public double getLata() {
        return lata;
    }

    public void setLata(double lata) {
        this.lata = lata;
    }

    public double getLonb() {
        return lonb;
    }

    public void setLonb(double lonb) {
        this.lonb = lonb;
    }

    public double getLatb() {
        return latb;
    }

    public void setLatb(double latb) {
        this.latb = latb;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public int getUt() {
        return ut;
    }

    public void setUt(int ut) {
        this.ut = ut;
    }
}
