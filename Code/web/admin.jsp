<%@ page import="user.User" %>
<%@ page import="user.UserDAO" %>
<%--
  Created by IntelliJ IDEA.
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
    <td><a href="AdminServlet?action=delete&username=<%=user.getUsername()%>">Delete</a></td>
</tr>
<%} %>
</table>
<br>
<h3>Add new user: </h3>
<form method="POST" action="AdminServlet">
    <table>
        <td>
            Username:
            <input type="text" name="username_add"/>
        </td>
        <td>
            Password:
            <input type="text" name="pass_add"/>
        </td>
        <td>
            First name:
            <input type="text" name="firstname_add"/>
        </td>
        <td>
            Last name:
            <input type="text" name="lastname_add"/>
        </td>
        <td>
            <input  type="submit" value="ADD" />
        </td>
    </table>
</form>
</body>
</html>
