<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext对象示例</title>
</head>
<body>
<%
	JspWriter myOut = pageContext.getOut();
	myOut.println("Hello world ! 2018年02月03日09:35:21");
	pageContext.setAttribute("darkmi", "jikexueyuan", pageContext.SESSION_SCOPE);
	String value = session.getAttribute("darkmi").toString();
	out.println("<br />" + value + "<br />");
%>
</body>
</html>