<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country State City Dependent Dropdown</title>

<script src="${pageContext.request.contextPath }/resources/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	$('#comboboxCountry').on('change', function(){
		var countryId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/dropdown/loadStatesByCountry/' + countryId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxState').html(s);
			}
		});
	});
	
	$('#comboboxState').on('change', function(){
		var stateId = $(this).val();
		$.ajax({
			type: 'GET',
			url: '${pageContext.request.contextPath }/dropdown/loadCitiesByState/' + stateId,
			success: function(result) {
				var result = JSON.parse(result);
				var s = '';
				for(var i = 0; i < result.length; i++) {
					s += '<option value="' + result[i].id + '">' + result[i].name + '</option>';
				}
				$('#comboboxCity').html(s);
			}
		});
	});
});
</script>

</head>
<body>

	<form>
		<table>
			<tr>
				<td>Country</td>
				<td><select id="comboboxCountry" style="width: 200px">
						<c:forEach var="country" items="${countries }">
							<option value="${country.id }">${country.name }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>State</td>
				<td><select id="comboboxState" style="width: 200px"></select></td>
			</tr>
			<tr>
				<td>City</td>
				<td><select id="comboboxCity" style="width: 200px"></select></td>
			</tr>
		</table>
	</form>

</body>
</html>