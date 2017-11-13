package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class WaterSourcesListResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("wsCode")
    private String wsc;
    @SerializedName("wsName")
    private String ws;

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getWsc() {
        return wsc;
    }

    public void setWsc(String wsc) {
        this.wsc = wsc;
    }
}
