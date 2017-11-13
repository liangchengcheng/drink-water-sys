package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class ZzqkRecordResponse implements Serializable {
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
    private String zq;
    @SerializedName("unitCode")
    private String un;
    @SerializedName("creater")
    private String rn;
    @SerializedName("createTime")
    private Date fit;
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

    public String getZq() {
        return zq;
    }

    public void setZq(String zq) {
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

    public Date getFit() {
        return fit;
    }

    public void setFit(Date fit) {
        this.fit = fit;
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
