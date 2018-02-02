<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Config 对象示例</title>
</head>
<body>
	用户名： <%= config.getInitParameter("username")%> <br />
	密码: <%=config.getInitParameter("password") %>
</body>
</html>