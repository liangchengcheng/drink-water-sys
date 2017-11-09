package com.lcc.water.common.page;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page<T> implements Serializable {
    private static final long serialVersionUID = 1244437270503922868L;
    @ApiModelProperty("总记录条数")
    private int total;
    @ApiModelProperty("每页数据列表")
    private List<T> data;
    @ApiModelProperty("查询条件")
    private Map<String, Object> parameter;
    private int limit;
    private int current;
    private int begin;
    private int end;

    public void initHeaders() {
        if (this.getData() != null && this.getData().size() != 0) {
            Class entity = this.getData().get(0).getClass();
            String showHeaders = null;
            Method headArr;
            try {
                headArr = entity.getMethod("getShow", new Class[0]);
                if (headArr != null) {
                    showHeaders = headArr.invoke(entity.newInstance(), new Object[0]).toString();
                }
            } catch (Exception var8) {
                var8.printStackTrace();
            }

            headArr = null;
            if (showHeaders != null) {
                String[] var9 = showHeaders.split(",");
                if (entity != null) {
                    Field[] fields = entity.getDeclaredFields();
                    if (fields != null && fields.length > 0) {
                        for (int i = 0; i < fields.length; ++i) {
                            Field field = fields[i];
                            if (this.getIndexCode(var9, field.getName())) {
                                ApiModelProperty it = (ApiModelProperty) field.getAnnotation(ApiModelProperty.class);
                            }
                        }
                    }
                }

            }
        }
    }

    public boolean getIndexCode(String[] arr, String code) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals(code)) {
                return true;
            }
        }

        return false;
    }

    public Page(int current, int limit) {
        this.parameter = new HashMap();
        //判断当前页小于1是有必要的。
        if (current < 1) {
            current = 1;
        }

        if (limit < 1) {
            limit = 10;
        }

        this.limit = limit;
        this.current = current;
        this.begin = (current - 1) * limit;
        this.end = current * limit;
        this.parameter.put("begin", Integer.valueOf(this.begin));
        this.parameter.put("end", Integer.valueOf(this.end));
        this.parameter.put("limit", Integer.valueOf(limit));
        this.parameter.put("current", Integer.valueOf(current));
    }


    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void addParameter(String key, Object value) {
        this.parameter.put(key, value);
    }

    public void addParameters(Map<String, Object> parameters) {
        this.parameter.putAll(parameters);
    }

    public Map<String, Object> getParameter() {
        return this.parameter;
    }

    public String toString() {
        return "Page{total=" + this.total + ", data=" + this.data + ", parameter=" + this.parameter + ", limit=" + this.limit + ", current=" + this.current + ", begin=" + this.begin + ", end=" + this.end + '}';
    }
}
