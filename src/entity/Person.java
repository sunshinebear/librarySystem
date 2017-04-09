package entity;

import java.util.*;  

public class Person {
	
	private int number;
	private String name;
	private int id;
	private String academy;
	private int identity;
	private int nowLendBook;
	private double moneyToPay;
	private int violation;

	
	private ArrayList<String> myLendBooks;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public int isIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	public int getNowLendBook() {
		return nowLendBook;
	}
	public void setNowLendBook(int nowLendBook) {
		this.nowLendBook = nowLendBook;
	}
	public double getMoneyToPay() {
		return moneyToPay;
	}
	public void setMoneyToPay(double moneyToPay) {
		this.moneyToPay = moneyToPay;
	}
	public int getViolation() {
		return violation;
	}
	public void setViolation(int violation) {
		this.violation = violation;
	}
	public ArrayList<String> getMyLendBooks() {
		return myLendBooks;
	}
	public void setMyLendBooks(ArrayList<String> myLendBooks) {
		this.myLendBooks = myLendBooks;
	}
}
