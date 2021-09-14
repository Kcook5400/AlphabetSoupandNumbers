<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Alphabet Soup</title>
</head>
<body>
<h1> Let's learn about the alphabet!</h1>

<form action="alphaServlet" method = "post">
Enter a letter of the alphabet!:
<br>
<input type = "text" name = "letter" size = "12">
<input type = "submit" value = "Learn More">  
<br>
<br>
<a href="numbers.jsp">Want to learn about numbers?! Click Here!</a>

</form>
</body>
</html>