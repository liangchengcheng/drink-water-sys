package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class WaterSourcesRemediationResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private String i;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("completeStatus")
    private int zzqk;
    @SerializedName("isCompleted")
    private int wczz;
    @SerializedName("ptx")
    private double lon;
    @SerializedName("pty")
    private double lat;
    @SerializedName("remark")
    private String rk;
    @SerializedName("timetabled")
    private Date zq;
    @SerializedName("unitName")
    private String un;
    @SerializedName("creater")
    private String rn;
    @SerializedName("createrName")
    private String cn;
    @SerializedName("createTime")
    private Date fit;
    @SerializedName("phoneNum")
    private String rp;
    @SerializedName("protectedType")
    private String pt;
    @SerializedName("protectedType")
    private String pn;
    @SerializedName("environmentType")
    private String it;
    @SerializedName("environmentType")
    private String in;

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

/* @SerializedName("completeStatus")
    private String wczzStr;

    public String getZzqkStr() {
        if(this.wczz==0){
            wczzStr ="未开展";
        }else if(this.wczz==1){
            wczzStr ="未开展";
        }else if(this.wczz==2){
            wczzStr ="未开展";
        }
        return wczzStr;
    }*/

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
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

    public Date getZq() {
        return zq;
    }

    public void setZq(Date zq) {
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

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
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
}
