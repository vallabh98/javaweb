<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Form</title>
</head>
<body style="background-color:#c7cfc3;" font-family: sans-serif;>
<center>
<h1>Contact Form</h1>
<hr size="8" width="90%" color="#AE9152">

<form action="<%=request.getContextPath() %>/ContactServelet"method="post">
User Id:<input type="number" name="u_id"><br>
<br>
Name:<input type="text" name="name"><br>
<br>
Email:<input type="email" name="email"><br>
<br>
Phone:<input type="number" name="phone"><br>
<br>
Message:<input type="text" name="message"><br>
<br>
Contact Id:<input type="number" name="cu_id"><br>
<br>

<input type="Submit" value="submit">
<hr size="8" width="90%" color="#AE9152">

</center>

</body>
</html>


































<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}

input[type=submit] {
  background-color: #04AA6D;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>

<h3>Contact Form</h3>

<div class="container">
  <form action="/action_page.php">
    
     <label for="fname">User ID</label>
    <input type="text" id="fname" name="firstname" placeholder="Your User Id">
    
    
    <label for="fname">Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">
    
    

    <label for="lname">Email</label>
    <input type="text" id="lname" name="lastname" placeholder="Your Email address..">

   <label for="lname">Phone</label>
    <input type="text" id="" name="lastname" placeholder="Your Contact Number..">

    
    <label for="subject">Message</label>
    <textarea id="subject" name="subject" placeholder="Write Your Messsage Here.." style="height:200px"></textarea>

    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>

 --%>