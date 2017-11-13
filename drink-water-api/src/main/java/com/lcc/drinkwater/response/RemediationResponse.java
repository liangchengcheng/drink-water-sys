package com.lcc.drinkwater.response;

import java.io.Serializable;

/**
 * Created by sk on 2017/7/27.
 */
public class RemediationResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private double ptx;
    private double pty;
    private Integer isCompleted;
    private String timetabled;
    private Integer completestatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPtx() {
        return ptx;
    }

    public void setPtx(double ptx) {
        this.ptx = ptx;
    }

    public double getPty() {
        return pty;
    }

    public void setPty(double pty) {
        this.pty = pty;
    }

    public Integer getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(Integer isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getTimetabled() {
        return timetabled;
    }

    public void setTimetabled(String timetabled) {
        this.timetabled = timetabled;
    }

    public Integer getCompletestatus() {
        return completestatus;
    }

    public void setCompletestatus(Integer completestatus) {
        this.completestatus = completestatus;
    }

    public static long getSerialVersionUID() {

        return serialVersionUID;
    }
}
