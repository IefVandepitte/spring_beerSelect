<%-- 
    Document   : test
    Created on : 13-jan-2019, 11:05:13
    Author     : ief
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beer Selection Page</title>
    </head>
    <body>
        <h1>Beer Selection Page</h1>
               
        <form:form commandName="color" method="POST">
            <form:label path="value">Select beer characteristics Color:</form:label>
            <form:select path="value" name="color">
                <c:forEach items="${colors}" var="item">
                     <form:option value="${item}">${item}</form:option>
                </c:forEach>            
            </form:select>
            <br><br>
            <input type="SUBMIT" value="Submit"/> &nbsp;
            <input type="RESET" value="Cancel"/>
        </form:form>
       
    </body>
</html>
