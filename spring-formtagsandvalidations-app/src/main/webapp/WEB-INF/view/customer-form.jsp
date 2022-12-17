<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nikhiljosh
  Date: 2022-12-17
  Time: 12:53 p.m.
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
Please enter your details below.
<br><br>
<form:form action="processform" method="get" modelAttribute="theCustomer">
  First Name: <form:input path="firstName"/><br><br>
  Last Name: <form:input path="lastName"/>
             <form:errors cssClass="error" path="lastName"/> <br><br>
    Country: <form:select path="country">

                <form:option value="United States of America" label="United States"/>
                <form:option value="Japan" label="Japan"/>
                <form:option value="South Korea" label="South Korea"/>
                <form:option value="United Kingdom" label="United Kingdom"/>

             </form:select><br><br>
    Postal Code: <form:input path="postalCode"/>
                 <form:errors path="postalCode" cssClass="error"/>
    <br><br>
    Free Passes: <form:input path="freePasses"/>
                 <form:errors cssClass="error" path="freePasses"/>
    <br><br>
    Course Code: <form:input path="courseCode"/>
                 <form:errors path="courseCode" cssClass="error"/>
    <br><br>
    Languages: <form:radiobuttons path="language" items="${theCustomer.listOfLanguages}"/>
    <br><br>
    Favourite Foods :
               <form:checkbox path="favouriteFoods" value="Pizza" label="Pizza"/>
               <form:checkbox path="favouriteFoods" value="Pasta" label="Pasta"/>
               <form:checkbox path="favouriteFoods" value="Noodles" label="Noodles"/>
               <form:checkbox path="favouriteFoods" value="Burger" label="Burger"/>
               <form:checkbox path="favouriteFoods" value="Toast" label="Toast"/>
    <br><br>
  <input type="submit"/>
</form:form>

</body>
</html>
