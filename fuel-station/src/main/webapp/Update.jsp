<!DOCTYPE html>
<html>
<head>
    <title>Fuel Entry Registration</title>
    <script src="js/validation.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Fuel Station</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="register.jsp">Register Fuel Entry</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5" style="max-width: 500px;">
    <h2 class="mb-4 text-center">Update Fuel Station</h2>

    <form action="fuel" method="post" onsubmit="return validateForm()" class="border p-4 rounded shadow-sm bg-light">

        <div class="mb-3">
            <label class="form-label">Station Name</label>
            <input type="text" id="station" name="station" class="form-control" value="${editDTO.station}">
            <div class="invalid-feedback">Station name is required</div>
        </div>

        <div class="mb-3">
            <label class="form-label">Fuel Type</label>
            <select id="type" name="type" class="form-select" value="${editDTO.type}">
                <option value="">Select Fuel Type</option>
                <option value="Petrol">Petrol</option>
                <option value="Diesel">Diesel</option>
                <option value="CNG">CNG</option>
                <option value="Electric">Electric</option>
            </select>
            <div class="invalid-feedback">Fuel type is required</div>
        </div>

        <div class="mb-3">
            <label class="form-label">Quantity (Liters)</label>
            <input type="number" id="quantity" name="quantity" class="form-control" value="${editDTO.quantity}">
            <div class="invalid-feedback">Quantity must be greater than 0</div>
        </div>

        <div class="mb-3">
            <label class="form-label">Price </label>
            <input type="number" id="price" name="price" class="form-control" value="${editDTO.price}">
            <div class="invalid-feedback">Price must be greater than 0</div>
        </div>
        <div class="mb-3">
                    <label class="form-label">Barcode</label>
                    <input type="text" id="bar" name="bar" class="form-control" value="${editDTO.bar}">
                    <div class="invalid-feedback">Barcode is required</div>
        </div>

        <button type="submit" class="btn btn-primary w-100">Register</button>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
