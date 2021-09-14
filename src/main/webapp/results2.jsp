<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Results</title>
</head>
<body>
<p>
<strong>${NumberStats.getNum1()} </strong> and <strong>${NumberStats.getNum2() }</strong> are the numbers you typed! <br>
<strong>${NumberStats.getAdd() }</strong> is what <strong>${NumberStats.getNum1()}</strong> <em>added</em> to <strong>${NumberStats.getNum2() }</strong> is!<br><br>
<strong>${NumberStats.getSubtract() }</strong> is what <strong>${NumberStats.getNum1()}</strong> <em>minus</em> <strong>${NumberStats.getNum2() }</strong> is!<br>
<strong>${NumberStats.getMultiply() }</strong> is what <strong>${NumberStats.getNum1()}</strong> <em>multiplied</em> by <strong>${NumberStats.getNum2() }</strong> is!<br>
<strong>${NumberStats.getDivide() }</strong> is what <strong>${NumberStats.getNum1()}</strong> <em>divided</em> by <strong>${NumberStats.getNum2() }</strong> is!<br>
</p>
<br>
<br>
<a href="numbers.jsp">Click here to enter more numbers!!</a>

<br>
<a href="index.jsp"> Or Click here to learn more about letters!</a>
</body>
</html>