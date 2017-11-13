package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sk on 2017/7/28.
 */
public class QuestionListResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @SerializedName("id")
    private String i;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("environmentType")
    private String it;
    @SerializedName("unitName")
    private String un;
    @SerializedName("unitCode")
    private String unc;
    private double ptx;

    public double getPtx() {
        return ptx;
    }

    public void setPtx(double ptx) {
        this.ptx = ptx;
    }

    public double getPty() {
        return pty;
    }

    public void setPty(double pty) {
        this.pty = pty;
    }

    private double pty;

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

    public String getUnc() {
        return unc;
    }

    public void setUnc(String unc) {
        this.unc = unc;
    }
}
