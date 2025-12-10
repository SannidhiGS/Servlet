<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Fuel Booking Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Fuel Station</a>
    </div>
</nav>

<div class="container mt-5" style="max-width: 600px;">
    <div class="card shadow">
        <div class="card-header bg-primary text-white text-center">
            <div class="card-header bg-primary text-white">
                      <h1 style="color:green">${successMessage}</h1>
                      <h1 style="color:red">${failureMessage}</h1>
            </div>
        </div>

        <div class="card-body fs-5">

            <p><strong>Station:</strong> ${station}</p>
            <p><strong>Fuel Type:</strong> ${type}</p>
            <p><strong>Quantity:</strong> ${quantity} Liters</p>
            <p><strong>Price:</strong> ₹${price}</p>
            <p><strong>Barcode:</strong> ${bar}</p>

        </div>

        <div class="card-footer text-center">
            <a href="register.jsp" class="btn btn-secondary">Back to Register</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
