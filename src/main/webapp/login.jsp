<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Bid Entry</title>
</head>
<body>

<h2>Enter Team Email to Start Bidding</h2>

<form action="enterBid" method="post">
    <label>Email:</label>
    <input type="email" name="email" required>
    <br><br>
    <button type="submit">Enter</button>
</form>

<!-- If error exists, show alert -->
<c:if test="${not empty error}">
    <script>
        alert("${error}");
    </script>
</c:if>

</body>
</html>
