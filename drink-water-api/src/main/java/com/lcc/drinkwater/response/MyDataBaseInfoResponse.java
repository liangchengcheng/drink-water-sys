package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by yangjiahui on 2017/8/8.
 */
public class MyDataBaseInfoResponse  implements Serializable {

    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private  String ws;
    @SerializedName("wsType")
    private String wt;
    @SerializedName("pty")
    private double lat;
    @SerializedName("ptx")
    private double lon;
    @SerializedName("isProtected")
    private int dpa;
    @SerializedName("wsCode")
    private String wsc;

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

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getDpa() {
        return dpa;
    }

    public void setDpa(int dpa) {
        this.dpa = dpa;
    }

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
    }

    @Override
    public String toString() {
        return "MyDataBaseInfoResponse{" +
                "p='" + p + '\'' +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", wt='" + wt + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", dpa=" + dpa +
                ", wsc='" + wsc + '\'' +
                '}';
    }
}
