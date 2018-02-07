<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JSP表达式输出： <%="Hello tengfei!" %>
<br />
<%!
	String str = "Hello World";
%>

<%
// 	String str = "Hello JSP";
	out.println(str);
%>
<br />
<a href="<%= request.getContextPath() %>/20/index.jsp">Index Jsp</a> <br />

</body>
</html>