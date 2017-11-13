package com.lcc.drinkwater.statistics;

import java.io.Serializable;

public class Vo implements Serializable {

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private int num;

    private String wsName;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    @Override
    public String toString() {
        return "Pwk{" +
                "wsName='" + wsName + '\'' +
                ", countNum=" + countNum +
                '}';
    }

    public String getWsName() {
        return wsName;
    }

    public void setWsName(String wsName) {
        this.wsName = wsName;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    private int countNum;


}
