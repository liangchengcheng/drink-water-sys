package com.lcc.drinkwater.vo;

import java.io.Serializable;
import java.util.Date;

public class WaterSources implements Serializable {
    private String id;
    private String wsName;
    private String wstype;
    private double ptx;
    private double pty;
    private double withdrawals;
    private double servicePeopleNum;
    private int isProtected;
    private int isLandMarks;
    private int isQualityMonitoring;
    private int isPublicMonitorInfo;
    private int isReserveBoundary;
    private String province;
    private String city;
    private String remark;
    private String creater;
    private Date creatTime;
    private String wsCode;
    private String phoneNum;
    private String unitCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    public String getWstype() {
        return wstype;
    }

    public void setWstype(String wstype) {
        this.wstype = wstype;
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

    public double getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(double withdrawals) {
        this.withdrawals = withdrawals;
    }

    public double getServicePeopleNum() {
        return servicePeopleNum;
    }

    public void setServicePeopleNum(double servicePeopleNum) {
        this.servicePeopleNum = servicePeopleNum;
    }

    public int getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(int isProtected) {
        this.isProtected = isProtected;
    }

    public int getIsLandMarks() {
        return isLandMarks;
    }

    public void setIsLandMarks(int isLandMarks) {
        this.isLandMarks = isLandMarks;
    }

    public int getIsQualityMonitoring() {
        return isQualityMonitoring;
    }

    public void setIsQualityMonitoring(int isQualityMonitoring) {
        this.isQualityMonitoring = isQualityMonitoring;
    }

    public int getIsPublicMonitorInfo() {
        return isPublicMonitorInfo;
    }

    public void setIsPublicMonitorInfo(int isPublicMonitorInfo) {
        this.isPublicMonitorInfo = isPublicMonitorInfo;
    }

    public int getIsReserveBoundary() {
        return isReserveBoundary;
    }

    public void setIsReserveBoundary(int isReserveBoundary) {
        this.isReserveBoundary = isReserveBoundary;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getWsCode() {
        return wsCode;
    }

    public void setWsCode(String wsCode) {
        this.wsCode = wsCode;
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
}
