<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Car List</title>
</head>
<body>
    <h2>Available Cars:</h2>
    <ul>
        <c:forEach var="car" items="${carList}">
            <li>${car}</li>
        </c:forEach>
    </ul>
</body>
</html>
