<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Customer Form</title>
<!-- <script type="text/javascript" src="countryStateCity.js"></script>
 -->

<script
	src="${pageContext.request.contextPath }/resources/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('#comboboxCountry')
								.on(
										'change',
										function() {
											var countryId = $(this).val();
											$
													.ajax({
														type : 'GET',
														url : '${pageContext.request.contextPath }/save/loadStatesByCountry/'
																+ countryId,
														success : function(
																result) {
															var result = JSON
																	.parse(result);
															var s = '';
															for (var i = 0; i < result.length; i++) {
																s += '<option value="' + result[i].id + '">'
																		+ result[i].name
																		+ '</option>';
															}
															$('#comboboxState')
																	.html(s);
														}
													});
										});

						$('#comboboxState')
								.on(
										'change',
										function() {
											var stateId = $(this).val();
											$
													.ajax({
														type : 'GET',
														url : '${pageContext.request.contextPath }/save/loadCitiesByState/'
																+ stateId,
														success : function(
																result) {
															var result = JSON
																	.parse(result);
															var s = '';
															for (var i = 0; i < result.length; i++) {
																s += '<option value="' + result[i].id + '">'
																		+ result[i].name
																		+ '</option>';
															}
															$('#comboboxCity')
																	.html(s);
														}
													});
										});
					});
</script>
</head>

<body>

	<h1>WELCOME TO CUSTOMER PORTAL</h1>
	<br>

	<h2>Customer Details</h2>

	<form action="save" method="post">

		<div>
			<label>First Name: </label> <input type="text" name="firstname">
		</div>
		<br>
		<div>
			<label>Last Name: </label> <input type="text" name="lastname">
		</div>
		<br>
		<div>
			<label>Gender: </label> <select name="gender">
				<option value="Male">Male</option>
				<option value="Female">Female</option>
				<option value="Others">Others</option>
			</select>
		</div>
		<br>
		<div>
			<label>Type: </label> <select name="type">
				<option value="Married">Married</option>
				<option value="Unmarried">Unmarried</option>
				<option value="Divorced">Divorced</option>
			</select>
		</div>
		<br>
		<div>
			<label>Phone Number: </label> <input type="tel" name="phone">
		</div>
		<br>

		<h2>Customer Address</h2>

		<div>
			<label>House Number: </label> <input type="text" name="house">
		</div>
		<br>
		<div>
			<label>Street: </label> <input type="text" name="street">
		</div>
		<br>
		<div>
			<label>Country</label>
			<!-- <select name="Country" id="Country"	onchange="setStates();">
				<option selected="" value="-1" disabled="">Select Country</option>
				<option value="">Please Select a Country</option>
				<option value="India">India</option>
				<option value="USA">USA</option>
			</select> -->
			<select id="comboboxCountry" style="width: 200px">
				<c:forEach var="country" items="${countries }">
					<option value="${country.id }">${country.name }</option>
				</c:forEach>
			</select>
		</div>
		<br>
		<div>
			<label>State</label> 
			<!-- <select name="State" id="State"
				onchange="setCity();">
				<option selected="" value="-1" disabled="">Select State</option>
				<option value="">Please Select a State</option>
			</select> -->
			<select id="comboboxState" style="width: 200px"></select>
		</div>
		<br>
		<div>
			<label>City</label> 
			<!-- <select name="City" id="City">
				<option selected="" value="-1" disabled="">Select City</option>
				<option value="">Please Select a City</option>
			</select> -->
			<select id="comboboxCity" style="width: 200px"></select>
		</div>
		<br>
		<div>
			<label>Pincode: </label> <input type="text" name="pincode">
		</div>
		<br>
		<div>
			<label> Created By: </label> <input type="text" name="created_by">
		</div>
		<br>
		<div>
			<button type="submit">SAVE</button>
		</div>
		<br>
		<a href="home.jsp">Home</a>

	</form>

</body>
</html>