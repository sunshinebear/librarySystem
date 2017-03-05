package com.company.controller;

import com.company.vo.Book;
import com.company.vo.RealBook;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class BookController {

    private List<Book> bookList = new ArrayList<Book>();

    public  BookController(){
        Book b =new Book();
        bookList.add(b);
    }

    public void generatorName(){

    }

    public RealBook findRealBook(String bookName){
        for(int i=0;i<bookList.size();i++){
            Book bk = bookList.get(i);
            if(bk.getName().equals(bookName)){
                if(bk.getAmount()>0){
                    for (int j = 0; j < bk.getRealBookList().size(); j++) {
                        RealBook rbk = bk.getRealBookList().get(j);
                        if(rbk.getIsLend() == 0){
                            return bk.getRealBookList().get(j);
                        }
                    }
                }
            }

        }
        return null;
    }

    /*借书率*/
    public void getLendRate(){


    }




    public void setUpBook(Book b){
        bookList.add(b);
    }


    /*借书*/
    public void lentBook(int id ,int name){


    }

    /*预约*/

    public void orderBook(String bookName,int id){
        bookList.get(0).getOrderPerson().add(id);
    }


    public void returnBook(int id){

    }

}
