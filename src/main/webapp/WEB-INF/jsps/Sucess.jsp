<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored= "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<h2>${employeeDetails.username}</h2>
	<form action="Home">
		<table>
			<tr>
				<td><button type="submit">HomePage</button></td>
			</tr>
		</table>
	</form>
</body>
</html>