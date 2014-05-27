<%--
  Created by IntelliJ IDEA.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="MealPackage.product.ProductDao" %>
<%@ page import="MealPackage.product.Product" %>
<html>
<head>
    <title></title>
</head>
<body>
<% ProductDao dao = new ProductDao(); %>
<table border=1>
    <% for (Product p: dao.products) { %>
        <tr>
            <td><b><%= p.getName()%></b></td>
            <td><%="Price" + p.getPrice()%></td>
        </tr>
    <% } %>

</body>
</html>
