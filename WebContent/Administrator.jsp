<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Administrator</title>
<style type="text/css">
body{margin:0;padding:0}
.head{width:800px;height:100px;background:#ccc;margin:0 auto}
.middle{width:800px;height:600px;background:#987;margin:0 auto}
.tail{width:800px;height:100px;background:#ccc;margin:0 auto}
.left{width:150px;height:600px;background:#aaa;float:left}
.right{width:650px;height:600px;background:#ccc;float:right}
.topOfRight{width:650px;backgroud:#cab}
.belowOfRight{width:650;backgroud:#678}
form>input{
    border-radius: 25px;　　/*设置输入框两边的边框半径，可以使两边变成弧形*/
    width: 270px;　　　　　　 /*设置输入框宽度*/
    outline: none;　　　　　　/*当鼠标点击输入框后“边框不会变蓝”*/
    background-image:url(http://xxx.xx.xxx.xx/Public/img/title_search.png);　　/*给输入框里面加一个搜索按钮的图标*/
    background-repeat: no-repeat;　　/*如果不设置这项，图标会不断重复出现*/
    background-size: 21px 21px;     /*设置图标的大小*/
    background-position: 95%;       /*对图标的位置进行定位*/
}
</style>

 <script src="http://libs.baidu.com/jquery/1.9.1/jquery.js"></script>
</head>
<body>

<div class="head">
	<input type="button" value="注销" id="logout" />
	<script type="text/javascript">
        //this指向button元素
         $("#logout").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
    
    
	<input type="button" value="修改密码" id="changePassword" />
	<script type="text/javascript">
        //this指向button元素
         $("#changePassword").click(function() {
        	 window.navigate("changePassword.jsp"); 
        })
    </script>
    
</div>
<div class="middle">
<div class="left">
	<input type="button" value="查看借书单" id="lendForm" />
	<script type="text/javascript">
        //this指向button元素
         $("#lendForm").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
    
    
    <input type="button" value="查看日志" id="logForm" />
	<script type="text/javascript">
        //this指向button元素
         $("#logForm").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
    
    
    <input type="button" value="添加书籍" id="addBook" />
	<script type="text/javascript">
        //this指向button元素
         $("#addBook").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
    
    
    <input type="button" value="添加读者" id="addReader" />
	<script type="text/javascript">
        //this指向button元素
         $("#addReader").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
    
    <input type="button" value="添加管理员" id="addAdministrator" />
	<script type="text/javascript">
        //this指向button元素
         $("#addAdministrator").click(function() {
        	 window.navigate("login.jsp"); 
        })
    </script>
</div>
<div class="right">
	<div class="topOfRight">
	<form>
      <input type="text" placeholder="    搜索关键字">
	</form>
	</div>
	<div class="belowOfRight"></div>
</div>
</div>
<div class="tail"></div>

<script>
$("#foo").click(function(event) {
	response.sendRedirect("login.jsp");});	
</script>
</body>
</html>