<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Find Customer Form</title>
</head>
<body>

	<form action="find" method="post">
		<div>
			<label>Enter Customer Phone Number whose data will be deleted: </label> <input type="text" name="phone">
		</div>
		<div>
			<button type="submit">FIND</button>
		</div>
		<br><a href="home.jsp">Home</a>
	</form>
	
</body>
</html>