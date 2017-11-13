package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class WaterSourcesListRequest extends ApiParam {

    @SerializedName("cityName")
    private String cn;

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }
}
