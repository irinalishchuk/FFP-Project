<%@ page import="user.User" %>
<%@ page import="MealPackage.product.ProductDao" %>
<%@ page import="java.util.ArrayList" %>
<%@page import="MealPackage.product.Product" %>
<%@ page import="MealPackage.dish.DishDao" %>
<%@ page import="MealPackage.dish.Dish" %>
<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 10.05.2014
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ZHRA4KA</title>
</head>
<body>

<% ProductDao productDao = new ProductDao(); %>
<% DishDao dishDao = new DishDao(); %>

<h1>ZHRA4KA</h1>
    <% User currentUser = (User)(session.getAttribute("currentSessionUser"));%>
    Welcome, <b><%= currentUser.getFirstName()%> <%=currentUser.getLastName()%></b>
<br>
<br>
<h2>PRODUCTS</h2>
<% if (ProductDao.products.size()!=0) { %>
<table>
<% for (Product product: productDao.getAllProducts()) { %>
    <tr>
        <td><b><%= product.getName()%></b></td>
        <td><%= product.getAmount() + product.getDimension()%></td>
        <td><%="$"+product.getPrice()%></td>
        <td><a href="ProductServlet?action=delete&product_name=<%=product.getName()%>">Delete</a></td>
    </tr>
<%} %>
<% } else { %>
    You have no products now :(
<% } %>
</table>
<h3>Add new product: </h3>
<form method="POST" action='ProductServlet'>
    <table>
        <td>
            Product name:
            <input type="text" name="product_name"/>
        </td>
        <td>
            Product amount:
            <input type="text" name="product_amount"/>
        </td>
        <td>
            Dimension (l, kg etc):
            <input type="text" name="product_dimension"/>
        </td>
        <td>
            Product price:
            <input type="text" name="product_price"/>
        </td>
        <td>
            <input  type="submit" value="ADD" />
        </td>
    </table>
</form>
<br>
<br>
<h2>DISHES</h2>
<% if (DishDao.dishes.size()!=0) { %>

<% for (Dish dish: dishDao.getAllDishes()) { %>
<td>
    <b><%= dish.getName()%></b>
</td>
<td>
    <b><%= "$" + dish.calculatePrice()%></b>
</td>
<td>
    <a href="DishServlet?action=delete&dish_name=<%=dish.getName()%>">Delete</a><br>
</td>
<%} %>

<% } else { %>
You have no dishes now :(
<% } %>
<h3>Add new dish: </h3>
<form method="POST" action='DishServlet'>
<table>
        <td>
            Products (separated by comma) :
            <input type="text" name="products_to_dish"/>
        </td>
        <td>
            Dish name :
            <input type="text" name="new_dish_name"/>
        </td>
        <td>
            <input  type="submit" value="ADD" />
        </td>
</table>
</form>
</body>
</html>
