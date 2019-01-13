<%-- 
    Document   : beerSelect
    Created on : 13-jan-2019, 13:36:56
    Author     : ief
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BeerSelect</title>
    </head>
    <body>
        <h1>Beer selection advice</h1>
        <p>Got beer color ${beerColor}</p>
        try:
        <c:forEach items="${adviezen}" var="advies" >
            <p>${advies}</p>
        </c:forEach>
        
    </body>
</html>
