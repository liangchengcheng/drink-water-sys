package com.lcc.water.common;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ApiResult<T> implements Serializable{

    //消息码
    @SerializedName("code")
    private int c = 0;

    //消息内容
    @SerializedName("message")
    private String m;

    //消息结果
    @SerializedName("result")
    private Map<String,Object> r = new HashMap<>();

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public Map<String, Object> getR() {
        return r;
    }

    public void setR(Map<String, Object> r) {
        this.r = r;
    }
}
