<%-- 
    Document   : insertStudent
    Created on : May 25, 2023, 12:11:11 PM
    Author     : USER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="insert" method="POST"> 
            <p>Name <input type="text" name="name"/></p>
            <p>Description <input type="text" name="description"/></p>
            <p>
                Classes:
                <select name="classes">
                    <c:forEach items="${listClasses}" var="classes" >
                        <option value="${classes.id}">${classes.name}</option>
                    </c:forEach>


                </select>
                
            </p>
            
            <input type="submit" value="submit"/>

        </form>
    </body>
</html>
