<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1>Grocery Application</h1>


	<form action="result.do" method="post">
	<br>
		<span style="color : red;"> ${message}</span>
	<br>
	<label  style="color : red;">name:</label> <span style="color : red;"> ${grocery.name}</span>
	<br>
	<label  style="color : red;">quantity:</label><span style="color : red;"> ${grocery.quantity}</span>
	<br>
	<label  style="color : red;">price:</label><span style="color : red;"> ${grocery.price}</span>
	<br>
	<label  style="color : red;">type:</label><span style="color : red;"> ${grocery.type}</span>
	<br>
	<label  style="color : red;">brand:</label><span style="color : red;"> ${grocery.brand}</span>
	<br>
	<span style="color : red;"> ${totalprice}</span>
	<br>	

	<br>		
		
		<a href="AddItem.jsp">Add another item</a>
		<br><br>
		
		<a href="LandingPage.jsp">GO HOME</a>
		
		</form>

	</form>
</body>
</html>