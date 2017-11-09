package com.lcc.drinkwater.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class Record implements Serializable {

    private String id;
    private String tableName;
    private int updateType;
    private String mapperId;
    private Date updateTime;

    public  Record (String tableName, String mapperId, int updateType){
        this.id = UUID.randomUUID().toString().replace("-","");
        this.tableName = tableName;
        this.mapperId = mapperId;
        this.updateType = updateType;
        this.updateTime = new Date();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getUpdateType() {
        return updateType;
    }

    public void setUpdateType(int updateType) {
        this.updateType = updateType;
    }

    public String getMapperId() {
        return mapperId;
    }

    public void setMapperId(String mapperId) {
        this.mapperId = mapperId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Override
    public String toString() {
        return "record{" +
                "id='" + id + '\'' +
                ", tableName='" + tableName + '\'' +
                ", updateType=" + updateType +
                ", mapperId='" + mapperId + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
