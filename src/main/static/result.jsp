<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Fuel Result</title>
</head>
<body>

 <h1 style="color:green">${successMessage}</h1>
  <h1 style="color:red">${errorMessage}</h1>

<p><strong>Name:</strong> ${name}</p>
<p><strong>Location:</strong> ${location}</p>
<p><strong>Barcode:</strong> ${barcode}</p>
<p><strong>Fuel Type:</strong> ${fuelType}</p>
<br><br>
<a href="Register.jsp">Back to Form</a>
</body>
</html>
