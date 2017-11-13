package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by sk on 2017/7/24.
 */
public class UserListResponse implements Serializable {

    @SerializedName("id")
    private String i;
    @SerializedName("isAvailabled")
    private int id;
    @SerializedName("isAdministrator")
    private int ia;
    @SerializedName("realName")
    private String n;
    @SerializedName("userName")
    private String un;
    @SerializedName("phoneNum")
    private String p;
    @SerializedName("jobUnit")
    private String ju;


    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIa() {
        return ia;
    }

    public void setIa(int ia) {
        this.ia = ia;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getJu() {
        return ju;
    }

    public void setJu(String ju) {
        this.ju = ju;
    }


}
