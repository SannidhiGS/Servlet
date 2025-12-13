<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fish Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
<div class="container mt-5 p-4 border rounded shadow">
    <h3 class="text-center mb-4">Search By Barcode</h3>
    <form action="fuel" method="get">
        <div class="mb-3">
            <label class="form-label">Enter Barcode:</label>
            <input type="text" class="form-control" name="barcode">

        </div>
        <button type="submit" name="submit" value="search" class="btn btn-primary">Search</button>
        <button type="submit" name="submit" value="clear" class="btn btn-secondary">Clear</button>
    </form>
    <hr>
    <span style="color:red;">${message}</span>
    <c:if test="${dto != null}">
        <h5>Search Result:</h5>
        Name: ${dto.name}<br>
        Location: ${dto.location}<br>
        Fuel Type: ${dto.fuelType}<br>
        <a href="edit?mobileNo=${dto.phone}" class="btn btn-warning btn-sm mt-2">Edit</a>
    </c:if>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
