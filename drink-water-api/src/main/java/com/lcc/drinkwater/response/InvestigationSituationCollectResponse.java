package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sk on 2017/7/30.
 */
public class InvestigationSituationCollectResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("pwk")
    private int pwk;
    @SerializedName("environmentType")
    private int ep;
    @SerializedName("pwk2")
    private int ca;
    @SerializedName("gyqy")
    private int gyqy;
    @SerializedName("qcyz")
    private String qcyz;
    @SerializedName("play")
    private int play;
    @SerializedName("other")
    private int o;
    @SerializedName("area")
    private double a;
    @SerializedName("questionArea")
    private double qa;
    @SerializedName("coveredAreaSensingArea")
    private double casa;
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

    public int getPwk() {
        return pwk;
    }

    public void setPwk(int pwk) {
        this.pwk = pwk;
    }

    public int getEp() {
        return ep;
    }

    public void setEp(int ep) {
        this.ep = ep;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getGyqy() {
        return gyqy;
    }

    public void setGyqy(int gyqy) {
        this.gyqy = gyqy;
    }

    public String getQcyz() {
        return qcyz;
    }

    public void setQcyz(String qcyz) {
        this.qcyz = qcyz;
    }

    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        this.play = play;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getQa() {
        return qa;
    }

    public void setQa(double qa) {
        this.qa = qa;
    }

    public double getCasa() {
        return casa;
    }

    public void setCasa(double casa) {
        this.casa = casa;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }
}
