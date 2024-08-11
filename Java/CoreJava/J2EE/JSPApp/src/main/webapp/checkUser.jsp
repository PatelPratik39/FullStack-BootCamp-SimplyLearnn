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
if(emailid.equals("akash@gmail.com") && password.equals("123")){
	out.println("Successfully login");
}else {
	out.println("Failure try once again");
}
%>

</body>
</html>