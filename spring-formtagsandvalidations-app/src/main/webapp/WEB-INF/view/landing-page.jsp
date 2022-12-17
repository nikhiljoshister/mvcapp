<%--
  Created by IntelliJ IDEA.
  User: nikhiljosh
  Date: 2022-12-17
  Time: 12:57 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Landing Page</title>
</head>
<body>
<h3>Welcome Customer: ${theCustomer.firstName} ${theCustomer.lastName}</h3>

Country: ${theCustomer.country} <br><br>
Favourite Foods: ${theCustomer.favouriteFoods} <br><br>
Language Choosen : ${theCustomer.language}<br><br>
Free Passes: ${theCustomer.freePasses}<br><br>
Course Code: ${theCustomer.courseCode}
</body>
</html>
