package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;


public class HjlxRecordResponse {

    @SerializedName("id")
    private String i;
    @SerializedName("name")
    private String un;
    @SerializedName("code")
    private String uc;
    @SerializedName("updateType")
    private String ut;

    @Override
    public String toString() {
        return "HjlxRecordResponse{" +
                "i='" + i + '\'' +
                ", un='" + un + '\'' +
                ", uc='" + uc + '\'' +
                ", ut='" + ut + '\'' +
                ", pc='" + pc + '\'' +
                '}';
    }

    @SerializedName("parentCode")
    private String pc;


    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getUc() {
        return uc;
    }

    public void setUc(String uc) {
        this.uc = uc;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }
}
