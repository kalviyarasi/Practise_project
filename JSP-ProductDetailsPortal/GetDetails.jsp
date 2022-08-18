<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Product Details </h3>
<table border=1 cellspacing=0 cellpadding=10>
  <tr> 
    <th>Product Name</th>
    <th>Product Price</th>
    <th>Product Quantity</th>
  </tr>
  
  <tr>
  	 <td><%=request.getParameter("name") %></td>
  	 <td><%=request.getParameter("price") %></td>
  	 <td><%=request.getParameter("quantity") %></td>
  </tr>
</table>
</body>
</html>