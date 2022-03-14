<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search.do">
		<div>
			<label for="name">name</label> <select name="name">
				<option>long grain basmati rice</option>
				<option>Wheat flour</option>
				<option>Maida</option>
				<option>Green Gram Dal</option>
				<option>Coffee</option>
				<option>Coriander seeds</option>
				<option>Red Chillies powder</option>
				<option>Tamarind</option>
				<option>cooking oil</option>
			</select> <br> <input type="submit" value="search" />
		</div>


		<br></br> <a href="LandingPage.jsp">home page</a>

	</form>

	<h2>${message}</h2>

	<label>grocery name: </label>${grocery.name}<br>
	<label>grocery quantity: </label>${grocery.quantity}<br>
	<label>grocery price: </label>${grocery.price}<br>
	<label>grocery type: </label>${grocery.type}<br>
	<label>grocery brand: </label>${grocery.brand}<br>
	<span style="color: blue;"> ${totalprice}</span>

	<br></br>
	<br>
	<a style="font-size: xx-large; color: navy;" href="UpdateItem.jsp">update item</a>
	<br>

</body>
</html>