package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class MyDataCheckResponse  implements Serializable {

    @SerializedName("id")
    private String i;
    @SerializedName("province")
    private String p;
    @SerializedName("city")
    private String ci;
    @SerializedName("wsName")
    private String ws;
    @SerializedName("createTime")
    private Date fit;
    @SerializedName("environmentType")
    private String it;
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

    public Date getFit() {
        return fit;
    }

    public void setFit(Date fit) {
        this.fit = fit;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
    }

    @Override
    public String toString() {
        return "MyDataCheckResponse{" +
                "i='" + i + '\'' +
                ", p='" + p + '\'' +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", fit=" + fit +
                ", it='" + it + '\'' +
                ", wsc='" + wsc + '\'' +
                '}';
    }
}
