package com.lcc.water.common.page;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaod on 2017/1/9
 */
@ApiModel(description = "分页查询参数传递")
public class PageParameter implements Serializable {

    @ApiModelProperty(value="传参类型")
    private Map<String,Object> params = new HashMap();

    private int current;

    private int limit;

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageParameter{" +
                "params=" + params +
                ", current=" + current +
                ", limit=" + limit +
                '}';
    }
}
