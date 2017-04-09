<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.*" %><%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>LibrarySystem</title>
</head>
<body>
<div id="container">
	<div class="logo">
		<a href="#"><img src="images/001.jpg" height="720" alt="" /></a>
	</div>
	
	<div id="box">
	
		<form action="dologin.jsp" method="post">
  		<label>用户名:</label>
  		<input type="text" name="username" />
  		<label>密   码: </label>
  		<input type="password" name="password" />
  		<input type="submit" value="提交" />
  		<input type="reset"  value="重置"/>
  		<select name="selectIdentity" id="selectIdentity">
  			<option value="0">读者</option>
  			<option value="1">管理员</option> 		
  		</select>
		</form>
</div>
</div>
<script>
</script>
</body>
</html>