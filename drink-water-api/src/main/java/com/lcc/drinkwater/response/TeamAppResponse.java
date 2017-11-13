package com.lcc.drinkwater.response;

import java.io.Serializable;

public class TeamAppResponse implements Serializable {

    private String ti;
    private String tn;
    private String mbs;


    public String getTi() {
        return ti;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getTn() {
        return tn;
    }

    public void setTn(String tn) {
        this.tn = tn;
    }

    public String getMbs() {
        return mbs;
    }

    public void setMbs(String mbs) {
        this.mbs = mbs;
    }
}
