package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class ModifyPswdRequest extends ApiParam {

    @SerializedName("oldPassword")
    private String op;
    @SerializedName("newPassword")
    private String np;


    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String np) {
        this.np = np;
    }
}
