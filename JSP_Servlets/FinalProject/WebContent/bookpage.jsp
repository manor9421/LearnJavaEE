<%@page import="java.sql.DriverManager"%>
<%@page import="com.mnr.beans.Book"%>
<%@page import="com.mnr.database.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- заголовок --%>
<jsp:include page="header.jsp">
	<jsp:param name="title" value="Book list" />
</jsp:include>

<%

String mySqlUser = "root";
String mySqlPwd = "111";
String mySqlUrl = "jdbc:mysql://localhost:3306/workers";

DBConnection dbConnection = new DBConnection();

try {
    String connectionURL = "jdbc:mysql://host/db";
    Connection connection = null; 
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    connection = DriverManager.getConnection(mySqlUrl, mySqlUser, mySqlPwd);
    
    if(!connection.isClosed()){
    	Book[] books = dbConnection.findBooks(connection);
    	pageContext.setAttribute("bookList", books);// делаем переменную видимой для jstl
    	connection.close();
    }
}catch(Exception ex){
    out.println("Unable to connect to database"+ex);
}   


%>

<c:forEach var="book" items="${bookList}">
	<div class="book-div">
		<p class="book_name">Name: ${book.getName()}</p>
		<p class="book_author">Author: ${book.getAuthor()}</p>
		<p class="book_price">Price: ${book.getPrice()}</p>
		<p class="book_id">id: ${book.getId()}</p>
	</div>


</c:forEach>







<jsp:include page="footer.jsp" />