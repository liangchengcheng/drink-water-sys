package com.lcc.drinkwater.response;

import com.hdsx.drinkwater.excel.annotation.ExcelField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sk on 2017/8/8.
 */
public class RemediationInfoResponse  implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelField(title = "序号", order = 1)
    private int indexNum;
    @ExcelField(title = "所在地市", order = 2)
    private String ci;
    @ExcelField(title = "水源地名称", order = 3)
    private String ws;

    private int wczz;

    @ExcelField(title = "保护区类型", order = 5)
    private String pn;
    @ExcelField(title = "环境问题", order = 6)
    private String in;
    @ExcelField(title = "涉及企业名称及简要情况", order = 7)
    private String bs;
    @ExcelField(title = "一级保护区内的建设项目建筑物面积（m2）", order = 8)
    private double ca;
    @ExcelField(title = "遥感版一级保护区内的建设项目建筑物面积（m2）", order = 9)
    private double cas;

    private int zzqk;
    @ExcelField(title = "整治完成期限", order = 11)
    private Date zq;
    @ExcelField(title = "备注", order = 12)
    private String rk;

    @ExcelField(title = "是否完成整治", order = 4)
    private String wczzStr;
    @ExcelField(title = "整治情况", order = 10)
    private String zzqkStr;

    public String getZzqkStr() {
        return zzqkStr;
    }

    public void setZzqkStr(String zzqkStr) {
        this.zzqkStr = zzqkStr;
    }

    public String getWczzStr() {
        return wczzStr;
    }

    public void setWczzStr(String wczzStr) {
        this.wczzStr = wczzStr;
    }

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

    public int getWczz() {
        return wczz;
    }

    public void setWczz(int wczz) {
        this.wczz = wczz;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
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

    public int getZzqk() {
        return zzqk;
    }

    public void setZzqk(int zzqk) {
        this.zzqk = zzqk;
    }

    public Date getZq() {
        return zq;
    }

    public void setZq(Date zq) {
        this.zq = zq;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }
}
