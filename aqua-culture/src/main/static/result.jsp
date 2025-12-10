<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fish Farm Result</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
            body {
                background-image: url('img.png'); /* Replace with your image */
                background-size: cover;
                background-repeat: no-repeat;
                background-attachment: fixed;
            }
            </style>
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary"  data-bs-theme="dark">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.jsp">Mastya</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <a class="nav-link active" aria-current="index.jsp" href="#">Home</a>
              <a class="nav-link" href="fish.jsp">Aqua-Form</a>
              <a class="nav-link" href="cookie">Cookie</a>
              <a class="nav-link" href="FishSearch.jsp">Search</a>
              <a class="nav-link" href="FishSearch2.jsp">Search By Location</a>

            </div>
          </div>
        </div>
    </nav>
<div class="container my-5">
    <div class="card shadow-lg">
        <div class="card-header bg-primary text-white">
           <h1 style="color:green">${successMessage}</h1>
           <h1 style="color:red">${errorMessage}</h1>
        </div>
        <div class="card-body">
            <p class="card-text"><strong>Owner:</strong> ${owner}</p>
            <p class="card-text"><strong>Fish Type:</strong> ${fishType}</p>
            <p class="card-text"><strong>Pond Size (sq.m):</strong> ${pondSize}</p>
            <p class="card-text"><strong>Quantity:</strong> ${quantity}</p>
            <p class="card-text"><strong>Location:</strong> ${location}</p>
            <p class="card-text"><strong>Phone:</strong> ${phone}</p>
        </div>
        <div class="card-footer text-end">
            <a href="index.jsp" class="btn btn-success">Back to Home</a>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
