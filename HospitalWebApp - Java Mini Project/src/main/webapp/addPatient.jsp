<!DOCTYPE html>
<html>
<head>
    <title>Add Patient</title>
    <style>
        body { font-family: Arial; text-align: center; padding: 50px; background: #f0f8ff; }
        input { padding: 8px; margin: 5px; width: 250px; }
        button { padding: 10px 30px; background: #27ae60; color: white;
            border: none; border-radius: 5px; cursor: pointer; }
    </style>
</head>
<body>
<h2>Add New Patient</h2>
<form action="addPatient" method="post">
    <input type="number" name="id" placeholder="Patient ID" required><br>
    <input type="text" name="name" placeholder="Name" required><br>
    <input type="number" name="age" placeholder="Age" required><br>
    <input type="text" name="disease" placeholder="Disease" required><br><br>
    <button type="submit">Add Patient</button>
</form>
<br><a href="index.jsp">Back to Home</a>
</body>
</html>