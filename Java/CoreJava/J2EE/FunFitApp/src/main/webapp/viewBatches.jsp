<%@page import="java.util.List"%>
<%@ page import = "com.bean.Batch" %>
<%@ page import = "com.bean.TimeSlot" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Batches</title>
</head>
<body>
    <h1>Batches</h1>
    <table border="1">
        <tr>
            <th>Batch ID</th>
            <th>Batch Name</th>
            <th>Time Slot</th>
            <th>Action</th>
        </tr>
        <%
            List<Batch> batches = (List<Batch>) request.getAttribute("batches");
            for (Batch batch : batches) {
        %>
        <tr>
            <td><%= batch.getBatchId() %></td>
            <td><%= batch.getBatchName() %></td>
            <td><%= batch.getTimeSlot() %></td>
            <td><a href="deleteBatch?batchId=<%= batch.getBatchId() %>">Delete</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>