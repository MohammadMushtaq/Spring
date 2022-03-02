<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h1 style="color: navy;">welcome to Phone directory</h1>
	
	<span style="red">${message}</span>
	
	<form action="dir.do" method="post"></form>
	<div>
	<label style="font-family:fantasy; ">Name</label>
	<input type="text" name="name">
	</div>
	<div>
	<label style="font-family:fantasy; ">Mobile Num</label>
	<input type="text" name="mobileNum">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">Address</label>
	<textarea path="address" rows="5" cols="40"></textarea>
	</div>
	
	<div>
	<label style="font-family:fantasy; ">LandMark</label>
	<input type="text" name="landMark">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">Landline No</label>
	<input type="text" name="landlineNo">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">City</label>
	<select name="city">
	<option>Bangalore</option>
	<option>Hydrabad</option>
	<option>Bellary</option>
	<option>Anantapur</option>
	<option>Gulbarga</option>
	<option>shivmogga</option>
	<option>Hubli</option>
	<option>dharwad</option>
	</select>
	</div>
	
	<div>
	<label style="font-family:fantasy; ">Pincode</label>
	<select name="pincode">
	<option>583101</option>
	<option>587412</option>
	<option>562000</option>
	<option>560090</option>
	<option>465864</option>
	<option>255945</option>
	<option>146264</option>
	<option>546564</option>
	</select>
	</div>
	
	<div>
	<input style="color: green;" type="submit" value="Add Contact">
	</div>

</body>
</html>