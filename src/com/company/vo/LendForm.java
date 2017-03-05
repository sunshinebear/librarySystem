package com.company.vo;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class LendForm {
    private int id;
    private int personId;
    private RealBook rb;
    private Date lendTime;

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    private Date returnTime;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RealBook getRb() {
        return rb;
    }

    public void setRb(RealBook rb) {
        this.rb = rb;
    }

    public Date getLendTime() {
        return lendTime;
    }

    public void setLendTime(Date lendTime) {
        this.lendTime = lendTime;
    }
}
