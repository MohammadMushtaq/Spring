<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Grocery application</h1>
	<form action="add.do" method="post">
		<table>

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
				</select>
			</div>

			<div>
				<label for="quantity">quantity</label> <select name="quantity">
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
					<option>7</option>
					<option>8</option>
				</select>
			</div>

			<div>
				<label>price</label> <input type="text" name="price">
			</div>
			<div>
				<label for="type">type</label> <select name="type">
					<option>kg</option>
					<option>gms</option>
					<option>ltr</option>
					<option>piece</option>
					<option>dozen</option>
					<option>quant</option>
				</select>
			</div>

			<label for="brand">brand</label>
			<select name="brand">
				<option>sunflower</option>
				<option>ashirwad</option>
				<option>mount everest</option>
				<option>bru</option>
				<option>relience</option>
				<option>tata</option>
				<option>haldiram</option>
			</select>
			<div>
				<input type="submit" name="add item">
			</div>
		</table>
		<br> <a href="LandingPage.jsp">back to home</a> </br>
	</form>
</body>
</html>