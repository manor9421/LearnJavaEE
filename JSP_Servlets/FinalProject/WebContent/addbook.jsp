<%-- заголовок --%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Book list" />
</jsp:include>

<form action="act.jsp" method="POST">
	<input type="text" name="book_name"/><br/>
	<input type="text" name="book_author"/><br/>
	<input type="text" name="book_price"/><br/>
	<input type="submit" value="Confirm"/>
</form>

<jsp:include page="footer.jsp"/>