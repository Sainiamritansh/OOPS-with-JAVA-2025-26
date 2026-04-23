<%@ page import="com.hospital.Patient" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Result</title>
    <style>
        body { font-family: Arial; text-align: center; padding: 50px; background: #f0f8ff; }
        .card { background: white; padding: 30px; margin: auto; width: 400px;
            border-radius: 10px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
    </style>
</head>
<body>
<% Patient p = (Patient) request.getAttribute("patient"); %>
<div class="card">
    <% if (p != null) { %>
    <h2>Patient Found</h2>
    <td><%= p.getPatientId() %></td>
    <td><%= p.getPatientName() %></td>
    <p><b>Age:</b> <%= p.getAge() %></p>
    <p><b>Disease:</b> <%= p.getDisease() %></p>
    <% } else { %>
    <h2>Patient Not Found!</h2>
    <% } %>
</div>
<br><a href="index.jsp">Back to Home</a>
</body>
</html>