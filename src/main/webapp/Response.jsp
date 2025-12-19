<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bid Status</title>
</head>
<body>

<h2>Bid Submission Result</h2>

<!-- Success Message -->
<c:if test="${not empty message}">
    <div style="color: green; font-weight: bold;">
        ${message}
    </div>
</c:if>

<!-- Error Message -->
<c:if test="${not empty errorMessage}">
    <div style="color: red; font-weight: bold;">
        ${errorMessage}
    </div>
</c:if>

</body>
</html>














