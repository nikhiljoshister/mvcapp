<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Customer Form</title>
    <style>
        .error{color: red}
    </style>
</head>
<body>
    <h3>Welcome to Customer Form Page!</h3>
Please fill below details.<br><br>

<form:form action="processform" method="get" modelAttribute="theCustomer">
    First Name: <form:input path="firstName"/><br><br>
    Last Name(*): <form:input path="lastName"/>
                  <form:errors path="lastName" cssClass="error"/><br><br>
    Country: <form:select itemLabel="Choose your country" path="country" >
                <form:options items="${theCustomer.countryList}"/>
             </form:select>
    <br><br>
    Postal Code: <form:input path="postalCode"/>
                 <form:errors cssClass="error" path="postalCode"/>
    <br><br>
    Course Code: <form:input path="courseCode"/>
    <form:errors cssClass="error" path="courseCode"/>
    <br><br>
    Free Passes: <form:input path="freepasses"/>
                 <form:errors path="freepasses" cssClass="error"/>
    <br><br>
    Choose Your Language:<br>
    <form:radiobuttons path="languages" items="${theCustomer.listOfLanguages}"/>
    <br><br>
    Favorite Foods:<br><br>
    <form:checkbox path="favouriteFoods" value="Burger"/> Burger
    <form:checkbox path="favouriteFoods" value="Pizza"/> Pizza
    <form:checkbox path="favouriteFoods" value="Salad"/> Salad
    <br><br>
    <input type="submit"/>
</form:form>
</body>
</html>
