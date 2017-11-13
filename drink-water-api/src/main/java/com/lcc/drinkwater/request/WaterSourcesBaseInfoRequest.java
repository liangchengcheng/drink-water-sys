package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class WaterSourcesBaseInfoRequest extends ApiParam {
    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("waterSourceName")
    private String ws;
    @SerializedName("wsCode")
    private String wsc;
    @SerializedName("waterType")
    private String wt;
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
    @SerializedName("boundaryProtected Area")
    private int bpa;
    @SerializedName("ptx")
    private double lon;
    @SerializedName("pty")
    private double lat;
    @SerializedName("ptxStr")
    private String lonStr;
    @SerializedName("ptyStr")
    private String latStr;
    @SerializedName("remark")
    private String rk;
    @SerializedName("creater")
    private String c;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

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


    public String getLonStr() {
        return lonStr;
    }

    public void setLonStr(String lonStr) {
        this.lonStr = lonStr;
    }

    public String getLatStr() {
        return latStr;
    }

    public void setLatStr(String latStr) {
        this.latStr = latStr;
    }
}
