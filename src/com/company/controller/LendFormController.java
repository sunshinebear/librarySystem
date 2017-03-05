package com.company.controller;

import com.company.vo.LendForm;
import com.company.vo.RealBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
public class LendFormController {

    /*总的借书单*/
    private List<LendForm> lfList = new ArrayList<LendForm>();

    public BookController bc = new BookController();

   public LendFormController (){

   }

   public void setLendForm(int id,String BookName){
       LendForm lf = new LendForm();
       lf.setId(123);
       RealBook rb = bc.findRealBook(BookName);
       lf.setRb(rb);
       lfList.add(lf);
   }

    public void returnBook(int id){

    }



}
