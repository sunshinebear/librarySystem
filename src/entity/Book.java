package entity;

import java.util.*;  

public class Book {
	private int number;

	private String name;
	private String author;
	private String publisher;
	private String introduction;
	private int amount;
	private int nowAmount;
	
	private ArrayList<Integer> numOfRealBooks;
	private ArrayList<Integer> orderPersons;
	
	
	public Book(){
		number=0;
		name="";
		author="";
		publisher="";
		introduction="";
		amount=0;
		nowAmount=0;
		
		numOfRealBooks=new ArrayList<Integer>();
		orderPersons=new ArrayList<Integer>();
		
	}
	
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getNowAmount() {
		return nowAmount;
	}
	public void setNowAmount(int nowAmount) {
		this.nowAmount = nowAmount;
	}
	public ArrayList<Integer> getIdOfRealBooks() {
		return numOfRealBooks;
	}
	public void setIdOfRealBooks(ArrayList<Integer> idOfRealBooks) {
		this.numOfRealBooks = idOfRealBooks;
	}
	public ArrayList<Integer> getOrderPerson() {
		return orderPersons;
	}
	public void setOrderPerson(ArrayList<Integer> orderPerson) {
		this.orderPersons = orderPerson;
	}
}
