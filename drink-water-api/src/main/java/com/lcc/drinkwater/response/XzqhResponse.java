package com.lcc.drinkwater.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yangjiahui on 2017/7/31.
 */
public class XzqhResponse implements Serializable {

    private String id;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "XzqhResponse{" +
                "id='" + id + '\'' +
                ", c='" + c + '\'' +
                ", pc='" + pc + '\'' +
                ", n='" + n + '\'' +
                ", nodes=" + nodes +
                '}';
    }

    public void setId(String id) {
        this.id = id;
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

    private String c;
    private String pc;
    private String n;

    public List<XzqhResponse> getNodes() {
        return nodes;
    }

    public void setNodes(List<XzqhResponse> nodes) {
        this.nodes = nodes;
    }

    private List<XzqhResponse> nodes;



}
