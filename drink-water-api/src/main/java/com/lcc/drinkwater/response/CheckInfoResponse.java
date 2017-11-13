package com.lcc.drinkwater.response;

import com.lcc.drinkwater.excel.annotation.ExcelField;

import java.io.Serializable;


public class CheckInfoResponse  implements Serializable {

    private static final long serialVersionUID = 1L;


    @ExcelField(title = "序号", order = 1)
    private int indexNum;
    @ExcelField(title = "所在地市", order = 2)
    private String ci;
    @ExcelField(title = "水源地名称", order = 3)
    private String ws;
    @ExcelField(title = "保护区类型", order = 4)
    private String pt;
    @ExcelField(title = "环境问题", order = 5)
    private String it;
    @ExcelField(title = "涉及企业名称及简要情况", order = 6)
    private String bs;
    @ExcelField(title = "一级保护区内的建设项目建筑物面积（m2）", order = 7)
    private double ca;
    @ExcelField(title = "遥感版一级保护区内的建设项目建筑物面积（m2）", order = 8)
    private double cas;
    @ExcelField(title = "备注", order = 9)
    private String rk;

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getCas() {
        return cas;
    }

    public void setCas(double cas) {
        this.cas = cas;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }

    @Override
    public String toString() {
        return "CheckInfoResponse{" +
                "indexNum=" + indexNum +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", pt='" + pt + '\'' +
                ", it='" + it + '\'' +
                ", bs='" + bs + '\'' +
                ", ca='" + ca + '\'' +
                ", cas='" + cas + '\'' +
                ", rk='" + rk + '\'' +
                '}';
    }
}
