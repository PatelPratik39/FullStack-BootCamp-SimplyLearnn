<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid= request.getParameter("emailid");
password = request.getParameter("password");
if(emailid.equals("abc@email.com") && password.equals("abc")){
	out.println("Successfully login");
	%>
	<jsp:forward page="Home.jsp"></jsp:forward>
	<% 
}else {
	out.println("Failure try once again");
	%>
	<jsp:include page="login.jsp"></jsp:include>
	<%
}
%>
</body>
</html>