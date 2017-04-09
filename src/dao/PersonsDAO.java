package dao;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;


import entity.Person;

public class PersonsDAO {
	
	public Person getPerson(int num){
		try {
			Person person=new Person();
            String encoding="GBK";
            File file=new File("C:\\Users\\liujing\\Desktop\\details\\Persons.txt");
            		
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray1=lineTxt.split(" ");
                	if(num==Integer.parseInt(numbersArray1[0])){
                		person.setName(numbersArray1[1]);
                		person.setNumber(num);
                		person.setId(Integer.parseInt(numbersArray1[2]));
                		person.setAcademy(numbersArray1[3]);
                		person.setIdentity(Integer.parseInt(numbersArray1[4]));
                		person.setMoneyToPay(Integer.parseInt(numbersArray1[5]));
                		person.setViolation(Integer.parseInt(numbersArray1[6]));
                		break;
                		
                	}
                }
                read.close();
            }else{
            	System.out.println("找不到指定的文件");
            }
            
            return person;
          
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
        return null;
    }
	}
	public ArrayList<Person> getAllPerson(){
		try {
			ArrayList<Person> allPerson=new ArrayList<Person>();
            String encoding="GBK";
            File file=new File("C:\\Users\\liujing\\Desktop\\details\\Persons.txt");
            		
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray1=lineTxt.split(" ");
                	Person newPerson=new Person();
                	newPerson.setNumber(Integer.parseInt(numbersArray1[0]));
                	newPerson.setName(numbersArray1[1]);
                	newPerson.setId(Integer.parseInt(numbersArray1[2]));
                	newPerson.setAcademy(numbersArray1[3]);
                	newPerson.setIdentity(Integer.parseInt(numbersArray1[4]));
                	newPerson.setMoneyToPay(Integer.parseInt(numbersArray1[5]));
                	newPerson.setViolation(Integer.parseInt(numbersArray1[6]));
                	
                	allPerson.add(newPerson);
                }
                read.close();
            }else{
            	System.out.println("找不到指定的文件");
            }
            
            return allPerson;
          
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
        return null;
    }
		
	}
}
