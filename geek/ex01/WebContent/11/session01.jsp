<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session示例 01</title>
</head>
<body>
		Session 示例。。。 <br />
		Session 的唯一标识符 ：<%= session.getId() %> <br />
		Session 的创建时间 ： <%= new java.util.Date(session.getCreationTime()).toString() %> <br />
		Session 的最后访问时间： <%=  new java.util.Date(session.getLastAccessedTime()).toString() %> <br />
		Session 的失效时间： <%= session.getMaxInactiveInterval() %> <br />
		
		
</body>
</html>