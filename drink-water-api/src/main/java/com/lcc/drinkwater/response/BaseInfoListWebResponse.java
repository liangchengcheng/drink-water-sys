package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class BaseInfoListWebResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("wsCode")
    private String wsc;
    @SerializedName("waterType")
    private String wt;
    @SerializedName("waterName")
    private String wn;
    @SerializedName("withdrawals")
    private double wi;
    @SerializedName("servicePeopleNum")
    private double sp;
    @SerializedName("isProtected")
    private int dpa;
    @SerializedName("isLandmarks")
    private int sl;
    @SerializedName("isQualityMonitoring")
    private int wqm;
    @SerializedName("isPublicMonitorInfo")
    private int ip;
    @SerializedName("isReserveBoundary")
    private int bpa;
    @SerializedName("ptx")
    private double lon;
    @SerializedName("pty")
    private double lat;
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

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
    }

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public String getWn() {
        return wn;
    }

    public void setWn(String wn) {
        this.wn = wn;
    }

    public double getWi() {
        return wi;
    }

    public void setWi(double wi) {
        this.wi = wi;
    }

    public double getSp() {
        return sp;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public int getDpa() {
        return dpa;
    }

    public void setDpa(int dpa) {
        this.dpa = dpa;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getWqm() {
        return wqm;
    }

    public void setWqm(int wqm) {
        this.wqm = wqm;
    }

    public int getIp() {
        return ip;
    }

    public void setIp(int ip) {
        this.ip = ip;
    }

    public int getBpa() {
        return bpa;
    }

    public void setBpa(int bpa) {
        this.bpa = bpa;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

}
