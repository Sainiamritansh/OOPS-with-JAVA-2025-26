<!DOCTYPE html>
<html>
<head>
    <title>Search Patient</title>
    <style>
        body { font-family: Arial; text-align: center; padding: 50px; background: #f0f8ff; }
        input { padding: 8px; margin: 5px; width: 250px; }
        button { padding: 10px 30px; background: #e67e22; color: white;
            border: none; border-radius: 5px; cursor: pointer; }
    </style>
</head>
<body>
<h2>Search Patient</h2>
<form action="searchPatient" method="post">
    <input type="number" name="id" placeholder="Enter Patient ID" required><br><br>
    <button type="submit">Search</button>
</form>
<br><a href="index.jsp">Back to Home</a>
</body>
</html>