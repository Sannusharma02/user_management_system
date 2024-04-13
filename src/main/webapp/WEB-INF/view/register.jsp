<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="register" method="post">

		<div>
			<label for="name">Name</label> <input type="text" name="name">
		</div>

		<div>
			<label for="email">Email</label> <input type="email" name="email">
		</div>

		<div>
			<label for="password">Password</label> <input type="password"
				name="password">
		</div>

		<div>
			<label for="contact">Contact</label> <input type="tel" name="contact">
		</div>

		<div>
			<label for="address">Address</label> <input type="text"
				name="address">
		</div>

		<div>
			<input type="submit" value="Register">
		</div>
	</form>
</body>
</html>