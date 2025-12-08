<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cattle Farm Management</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

    <div class="container mt-5">
        <div class="card shadow-sm p-4">
            <h1 class="text-success text-center mb-4">Your Data Saved Successfully</h1>

            <div class="mb-2"><strong>Owner:</strong> ${owner}</div>
            <div class="mb-2"><strong>Type:</strong> ${type}</div>
            <div class="mb-2"><strong>Age:</strong> ${age}</div>
            <div class="mb-2"><strong>Weight:</strong> ${weight}</div>
            <div class="mb-2"><strong>Location:</strong> ${location}</div>
            <div class="mb-2"><strong>Phone:</strong> ${phone}</div>

            <div class="text-center mt-4">
                <a href="Register.jsp" class="btn btn-primary">Register Another</a>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
