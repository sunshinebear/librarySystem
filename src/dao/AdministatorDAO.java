package dao;

import entity.Administrator;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;



public class AdministatorDAO {
	public Administrator getAdministrator(int num){
		try {
			Administrator administrator=new Administrator();
            String encoding="GBK";
            File file=new File("C:\\Users\\liujing\\Desktop\\details\\Administrators.txt");
            		
            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//���ǵ������ʽ
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                bufferedReader.readLine();
                while((lineTxt = bufferedReader.readLine()) != null){
                	String[] numbersArray1=lineTxt.split(" ");
                	if(num==Integer.parseInt(numbersArray1[0])){
                		administrator.setName(numbersArray1[1]);
                		administrator.setNumber(num);
                		break;
                		
                	}
                }
                read.close();
            }else{
            	System.out.println("�Ҳ���ָ�����ļ�");
            }
            
            return administrator;
          
    } catch (Exception e) {
        System.out.println("��ȡ�ļ����ݳ���");
        e.printStackTrace();
        return null;
    }
	}
}
