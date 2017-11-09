package com.lcc.drinkwater.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Xzqh implements Serializable {

    private String id;
    private String code;
    private String parentCode;
    private String name;
    private Date createTime;

    public List<Xzqh> getNodes() {
        return nodes;
    }

    public void setNodes(List<Xzqh> nodes) {
        this.nodes = nodes;
    }

    private List<Xzqh> nodes;


    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Xzqh{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", parentCode='" + parentCode + '\'' +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
