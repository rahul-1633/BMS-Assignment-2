<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer Form</title>
<script type="text/javascript" src="countryStateCity.js"></script>
</head>
<body>

	<form action="update" method="post">
	
		<div>
			<label>Enter Customer Phone Number whose data will be update: </label> <input type="tel" name="phone">
		</div><br>
	
		<h2>Customer Address</h2>
		
		<div>
			<label>House Number: </label> <input type="text" name="house">
		</div><br>
		<div>
			<label>Street: </label> <input type="text" name="street">
		</div><br>
		<div>
			<label>Country</label> 
			<select name="Country" id="Country"	onchange="setStates();">
				<option selected="" value="-1" disabled="">Select Country</option>
				<option value="India">India</option>
				<option value="USA">USA</option>
			</select>
		</div><br>
		<div>
			<label>State</label> 
			<select name="State" id="State" onchange="setCity();">
				<option selected="" value="-1" disabled="">Select State</option>
				<option value="">Please Select a Country</option>
			</select>
		</div><br>
		<div>
			<label>City</label> 
			<select name="City" id="City">
				<option selected="" value="-1" disabled="">Select City</option>
				<option value="">Please Select a State</option>
			</select>
		</div><br>
		<div>
			<label>Pincode: </label> <input type="text" name="pincode">
		</div><br>

		<div>
			<label>Updated By: </label> <input type="text" name="updated_by">
		</div><br>
		<div>
			<button type="submit">UPDATE</button>
		</div>
		<br><a href="home.jsp">Home</a>
	</form>
	
</body>
</html>