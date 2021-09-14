<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p> 
<strong>${LetterStats.getLetter()}</strong> is the letter you typed! <br>
<strong>${LetterStats.getLetterUP()}</strong> is the letter you typed in upper case!<br>
<strong>${LetterStats.getLetterLOW()}</strong> is the letter you typed in lower case!<br>
<strong>${LetterStats.getLetter()}</strong> is the <strong>${LetterStats.getAlphaIndex()}</strong> letter of the alphabet!<br>
<strong>${LetterStats.getSoundWord()}</strong> starts with the letter <strong>${LetterStats.getLetter()}</strong>!</p>
<br>
<br>

<a href="index.jsp">Click here to pick another letter!</a>
<br>
<a href="numbers.jsp">Or Click here to learn about numbers!!</a>
</body>
</html>