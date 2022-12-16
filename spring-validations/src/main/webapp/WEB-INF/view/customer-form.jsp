<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ngolla
  Date: 2022-12-02
  Time: 9:58 a.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer From</title>
</head>
<body>
<h3>Welcome to Customer Form Page</h3>
Please enter your details. <br><br>

<form:form action="procesform" method="get" modelAttribute="theCustomer">
    First Name: <form:input path="firstName"/><br><br>
    Last Name: <form:input path="lastName"/><br><br>

    <input type="submit"/>
</form:form>

</body>
</html>
