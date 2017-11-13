package com.lcc.drinkwater.response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangjiahui on 2017/7/24.
 */
public class UnitResponse implements Serializable {

    @SerializedName("unitCode")
    private String c;
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

    private List<UnitResponse> nodes;

    public List<UnitResponse> getNodes() {
        return nodes;
    }

    public void setNodes(List<UnitResponse> nodes) {
        this.nodes = nodes;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
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

    @Override
    public String toString() {
        return "UnitResponse{" +
                "c='" + c + '\'' +
                ", pc='" + pc + '\'' +
                ", n='" + n + '\'' +
                ", id='" + id + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
