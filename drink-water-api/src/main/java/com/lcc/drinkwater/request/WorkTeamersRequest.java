package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class WorkTeamersRequest implements Serializable {

    @SerializedName("ids")
    private String ids;

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
