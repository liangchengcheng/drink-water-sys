package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by yangjiahui on 2017/8/8.
 */
public class MyDataRenovateResponse implements Serializable{

    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private  String ws;
    @SerializedName("environmentType;")
    private String it;
    @SerializedName("completeStatus")
    private int zzqk;
    @SerializedName("timetabled")
    private String zq;
    @SerializedName("wsCode")
    private String wsc;
    @SerializedName("wscId")
    private String wsci;

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

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public int getZzqk() {
        return zzqk;
    }

    public void setZzqk(int zzqk) {
        this.zzqk = zzqk;
    }

    public String getZq() {
        return zq;
    }

    public void setZq(String zq) {
        this.zq = zq;
    }

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
    }

    public String getWsci() {
        return wsci;
    }

    public void setWsci(String wsci) {
        this.wsci = wsci;
    }
}
