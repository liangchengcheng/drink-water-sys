package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sk on 2017/8/3.
 */
public class ImageRecordResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @SerializedName("imageName")
    private String in;
    @SerializedName("imageUrl")
    private String iu;
    @SerializedName("mapperId")
    private String ki;
    @SerializedName("type")
    private int tp;
    @SerializedName("updateType")
    private String ut;

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getIu() {
        return iu;
    }

    public void setIu(String iu) {
        this.iu = iu;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public String getUt() {
        return ut;
    }

    public void setUt(String ut) {
        this.ut = ut;
    }
}
