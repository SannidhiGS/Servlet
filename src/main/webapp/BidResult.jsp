<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bid Result</title>
</head>
<body>
    <h2 style="text-align:center;">Bid Result</h2>

    <c:if test="${not empty bidResult}">
        <p style="text-align:center; font-weight:bold; color:blue;">
            ${bidResult}
        </p>
    </c:if>

    <div style="text-align:center; margin-top:20px;">
        <a href="enterBid">Back to Player List</a>

    </div>
</body>
</html>
