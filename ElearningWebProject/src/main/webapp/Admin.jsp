<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body style="background-color:#5BADDF;" font-family: sans-serif;>
<center>
<h1>Admin Login Page</h1>
<hr size="8" width="90%" color="#2d566f">

<form action="<%=request.getContextPath() %>/Insert"method="post">
Admin Id:<input type="number" name="admin_id"><br>
<br>
Name:<input type="text" name="name"><br>
<br>
Email:<input type="email" name="email"><br>
<br>
Password:<input type="password" name="password"><br>
<br>


<input type="Submit" value="submit">
</form>
<hr size="8" width="90%" color="#2d566f">

</center>

</body>
</html>
