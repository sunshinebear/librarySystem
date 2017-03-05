package com.company.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class Book {
    /*某一类书的id*/
    private String id;
    private String name;
    private String author;
    private String publish;
    private String introduce;
    private Date buyTime;
    /*是否借出*/
    private int lend;
    private int order;

    /*总共多少*/
    private int amount;

    /*在馆数目*/
    private int inAmount;

    public List<Integer> getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(List<Integer> orderPerson) {
        this.orderPerson = orderPerson;
    }

    /*预约人的id*/
    private List<Integer> orderPerson;


    public int getInAmount() {
        return inAmount;
    }

    public void setInAmount(int inAmount) {
        this.inAmount = inAmount;
    }

    private List<RealBook> realBookList = new ArrayList<RealBook>();

    public List<RealBook> getRealBookList() {
        return realBookList;
    }

    public void setRealBookList(List<RealBook> realBookList) {
        this.realBookList = realBookList;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getLend() {

        return lend;
    }

    public void setLend(int lend) {
        this.lend = lend;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
