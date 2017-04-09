<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import = "dao.PersonsDAO"%>
<%@ page import = "entity.Person"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>展示</h1>
<hr>

<center>
<table width="750" height="60" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td>
		<%
	PersonsDAO personsDAO = new PersonsDAO();
	ArrayList<Person> persons= personsDAO.getAllPerson();
	for(int i=0;i<persons.size();i++){
		
	
        %>
		<%
			Person person=persons.get(i);		
		%>
			<div>
				<dl>
					<dt>
						<a href="details.jsp"><img src="images/001.JPG"  width="120"  > </a>				
					
					</dt>
					<dd class="dd_name"><%=person.getName()%></dd>
					<dd class="dd_academy">学院：<%=person.getAcademy() %></dd>
				</dl>
			</div>
			<% }%>
		</td>
	</tr>
</table>

</center>

</body>
</html>