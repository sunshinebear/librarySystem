package com.company.vo;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class BookHistory {
    private String name;
    private Date lendTime;
    private Date returnTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLendTime() {
        return lendTime;
    }

    public void setLendTime(Date lendTime) {
        this.lendTime = lendTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }
}
