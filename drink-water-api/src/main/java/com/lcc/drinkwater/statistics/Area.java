package com.lcc.drinkwater.statistics;

import java.io.Serializable;

public class Area implements Serializable {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    private double area;

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    private String wsName;
}
