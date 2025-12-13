<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fuel Registration</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url('');
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
        .form-container {
            background: rgba(255, 255, 255, 0.95);
            padding: 30px;
            border-radius: 15px;
            max-width: 600px;
            margin: 50px auto;
            box-shadow: 0 8px 16px rgba(0,0,0,0.3);
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Fuel Station</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" href="#">Home</a>
                <a class="nav-link" href="fuel.jsp">Fuel Form</a>
                <a class="nav-link" href="FuelSearch.jsp">Search</a>
            </div>
        </div>
    </div>
</nav>

<div class="form-container">
    <h2>Fuel Registration Form</h2>

    <form action="fuel" method="post">

        <div class="mb-3">
            <label for="name" class="form-label">Owner / Fuel Station Name:</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter station or owner name">
        </div>

        <div class="mb-3">
            <label for="location" class="form-label">Location:</label>
            <input type="text" class="form-control" id="location" name="location" placeholder="Enter location">
        </div>

        <div class="mb-3">
            <label for="barcode" class="form-label">Barcode:</label>
            <input type="text" class="form-control" id="barcode" name="barcode" placeholder="Enter barcode">
        </div>

        <div class="mb-3">
            <label for="fuelType" class="form-label">Fuel Type:</label>
            <select class="form-select" id="fuelType" name="fuelType">
                <option value="">Select</option>
                <option value="Petrol">Petrol</option>
                <option value="Diesel">Diesel</option>
                <option value="CNG">CNG</option>
                <option value="Electric">Electric</option>
                <option value="Hydrogen">Hydrogen</option>
            </select>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary btn-lg">Submit</button>
        </div>

    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- Validation JS -->
<script>
document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");

    form.addEventListener("submit", function (e) {
        let valid = true;

        // Remove previous errors
        document.querySelectorAll(".text-danger").forEach(el => el.remove());

        const name = document.getElementById("name").value.trim();
        const location = document.getElementById("location").value.trim();
        const barcode = document.getElementById("barcode").value.trim();
        const fuelType = document.getElementById("fuelType").value;

        if (name.length < 3) {
            showError("name", "Name must be at least 3 characters.");
            valid = false;
        }

        if (location.length < 3) {
            showError("location", "Location must be at least 3 characters.");
            valid = false;
        }

        if (!/^[A-Za-z0-9]{5,15}$/.test(barcode)) {
            showError("barcode", "Barcode must be 5–15 alphanumeric characters.");
            valid = false;
        }

        if (fuelType === "") {
            showError("fuelType", "Please select a fuel type.");
            valid = false;
        }

        if (!valid) e.preventDefault();
    });

    function showError(id, message) {
        const input = document.getElementById(id);
        const err = document.createElement("div");
        err.className = "text-danger small mt-1";
        err.innerText = message;
        input.parentNode.appendChild(err);
    }
});
</script>

</body>
</html>
