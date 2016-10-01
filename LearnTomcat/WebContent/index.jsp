<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title</title>
</head>
<body>
	Hello, <%=7*8 %> <!-- выполнится на сервере!!!! Внутрь этой конствукции вставляем код на Java-->
	<a href="about.jsp">
		<img src="image.jpg">
	</a>
	
	
</body>
</html>

<!-- файлы из WEB_INF не будут доступны при выполнении -->