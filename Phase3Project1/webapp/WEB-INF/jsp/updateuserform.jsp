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
<h1> Edit User Information </h1>
<form:form method="post" action="../editsave" modelAttribute="user">

User id: <form:hidden path="user_id"/> <br><br>
User name: <form:input path="user_name" /> <br><br>
Password: <form:input path="password" /> <br><br>
Email: <form:input path="email" /> <br><br>
Phone number: <form:input path="phone_no" /> <br><br>
Country: <form:input path="country" /> <br><br>
<input type="submit" value="Save changes">
</form:form>
</body>
</html>