package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class UserListRequest extends ApiParam {

    @SerializedName("unitCode")
    private String uc;
    @SerializedName("seachInfo")
    private String si;

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }
    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

}
