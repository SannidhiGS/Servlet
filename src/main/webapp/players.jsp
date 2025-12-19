<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Available Players for Bidding</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin: 20px auto; }
        th, td { border: 1px solid #000; padding: 8px; text-align: center; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>

<h2 style="text-align:center;">Available Players for Bidding</h2>

<c:if test="${empty players}">
    <p style="text-align:center; color:red;">No players available.</p>
</c:if>

<c:if test="${not empty players}">
    <table>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Player Type</th>
            <th>State</th>
            <th>Batting Avg</th>
            <th>Bowling Avg</th>
            <th>No Of Stumps</th>
        </tr>

        <c:forEach items="${players}" var="p">
            <tr>
                <td>${p.name}</td>
                <td>${p.age}</td>
                <td>${p.playerType}</td>
                <td>${p.state}</td>
                <td>${p.battingAvg}</td>
                <td>${p.bowlingAvg}</td>
                <td>${p.numOfStumps}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
