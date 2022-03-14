<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getAllGrocery.do">
	<label>get All Grocery</label>
	<input type="submit" value="ClickToGetAll" />
	
	</form>
	<div>
	
		<h2 style="color: red;">$message</h2>
		<c:forEach items="${ListOfGrocery}" var="grocery">
			<div>
				<label>grocery name: </label>${grocery.name}<br> 
				<label>grocery quantity: </label>${grocery.quantity}<br> 
				<label>grocery price: </label>${grocery.price}<br> 
				<label>grocery type: </label>${grocery.type}<br>
				<label>grocery brand: </label>${grocery.brand}<br> 
				<h3 style="color: red;">$message</h3>
				<span style="color: blue;"> ${totalprice}</span>
			</div>

		</c:forEach>
	</div>
	<div><a href="LandingPage.jsp">home page</a></div>


</body>
</html>