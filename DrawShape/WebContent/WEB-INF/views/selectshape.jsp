<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Shape</title>
</head>
<script>
	function validateform() {
		var height = document.shapeSelect.height.value;
		if (height == null || height == 0) {
			alert("Height can't be blank or zero");
			return false;
		} else if (isNaN(height)) {
			alert("Height should be digit !!");
			return false;
		}
	}
</script>
<body>

	<form:form name="shapeSelect" modelAttribute="newShape" method="post"
		action="/DrawShape/" onsubmit="return validateform()">
		<table>
		<tr>
		<td>Please Provide Details to Draw Shape !!! </td>
		</tr>
			<tr>
				<td>Shape:</td>

				<td><form:select path="shape">
						<form:options items="${shapes}"></form:options>
					</form:select></td>
			</tr>
			<tr>
				<td>Shape Height:</td>
				<td><form:input id="height" name="height" path="height"
						type="text" /></td>

			</tr>

			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>