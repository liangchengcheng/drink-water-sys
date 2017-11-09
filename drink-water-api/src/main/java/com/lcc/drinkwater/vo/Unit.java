package com.lcc.drinkwater.vo;

import com.lcc.water.common.ApiParam;
import java.util.Date;
import java.util.List;

public class Unit extends ApiParam {

    private String id;

    private String unitCode;

    private String unitName;

    private String parentCode;

    private Date createTime;


    private int isUpdate;

    private List<Unit> nodes;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Unit> getNodes() {
        return nodes;
    }

    public void setNodes(List<Unit> nodes) {
        this.nodes = nodes;
    }

    public int getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(int isUpdate) {
        this.isUpdate = isUpdate;
    }
}
