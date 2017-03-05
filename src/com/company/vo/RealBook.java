package com.company.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class RealBook {
    /*书的编号*/
    private int id;


    /*1 借出  0 未借出*/
    private int isLend;

    private List<BookHistory> historyList =new ArrayList<BookHistory>();


    public int getId() {
        return id;
    }

    public List<BookHistory> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<BookHistory> historyList) {
        this.historyList = historyList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsLend() {
        return isLend;
    }

    public void setIsLend(int isLend) {
        this.isLend = isLend;
    }

}
