package com.lcc.drinkwater.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ImageRequest implements Serializable {

    @SerializedName("id")
    private String i;
    @SerializedName("imageName")
    private String in;
    @SerializedName("mapperId")
    private String ki;
    @SerializedName("type")
    private int tp;

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
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

    @Override
    public String toString() {
        return "ImageRequest{" +
                "i='" + i + '\'' +
                ", in='" + in + '\'' +
                ", ki='" + ki + '\'' +
                ", tp=" + tp +
                '}';
    }
}
