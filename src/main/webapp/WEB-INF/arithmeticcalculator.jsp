<%-- 
    Document   : arethmeticCalculator
    Created on : Jan. 17, 2022, 10:17:06 a.m.
    Author     : ReiEm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post">
            <div>
            <label for="first">First: </label>
            <input type="text" name="first" id="first" value="${first}">
            </div>
            <div>
            <label for="second">Second: </label>
            <input type="text" name="second" id="second" value="${second}">
            </div>
            <input type="submit" value="+" name="btn">
            <input type="submit" value="-" name="btn">
            <input type="submit" value="*" name="btn">
            <input type="submit" value="%" name="btn">
        </form>
        
        <p>Result: ${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
