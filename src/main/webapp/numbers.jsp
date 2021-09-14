<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Numbers Fun!</title>
</head>
<body>
<h1> Let's Learn about Numbers! </h1>
<form action = "numbersServlet" method = "post">
Enter two numbers!

<input type="text" name="userNumber1" size = "12">
<input type="text" name="userNumber2" size = "12"><br>
<input type="submit" value="Learn more">

</form>
<br>
<br>

<a href="index.jsp">Or Click here to learn about letters!</a>
</body>
</html>