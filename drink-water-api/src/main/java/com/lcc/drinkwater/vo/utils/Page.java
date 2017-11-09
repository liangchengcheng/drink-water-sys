package com.lcc.drinkwater.vo.utils;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Page<T> implements Serializable {

    private static final long serialVersionUID = 1244437270503922868L;

    @ApiModelProperty("每页数据列表")
    private List<T> data;
    @ApiModelProperty("查询条件")
    private Map<String, Object> parameter;
    /**
     * 每页显示多少记录
     */
    private int rows = 5;

    /**
     * 当前页
     */
    private int page = 0;

    /**
     * pg数据库分页需要计算的参数
     */
    private int offsetNum = 0;

    /**
     * 总条数
     */
    private int total = 0;
    /**
     * 总页数
     */
    private int pageCount = 0;

    public Page() {
//        init(total,rows,page);
    }

    public void init(){
        this.pageCount = (this.total + this.rows - 1) / this.rows;
        this.offsetNum = (this.page - 1) * this.rows;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Map<String, Object> getParameter() {
        return parameter;
    }

    public void setParameter(Map<String, Object> parameter) {
        this.parameter = parameter;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getOffsetNum() {
        return offsetNum;
    }

    public void setOffsetNum(int offsetNum) {
        this.offsetNum = offsetNum;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Page{" +
                "data=" + data +
                ", parameter=" + parameter +
                ", rows=" + rows +
                ", page=" + page +
                ", offsetNum=" + offsetNum +
                ", total=" + total +
                ", pageCount=" + pageCount +
                '}';
    }
}
