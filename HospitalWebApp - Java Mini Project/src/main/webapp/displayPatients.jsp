<%@ page import="java.util.*, com.hospital.Patient" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Patients</title>
    <style>
        body { font-family: Arial; padding: 30px; background: #f0f8ff; }
        table { margin: auto; border-collapse: collapse; background: white; }
        th, td { padding: 12px 20px; border: 1px solid #ddd; }
        th { background: #3498db; color: white; }
    </style>
</head>
<body>
<h2 style="text-align:center;">All Patients</h2>
<table>
    <tr>
        <th>ID</th><th>Name</th><th>Age</th><th>Disease</th>
    </tr>
    <%
        List<Patient> patients = (List<Patient>) request.getAttribute("patients");
        if (patients != null) {
            for (Patient p : patients) {
    %>
    <tr>
        <td><%= p.getPatientId() %></td>
        <td><%= p.getPatientName() %></td>
        <td><%= p.getAge() %></td>
        <td><%= p.getDisease() %></td>
    </tr>
    <%   }
    }
    %>
</table>
<p style="text-align:center;"><a href="index.jsp">Back to Home</a></p>
</body>
</html>