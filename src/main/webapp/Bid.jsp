<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Place Bid</title>
</head>
<body>

<h2>Place Your Bid</h2>

<form action="placeBid" method="post">

    <label>Player Name:</label>
    <input type="text" name="playerName"
           value="${param.playerName}" readonly>
    <br><br>

    <label>Team Email:</label>
    <input type="email" name="teamEmail" required>
    <br><br>

    <label>Bid Amount:</label>
    <input type="number" name="bidAmount" required>
    <br><br>

    <button type="submit">Submit Bid</button>
</form>

</body>
</html>
