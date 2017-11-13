package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class RemediationRequest implements Serializable {

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
    @SerializedName("completeStatus")
    private int zzqk;
    @SerializedName("isCompleted")
    private int wczz;
    @SerializedName("protectedType")
    private String pt;
    @SerializedName("environmentType")
    private String it;
    @SerializedName("coveredArea")
    private double ca;
    @SerializedName("context")
    private String bs;
    @SerializedName("wscId")
    private String wi;
    @SerializedName("ptx")
    private double lon;
    @SerializedName("pty")
    private double lat;
    @SerializedName("remark")
    private String rk;
    @SerializedName("timetabled")
    private long zq;
    @SerializedName("timetabled")
    private Date zqd;
    @SerializedName("unitName")
    private String un;
    @SerializedName("unitCode")
    private String uc;
    @SerializedName("collectType")
    private String ct;
    @SerializedName("teamId")
    private String ti;
    @SerializedName("creater")
    private String rn;
    @SerializedName("createrName")
    private String cn;
    @SerializedName("createTime")
    private String fit;
    @SerializedName("phoneNum")
    private String rp;

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
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

    public int getZzqk() {
        return zzqk;
    }

    public void setZzqk(int zzqk) {
        this.zzqk = zzqk;
    }

    public int getWczz() {
        return wczz;
    }

    public void setWczz(int wczz) {
        this.wczz = wczz;
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

    public String getWi() {
        return wi;
    }

    public void setWi(String wi) {
        this.wi = wi;
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

    public long getZq() {
        return zq;
    }

    public void setZq(long zq) {
        this.zq = zq;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getRp() {
        return rp;
    }

    public void setRp(String rp) {
        this.rp = rp;
    }

    public Date getZqd() {
        return zqd;
    }

    public void setZqd(Date zqd) {
        this.zqd = zqd;
    }


    @Override
    public String toString() {
        return "RemediationRequest{" +
                "i='" + i + '\'' +
                ", wsc='" + wsc + '\'' +
                ", p='" + p + '\'' +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", zzqk=" + zzqk +
                ", wczz=" + wczz +
                ", pt='" + pt + '\'' +
                ", it='" + it + '\'' +
                ", ca=" + ca +
                ", bs='" + bs + '\'' +
                ", wi='" + wi + '\'' +
                ", lon=" + lon +
                ", lat=" + lat +
                ", rk='" + rk + '\'' +
                ", zq=" + zq +
                ", un='" + un + '\'' +
                ", rn='" + rn + '\'' +
                ", fit='" + fit + '\'' +
                ", rp='" + rp + '\'' +
                '}';
    }
}