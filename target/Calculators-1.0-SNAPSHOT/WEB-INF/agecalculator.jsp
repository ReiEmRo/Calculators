<%-- 
    Document   : agecalculator
    Created on : Jan. 13, 2022, 10:29:53 p.m.
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
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter your age: </label>
            <input type="text" name="age" id="age"><br>
            <button type="submit">Age next birthday</button>
        </form>
        
        <p>${message}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
