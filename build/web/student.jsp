<%-- 
    Document   : student
    Created on : May 20, 2023, 11:11:41 PM
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
        <form action="NewServlet" method="POST">
            <input type="text" name="search"/>

            <input type="submit" value="Search"/>
        </form>





         <c:if test="${not empty list}" >
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Class Name</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${list}" var="student">
                        <tr>
                            <td>${student.id}</td>
                            <td>${student.name}</td>
                            <td>${student.description}</td>
                            <td>${student.classes.name}</td>
                        </tr>

                    </c:forEach>

                </tbody>


            </table>
        </c:if>

        <c:if test="${not empty error}">
            NOT FOUND
        </c:if>


    </body>
</html>
