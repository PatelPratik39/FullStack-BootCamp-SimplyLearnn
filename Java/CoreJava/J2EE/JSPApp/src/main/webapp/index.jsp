<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<p>Welcome to HTML Web Page <p/>
<%
	int a= 10;
	int b = 20;
	int sum = a + b;
	System.out.println("Welcome to JSP on console.. ");
	out.println("Welcome to JSP..");
	out.println("Sum of two Numbers is " + sum);
%>
</body>
</html>