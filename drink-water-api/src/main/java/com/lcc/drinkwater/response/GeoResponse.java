package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class GeoResponse implements Serializable{

    @SerializedName("id")
    private String i;
    @SerializedName("wscode")
    private String xc;
    @SerializedName("wsname")
    private String ws;
    @SerializedName("type")
    private int tp;
    @SerializedName("polygon")
    private String p;
    @SerializedName("subTypeName")
    private String stn;

    @Override
    public String toString() {
        return "GeoResponse{" +
                "i='" + i + '\'' +
                ", xc='" + xc + '\'' +
                ", ws='" + ws + '\'' +
                ", tp=" + tp +
                ", p='" + p + '\'' +
                ", stn='" + stn + '\'' +
                ", ar=" + ar +
                '}';
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getXc() {
        return xc;
    }

    public void setXc(String xc) {
        this.xc = xc;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getStn() {
        return stn;
    }

    public void setStn(String stn) {
        this.stn = stn;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    @SerializedName("area")

    private double ar;
}
