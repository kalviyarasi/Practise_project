<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2">
<tr>
<th>User Id</th>
<th>User Name</th>  
<th>Password</th>
<th>Email</th>
<th>Phone no</th>
<th>Country</th>

</tr>
<c:forEach var="user" items="${userList}">
<tr>
  
<td>${user.user_id}</td>
<td>${user.user_name}</td>
<td>${user.password}</td>
<td>${user.email}</td>
<td>${user.phone_no}</td>
<td>${user.country}</td>
<td><a href="editemp/${user.user_id}">Edit</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>