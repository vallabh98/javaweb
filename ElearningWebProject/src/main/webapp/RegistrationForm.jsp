 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Now</title>
</head>
</head>
<body style="background-color:#c7cfc3;" font-family: sans-serif;>
<center>
<h1 style="color:#4f524e;"> Registration Form</h1>
<hr size="8" width="90%" color="#AE9152">
<form action="<%=request.getContextPath() %>/UserRegistration"method="post">
User Id:<input type="number" name="user_id"><br>
<br>
Name:<input type="text" name="username"><br>
<br>
Phone:<input type="number" name="phone"><br>
<br>
Email:<input type="email" name="email"><br>
<br>
Address:<input type="text" name="address"><br>
<br>
Registration Date:<input type="text" name="reg"><br>
<br>
Password:<input type="password" name="password"><br>
<br>
Upload_photo:<input type="file" name="photo"><br>
<br>

<input type="Submit" value="Register">
<hr size="8" width="90%" color="#AE9152">

</center>
</body>
</html>








 <%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>registration</title>
    <link rel="stylesheet" href="\assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="\assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="\assets/css/styles.css">
</head>

<body>
    <section class="register-photo">
        <div class="form-container">
            <form method="post">
                <h2 class="text-center"><strong>Registration Form</strong></h2>



                <div class="mb-3"><input class="form-control" type="text" name="user id" placeholder="user id"></div>
                <div class="mb-3"><input class="form-control" type="name" name="Name" placeholder="Name"></div>

                <div class="mb-3"><input class="form-control" type="Phone" name="Phone" placeholder="Phone"></div>


                <div class="mb-3"><input class="form-control" type="email" name="email" placeholder="Email"></div>
                <div class="mb-3"><input class="form-control" type="address" name="address" placeholder="address"></div>
                <div class="mb-3"><input class="form-control" type="Date" name="Date" placeholder="Registration Date"></div>



                <div class="mb-3"><input class="form-control" type="password" name="password" placeholder="Password"></div>
                <div class="mb-3">

                  <input type="file" name="photo">

                <div class="mb-3"><button class="btn btn-primary d-block w-100" type="submit">register</button></div><a class="already" href="#"></a>
            </form>
        </div>
    </section>
    <script src="\assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>
 --%>
















































l>
 --%> --%> --%>