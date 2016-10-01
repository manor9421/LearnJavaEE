<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Post to guestbook</title>
</head>
<body>
	<table>
		<c:forEach var="post" items="${requestScope.posts}">
			<tr>
				<td><c:out value="${post.id}"></c:out></td>
				<td><c:out value="${post.txt}"></c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>