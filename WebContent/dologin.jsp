<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="entity.Person" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.io.BufferedReader"%>	
<%@ page import="java.io.File"%>
<%@ page import="java.io.FileInputStream"%>
<%@ page import="java.io.InputStreamReader"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":";
	String username="";
	String password="";
	int identity;
	request.setCharacterEncoding("utf-8");
	
	username=request.getParameter("username");
	password=request.getParameter("password");
	identity=Integer.parseInt(request.getParameter("selectIdentity"));
	String url="";
	int num=0;
	
	switch(identity){
	case 0:{
		url="C:\\Users\\liujing\\Desktop\\details\\ReaderPassword.txt";
		break;
	}
	case 1:{
		url="C:\\Users\\liujing\\Desktop\\details\\AdministratorPassword.txt";
		break;
	}
	default:;
	}
	try {
		String findUser="";
		String findPass="";
		boolean isFind=false;
        String encoding="GBK";
        File file=new File(url);           		
        if(file.isFile() && file.exists()){ //判断文件是否存在
            InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
            BufferedReader bufferedReader = new BufferedReader(read);
            String lineTxt = null;
            bufferedReader.readLine();
            while((lineTxt = bufferedReader.readLine()) != null){
            	String[] numbersArray1=lineTxt.split(" ");
            	num=Integer.parseInt(numbersArray1[0]);
            	findUser=numbersArray1[1];
            	findPass=numbersArray1[2];
            	if(findUser.equals(username)&&findPass.equals(password)){
            		isFind=true;
            	}                	
            }
            read.close();
        }else{
        	System.out.println("找不到指定的文件");
        }

        if(isFind){
        	session.setAttribute("identity", identity);
        	session.setAttribute("number",num);
        	if(identity==0)
        		request.getRequestDispatcher("Reader.jsp").forward(request,response);
        	else if(identity==1)
        		request.getRequestDispatcher("Administrator.jsp").forward(request,response);
        }
        else{
        	response.sendRedirect("login.jsp");
			
        }    
    } catch (Exception e) {
        System.out.println("读取文件内容出错");
        e.printStackTrace();
    
    }
		
	
	

%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>