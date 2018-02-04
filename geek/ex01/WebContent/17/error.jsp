<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆错误提示页</title>
</head>
<body>
	登陆失败 ! <br />
	请提交的信息为：<br />
	用户名：<%= request.getParameter("uname") %> <br />
	密码：<%= request.getParameter("password") %> <br />
	<a href="login.jsp">返回登录页面</a>
</body>
</html>