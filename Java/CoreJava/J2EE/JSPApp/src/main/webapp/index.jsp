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
	<%! int a = 12,b= 13,sum = 0; %>
<%
	/* int a= 10;
	int b = 20;
	int sum = a + b; */
	a = 100;
	b = 200;
	sum = a + b;
	System.out.println("Welcome to JSP on console.. ");
	out.println("Welcome to JSP..");
	out.println("Sum of two Numbers is " + sum);/*  */
	out.println("<font color = 'red'> Sum of two number is "+ sum + " </font>");
%>
<p>Sum of numbers i <%= 39 + 20 %> </p>
</body>
</html>