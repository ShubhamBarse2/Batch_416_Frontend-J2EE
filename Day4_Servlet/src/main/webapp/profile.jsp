<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
	padding: 0;
	min-height: 100vh;
	position: relative;
	overflow: hidden;
}

/* Blurred Background */
body::before {
	content: "";
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-image: url("bg.jpg"); /* change path if needed */
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	filter: blur(8px);
	transform: scale(1.1);
	z-index: -1;
}

.container {
	width: 40%;
	margin: 60px auto;
	background-color: rgba(255, 255, 255, 0.85);
	padding: 25px 30px;
	border-radius: 10px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.3);
	text-align: center;
}

h1 {
	color: #2c3e50;
	margin-bottom: 20px;
}

.info-row {
	margin: 12px 0;
	font-size: 16px;
	color: #333;
	text-align: left;
}

.info-row span {
	font-weight: bold;
	color: #555;
}

hr {
	border: none;
	border-top: 1px solid #ccc;
	margin: 20px 0;
}

.logout-btn {
	margin-top: 25px;
	padding: 10px 25px;
	font-size: 15px;
	color: #fff;
	background-color: #e74c3c;
	border: none;
	border-radius: 6px;
	cursor: pointer;
	transition: background-color 0.3s ease;
}

.logout-btn:hover {
	background-color: #c0392b;
}
</style>

</head>
<body>

	<div class="container">
		<h1>Employee Info</h1>

		<hr>

		<div class="info-row">
			<span>Employee ID:</span> ${employeeid}
		</div>

		<div class="info-row">
			<span>Employee Name:</span> ${name}
		</div>

		<div class="info-row">
			<span>Employee Mobile No:</span> ${MobNO}
		</div>

		<div class="info-row">
			<span>Employee City:</span> ${city}
		</div>

		<div class="info-row">
			<span>Employee Email:</span> ${email}
		</div>

		<!-- Logout Button -->
		<form action="welcome.html" method="post">
			<button type="submit" class="logout-btn">Logout</button>
		</form>
	</div>

</body>
</html>
