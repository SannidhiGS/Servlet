<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fuel Station Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url(''); /* Replace with your image */
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
    <div class="form-container">
        <h2>Fuel Registration </h2>
        <form action="fuel" method="get">
            <div class="mb-3">
                <label for="bar" class="form-label">Barcode:</label>
                <input type="text" class="form-control" name="bar" id="bar" placeholder="Enter a Barcode">
            </div>
            <div class="container">
             <div class="row">
              <div class="col">
                <input type="submit" value="Submit" name="submit" class="btn btn-primary btn-lg"/>
                </div>
                 <div class="col">
                 <input type="submit" value="Clear" name="submit" class="btn btn-primary btn-lg"/>
                 </div>
                 </div>
            </div>
            <c:if test="${dto !=null}">
            Result : ${dto} <a href="edit?bar=${dto.bar}">Edit</a>
            </br> Station: ${dto.station}
            </c:if>
             <span style="color:red;">${message}</span>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
