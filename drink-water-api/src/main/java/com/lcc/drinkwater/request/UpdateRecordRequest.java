package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class UpdateRecordRequest extends ApiParam {

    @SerializedName("lastModifyTime")
    private long d;
    @SerializedName("xzqhCode")
    private String xc;

    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }

    public String getXc() {
        return xc;
    }

    public void setXc(String xc) {
        this.xc = xc;
    }
}
