<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% /* увидит только то, что прилетит реквестом */%>
<jsp:useBean id="user3" class="com.mnr.beans.User" scope="request" ></jsp:useBean>

Email: <%= user3.getEmail() %>
<p/>
Password: <%= user3.getPassword() %>

</body>
</html>