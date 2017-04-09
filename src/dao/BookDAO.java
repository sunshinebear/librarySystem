package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import entity.Book;
import entity.RealBook;

public class BookDAO {
	public ArrayList<Book> getAllBooks(){
		try {
			ArrayList<Book> booksOfLibrary=new ArrayList<Book>();
            String encoding="GBK";
            File file1=new File("C:\\Users\\liujing\\Desktop\\details\\Books");
            File file2=new File("C:\\Users\\liujing\\Desktop\\details\\RealBooks");
            		
            if(file1.isFile() && file1.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file1),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray1=lineTxt.split(" ");
                	Book newBook=new Book();
                	newBook.setNumber(Integer.parseInt(numbersArray1[0]));
                	newBook.setName(numbersArray1[1]);
                	newBook.setAuthor(numbersArray1[2]);
                	newBook.setPublisher(numbersArray1[3]);
                	newBook.setIntroduction(numbersArray1[4]);
                	newBook.setAmount(Integer.parseInt(numbersArray1[5]));
                	newBook.setNowAmount(Integer.parseInt(numbersArray1[6]));
                	booksOfLibrary.add(newBook);
                }
                read.close();
            }else{
            	System.out.println("找不到指定的文件");
            }
            
            if(file2.isFile() && file2.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file2),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray2=lineTxt.split(" ");
                	int numOfRealBook;
                	int numOfBook;
                	
                	numOfRealBook=Integer.parseInt(numbersArray2[0]);
                	numOfBook=Integer.parseInt(numbersArray2[1]);
                	
                	booksOfLibrary.get(numOfBook).getIdOfRealBooks().add(numOfRealBook);
                	
                }
                read.close();
            }else{
            	System.out.println("找不到指定的文件");
            }
            return booksOfLibrary;
          
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
        return null;
    }
		
	}
	
	
	public ArrayList<RealBook> getAllRealBooks(){
		try {
			ArrayList<RealBook> RealBooksOfLibrary=new ArrayList<RealBook>();
            String encoding="GBK";
            File file=new File("C:\\Users\\liujing\\Desktop\\details\\RealBooks");
            		
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray1=lineTxt.split(" ");
                	RealBook newRealBook=new RealBook();
                	newRealBook.setNumber(Integer.parseInt(numbersArray1[0]));
                	newRealBook.setBookNumber(Integer.parseInt(numbersArray1[1]));
                	newRealBook.setIdOfRealBook(numbersArray1[2]);
                	newRealBook.setLend(Integer.parseInt(numbersArray1[3]));
                	newRealBook.setContinueLend(Integer.parseInt(numbersArray1[4]));
                	newRealBook.setIntStartLendDay(Integer.parseInt(numbersArray1[5]));
                
                	RealBooksOfLibrary.add(newRealBook);
                }
                read.close();
            }else{
            	System.out.println("找不到指定的文件");
            }
            
            return RealBooksOfLibrary;
          
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
        return null;
    }
		
	}
}
