package com.lcc.drinkwater.vo;

import java.io.Serializable;
import java.util.Date;

public class WaterSourcesRemediation implements Serializable {

    private String id;
    private String wscId;
    private String wsName;
    private String coveredArea;
    private String coveredAreaSensing;
    private String context;
    private double ptx;
    private double pty;
    private String province;
    private String city;
    private String creater;
    private Date createTime;
    private Integer isCompleted;
    private String timetabled;
    private Integer completestatus;
    private String wsCode;
    private String protectedType;
    private String environmentType;
    private String phoneNum;
    private String unitCode;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWscId() {
        return wscId;
    }

    public void setWscId(String wscId) {
        this.wscId = wscId;
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    public String getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(String coveredArea) {
        this.coveredArea = coveredArea;
    }

    public String getCoveredAreaSensing() {
        return coveredAreaSensing;
    }

    public void setCoveredAreaSensing(String coveredAreaSensing) {
        this.coveredAreaSensing = coveredAreaSensing;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getWsCode() {
        return wsCode;
    }

    public void setWsCode(String wsCode) {
        this.wsCode = wsCode;
    }

    public String getProtectedType() {
        return protectedType;
    }

    public void setProtectedType(String protectedType) {
        this.protectedType = protectedType;
    }

    public String getEnvironmentType() {
        return environmentType;
    }

    public void setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
