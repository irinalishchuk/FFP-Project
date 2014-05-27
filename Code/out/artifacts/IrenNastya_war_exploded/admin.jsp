<%@ page import="user.User" %>
<%@ page import="user.UserDAO" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 12.05.2014
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<% UserDAO userDao = new UserDAO(); %>
Admin page
<br>
Users list
<table>
<% for (User user: userDao.getAllUsers()) { %>
<tr>
    <td><b><%= user.getUsername()%></b></td>
    <td><%= user.getFirstName() + " " + user.getLastName()%></td>
    <td><%="pass: " + user.getPassword()%></td>
    <!-- <td><a href="AdminServlet?action=delete&username=<%=user.getUsername()%>">Delete</a></td> -->
</tr>
<%} %>
</table>
</body>
</html>
