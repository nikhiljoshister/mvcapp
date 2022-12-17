<%--
  Created by IntelliJ IDEA.
  User: nikhiljosh
  Date: 2022-12-15
  Time: 4:55 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Landing</title>
</head>
<body>
<h3>Welcome Customer: ${theCustomer.firstName} ${theCustomer.lastName}</h3>
<br><br>
Country : ${theCustomer.country}<br><br>

Postal Code: ${theCustomer.postalCode}
<br><br>
Language: ${theCustomer.languages}
<br><br>
Favorite Foods; ${theCustomer.favouriteFoods}
<br><br>
Passes Acquired: ${theCustomer.freepasses}
<br><br>
Course Code: ${theCustomer.courseCode}
</body>
</html>
