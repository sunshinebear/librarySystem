package entity;


public class RealBook {
	private int number;
	private int bookNumber;
	private String idOfRealBook;
	private int isLend;
	private int isContinueLend;
	private int intStartLendDay;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getIdOfRealBook() {
		return idOfRealBook;
	}
	public void setIdOfRealBook(String idOfRealBook) {
		this.idOfRealBook = idOfRealBook;
	}
	public int isLend() {
		return isLend;
	}
	public void setLend(int isLend) {
		this.isLend = isLend;
	}
	public int isContinueLend() {
		return isContinueLend;
	}
	public void setContinueLend(int isContinueLend) {
		this.isContinueLend = isContinueLend;
	}
	public int getIntStartLendDay() {
		return intStartLendDay;
	}
	public void setIntStartLendDay(int intStartLendDay) {
		this.intStartLendDay = intStartLendDay;
	}
}
