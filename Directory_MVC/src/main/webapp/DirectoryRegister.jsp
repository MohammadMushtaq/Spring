<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1 style="color: navy;">welcome to Phone directory</h1>

	<form action="dir.do" method="post">
	<span style="color: red;">${message}</span>
	<div>
	<label style="font-family:fantasy; ">Name</label>
	<input type="text" name="name">
	</div>
	<div>
	<label style="font-family:fantasy; ">Mobile Num</label>
	<input type="text" name="mobileNo">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">Address</label>
	<textarea name="address" rows="5" cols="40"></textarea>
	</div>
	
	<div>
	<label style="font-family:fantasy; ">landmark</label>
	<input type="text" name="landmark">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">LandlineNo</label>
	<input type="text" name="landlineNum">
	</div>
	
	<div>
	<label style="font-family:fantasy; ">City</label>
	<select  name="city">
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
	</form>
</body>

</html>