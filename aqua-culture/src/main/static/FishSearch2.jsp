<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hatchery Registration</title>
    <!-- Bootstrap CSS -->
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
    <div class="form-container">
        <h2>Aqua Marine Search By Location</h2>
        <form action="location" method="get">
            <div class="mb-3">
                <label for="location" class="form-label">Location:</label>
                <input type="text" class="form-control" name="location" id="location" placeholder="Enter Location">
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

<table class="table table-striped table-hover">
    <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Owner</th>
            <th scope="col">Fish Type</th>
            <th scope="col">Edit</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${fishList}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.owner}</td>
                <td>${item.fishType}</td>
                <td>
                    <a href="edit?mobileNo=${item.phone}" class="btn btn-sm btn-primary">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

