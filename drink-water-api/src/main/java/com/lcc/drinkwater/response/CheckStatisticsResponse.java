package com.lcc.drinkwater.response;

import com.lcc.drinkwater.excel.annotation.ExcelField;

import java.io.Serializable;


public class CheckStatisticsResponse implements Serializable {


    @ExcelField(title = "序号", order = 1)
    private int indexNum;
    @ExcelField(title = "所在城市", order = 2)
    private String city;
    @ExcelField(title = "水源死名称", order = 3)
    private String wsName;
    @ExcelField(title = "排污口（个）", order = 4)
    private int pwkOne;
    @ExcelField(title = "环境问题数量（个）", order = 5)
    private int hjwtOne;
    @ExcelField(title = "排污口（个）", order = 6)
    private int pwkTwo;
    @ExcelField(title = "工业企业（个）", order = 7)
    private int gyqyTwo;
    @ExcelField(title = "畜禽养殖（家）", order = 8)
    private int qcyzTwo;
    @ExcelField(title = "旅游活动（个）", order = 9)
    private int lyhdTwo;
    @ExcelField(title = "其他", order = 10)
    private int other;
    @ExcelField(title = "排查面积（m2）", order = 11)
    private double checkArea;
    @ExcelField(title = "问题面积（m2）", order = 12)
    private double questionArea;
    @ExcelField(title = "遥感版需排查面积（m2）", order = 13)
    private double ygArea;
    @ExcelField(title = "备注", order = 14)
    private String remark;

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

    public int getPwkOne() {
        return pwkOne;
    }

    public void setPwkOne(int pwkOne) {
        this.pwkOne = pwkOne;
    }

    public int getHjwtOne() {
        return hjwtOne;
    }

    public void setHjwtOne(int hjwtOne) {
        this.hjwtOne = hjwtOne;
    }

    public int getPwkTwo() {
        return pwkTwo;
    }

    public void setPwkTwo(int pwkTwo) {
        this.pwkTwo = pwkTwo;
    }

    public int getGyqyTwo() {
        return gyqyTwo;
    }

    public void setGyqyTwo(int gyqyTwo) {
        this.gyqyTwo = gyqyTwo;
    }

    public int getQcyzTwo() {
        return qcyzTwo;
    }

    public void setQcyzTwo(int qcyzTwo) {
        this.qcyzTwo = qcyzTwo;
    }

    public int getLyhdTwo() {
        return lyhdTwo;
    }

    public void setLyhdTwo(int lyhdTwo) {
        this.lyhdTwo = lyhdTwo;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }

    public double getCheckArea() {
        return checkArea;
    }

    public void setCheckArea(double checkArea) {
        this.checkArea = checkArea;
    }

    public double getQuestionArea() {
        return questionArea;
    }

    public void setQuestionArea(double questionArea) {
        this.questionArea = questionArea;
    }

    public double getYgArea() {
        return ygArea;
    }

    public void setYgArea(double ygArea) {
        this.ygArea = ygArea;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }
    @Override
    public String toString() {
        return "CheckStatisticsResponse{" +
                "city='" + city + '\'' +
                ", wsName='" + wsName + '\'' +
                ", pwkOne=" + pwkOne +
                ", hjwtOne=" + hjwtOne +
                ", pwkTwo=" + pwkTwo +
                ", gyqyTwo=" + gyqyTwo +
                ", qcyzTwo=" + qcyzTwo +
                ", lyhdTwo=" + lyhdTwo +
                ", other=" + other +
                ", checkArea=" + checkArea +
                ", questionArea=" + questionArea +
                ", ygArea=" + ygArea +
                ", remark='" + remark + '\'' +
                '}';
    }

}
