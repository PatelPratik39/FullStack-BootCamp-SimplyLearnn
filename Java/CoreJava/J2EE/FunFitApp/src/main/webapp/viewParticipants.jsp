<%@ page import="java.util.List" %>
<%@ page import="com.bean.Participant" %>

<html>
<head>
    <title>View Participants</title>
</head>
<body>
    <h1>Participants</h1>
    <table border="1">
        <tr>
            <th>Participant ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Batch ID</th>
            <th>Action</th>
        </tr>
        <%
            List<Participant> participants = (List<Participant>) request.getAttribute("participants");
            for (Participant participant : participants) {
        %>
        <tr>
            <td><%= participant.getParticipantID() %></td>
            <td><%= participant.getFirstName() %></td>
            <td><%= participant.getLastName() %></td>
            <td><%= participant.getEmail() %></td>
            <td><%= participant.getBatchID() %></td>
            <td><a href="deleteParticipant?participantId=<%= participant.getParticipantID() %>">Delete</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
