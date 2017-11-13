package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

import java.util.Date;

public class MyDataRequest extends ApiParam {

    @Override
    public String toString() {
        return "MyDataRequest{" +
                "wsn='" + wsn + '\'' +
                ", bt=" + bt +
                ", et=" + et +
                '}';
    }

    public String getWsn() {
        return wsn;
    }

    public void setWsn(String wsn) {
        this.wsn = wsn;
    }

    public Date getBt() {
        return bt;
    }

    public void setBt(Date bt) {
        this.bt = bt;
    }

    public Date getEt() {
        return et;
    }

    public void setEt(Date et) {
        this.et = et;
    }

    @SerializedName("wsname")
    private String wsn;
    @SerializedName("beginTime")
    private Date bt;
    @SerializedName("endTime")
    private Date et;

    private String tbrNo;

    public String getTbrNo() {
        return tbrNo;
    }

    public void setTbrNo(String tbrNo) {
        this.tbrNo = tbrNo;
    }
}
