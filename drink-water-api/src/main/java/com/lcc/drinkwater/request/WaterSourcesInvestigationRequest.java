package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class WaterSourcesInvestigationRequest extends ApiParam {

    @SerializedName("id")
    private String i;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }
}
