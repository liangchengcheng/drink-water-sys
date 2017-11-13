package com.lcc.drinkwater.response;

import com.hdsx.drinkwater.excel.annotation.ExcelField;

import java.io.Serializable;

/**
 * Created by sk on 2017/8/7.
 */
public class BaseInfoResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelField(title = "序号", order = 1)
    private int indexNum;
    @ExcelField(title = "所在省", order = 2)
    private String p;
    @ExcelField(title = "所在城市", order = 3)
    private String ci;
    @ExcelField(title = "水源地名称", order = 4)
    private String ws;
    @ExcelField(title = "水源地类别", order = 5)
    private String wt;
    @ExcelField(title = "取水量", order = 6)
    private String wi;
    @ExcelField(title = "服务人口（万人）", order = 7)
    private String sp;

    private String dpa;

    private String sl;

    private String wqm;

    private String ip;

    @ExcelField(title = "取水口地理坐标", order = 12)
    private String ptx;

    private String bpa;

    @ExcelField(title = "备注", order = 14)
    private String rk;

    @ExcelField(title = "是否划定保护区", order = 8)
    private String dpaStr;

    @ExcelField(title = "是否设定界标标志", order = 9)
    private String slStr;

    @ExcelField(title = "是否开展水质监测", order = 10)
    private String wqmStr;

    @ExcelField(title = "是否公开监测信息", order = 11)
    private String ipStr;

    @ExcelField(title = "是否确定保护区边界", order = 13)
    private String bpaStr;

    public String getWqmStr() {
        return wqmStr;
    }

    public void setWqmStr(String wqmStr) {
        this.wqmStr = wqmStr;
    }

    public String getIpStr() {
        return ipStr;
    }

    public void setIpStr(String ipStr) {
        this.ipStr = ipStr;
    }

    public String getBpaStr() {
        return bpaStr;
    }

    public void setBpaStr(String bpaStr) {
        this.bpaStr = bpaStr;
    }

    public String getSlStr() {
        return slStr;
    }

    public void setSlStr(String slStr) {
        this.slStr = slStr;
    }

    public String getDpaStr() {
        return dpaStr;
    }

    public void setDpaStr(String dpaStr) {
        this.dpaStr = dpaStr;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
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

    public String getWt() {
        return wt;
    }

    public void setWt(String wt) {
        this.wt = wt;
    }

    public String getWi() {
        return wi;
    }

    public void setWi(String wi) {
        this.wi = wi;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getDpa() {
        return dpa;
    }

    public void setDpa(String dpa) {
        this.dpa = dpa;
    }

    public String getSl() {
        return sl;
    }

    public void setSl(String sl) {
        this.sl = sl;
    }

    public String getWqm() {
        return wqm;
    }

    public void setWqm(String wqm) {
        this.wqm = wqm;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPtx() {
        return ptx;
    }

    public void setPtx(String ptx) {
        this.ptx = ptx;
    }


    public String getBpa() {
        return bpa;
    }

    public void setBpa(String bpa) {
        this.bpa = bpa;
    }

    public String getRk() {
        return rk;
    }

    public void setRk(String rk) {
        this.rk = rk;
    }


    @Override
    public String toString() {
        return "BaseInfoResponse{" +
                "indexNum=" + indexNum +
                ", p='" + p + '\'' +
                ", ci='" + ci + '\'' +
                ", ws='" + ws + '\'' +
                ", wt='" + wt + '\'' +
                ", wi='" + wi + '\'' +
                ", sp='" + sp + '\'' +
                ", dpa='" + dpa + '\'' +
                ", sl='" + sl + '\'' +
                ", wqm='" + wqm + '\'' +
                ", ip='" + ip + '\'' +
                ", ptx='" + ptx + '\'' +
                ", bpa='" + bpa + '\'' +
                ", rk='" + rk + '\'' +
                '}';
    }
}
