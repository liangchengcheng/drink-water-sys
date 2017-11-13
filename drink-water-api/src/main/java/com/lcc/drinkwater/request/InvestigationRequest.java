package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class InvestigationRequest implements Serializable {

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
    @SerializedName("unitName")
    private String un;
    @SerializedName("unitCode")
    private String uc;
    @SerializedName("collectType")
    private String ct;
    @SerializedName("teamId")
    private String ti;
    @SerializedName("creater")
    private String c;
    @SerializedName("createTime")
    private String fit;
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
    @SerializedName("createrName")
    private String cn;
    @SerializedName("phoneNum")
    private String rp;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }
    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

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

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
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

    @Override
    public String toString() {
        return "InvestigationRequest{" +
                "i='" + i + '\'' +
                ", wsc='" + wsc + '\'' +
                ", p='" + p + '\'' +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", pt='" + pt + '\'' +
                ", it='" + it + '\'' +
                ", un='" + un + '\'' +
                ", fit='" + fit + '\'' +
                ", ca=" + ca +
                ", bs='" + bs + '\'' +
                ", rk='" + rk + '\'' +
                ", lona=" + lona +
                ", lata=" + lata +
                ", lonb=" + lonb +
                ", latb=" + latb +
                ", rn='" + rn + '\'' +
                ", rp='" + rp + '\'' +
                '}';
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

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
}