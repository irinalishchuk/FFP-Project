<%@ page import="AppLogic.user.User" %>
<%@ page import="MealPackage.Dish" %>
<%@ page import="MealPackage.Product" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ZHRA4KA</title>
</head>
<body>
<h1>ZHRA4KA</h1>
    <% User currentUser = (User)(session.getAttribute("currentSessionUser"));%>
    Welcome, <b><%= currentUser.getName()%></b>
<br>
<br>
DISHES
<table>
<% for (Dish dish: currentUser.getDishes()) { %>
    <tr>
        <td><b><%= dish.getName()%></b></td>
        <td><%="Price: " + dish.calculatePrice()%></td>
    </tr>
<%} %>
</table>
<br>
PRODUCTS
<table>
<% for (Product product: currentUser.getProducts()) { %>
    <tr>
        <td><b><%= product.getName()%></b></td>
        <td><%= product.getAmount()%></td>
        <td><%=product.getDimension()%></td>
    </tr>
<%} %>
</table>
<br>
<br>
<form>
        Test:
        <input type="text" name="product"/><br>
        <input type="submit" value="submit">
</form>
</body>
</html>
