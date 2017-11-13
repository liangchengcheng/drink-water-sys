package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;
import com.lcc.water.common.ApiParam;

public class UnitRequest extends ApiParam {

    @SerializedName("unitCode")
    private String uc;
    @SerializedName("parentCode")
    private String pc;
    @SerializedName("unitName")
    private String n;
    @SerializedName("id")
    private String id;
    @SerializedName("isUpdate")
    private int iu;

    public int getIu() {
        return iu;
    }

    public void setIu(int iu) {
        this.iu = iu;
    }

    @Override
    public String toString() {
        return "UnitRequest{" +
                "c='" + uc + '\'' +
                ", pc='" + pc + '\'' +
                ", n='" + n + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
