<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Customer</title>
</head>
<body>

	<h1>DATA IS STORED</h1>

	<h2>Customer Details</h2>
	Customer First Name: ${customer.firstname}<br>
	Customer Last Name: ${customer.lastname}<br>
	Customer Gender: ${customer.gender}<br>
	Customer Type: ${customer.type}<br>
	Customer Phone: ${customer.phone}<br>
	Customer House Number: ${customer.house}<br>
	Customer Street: ${customer.street}<br>
	Customer City: ${customer.city}<br>
	Customer Pincode: ${customer.pincode}<br>
	Customer State: ${customer.state}<br>
	Customer Country: ${customer.country}
    <h2>Audit Columns</h2>
    Customer Created_By: ${customer.created_by}<br>
    Customer Created_On: ${customer.created_on}<br>
    Customer Updated_By: ${customer.updated_by}<br>
	Customer Uodated_On: ${customer.updated_on}<br>
	
	<a href="save"> Click here to insert another customer details</a><br>
	<a href="home.jsp">Home</a>
	
</body>
</html>