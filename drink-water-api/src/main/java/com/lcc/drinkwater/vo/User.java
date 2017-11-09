package com.lcc.drinkwater.vo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private String id;

    private String phoneNum;

    private String password;

    private String realName;

    private String jobUnitCode;

    private String code;

    private int isAdministrator;

    private int isAvailabled;

    private String departmentCode;

    private String departmentName;

    private Date createTime;

    private int isWorkTeam;

    private String workTeamers;

    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getJobUnitCode() {
        return jobUnitCode;
    }

    public void setJobUnitCode(String jobUnitCode) {
        this.jobUnitCode = jobUnitCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIsAdministrator() {
        return isAdministrator;
    }

    public void setIsAdministrator(int isAdministrator) {
        this.isAdministrator = isAdministrator;
    }

    public int getIsAvailabled() {
        return isAvailabled;
    }

    public void setIsAvailabled(int isAvailabled) {
        this.isAvailabled = isAvailabled;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getIsWorkTeam() {
        return isWorkTeam;
    }

    public void setIsWorkTeam(int isWorkTeam) {
        this.isWorkTeam = isWorkTeam;
    }

    public String getWorkTeamers() {
        return workTeamers;
    }

    public void setWorkTeamers(String workTeamers) {
        this.workTeamers = workTeamers;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
