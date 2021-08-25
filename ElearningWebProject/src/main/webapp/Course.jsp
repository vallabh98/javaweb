<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Page</title>
</head>
<body style="background-color:#e5c437;" font-family: sans-serif;>
<center>
<h1>Course Form</h1>
<hr size="8" width="90%" color="#665718">

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
<hr size="8" width="90%" color="#665718">

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

<h3>CourseForm</h3>

<div class="container">
  <form action="/action_page.php">
     
    <label for="fname">Course Id</label>
    <input type="text" id="fname" name="firstname" placeholder="Enter Course Id..">
    
    

    
     <label for="fname">Course Name</label>
    <input type="text" id="fname" name="firstname" placeholder="Enter Course Name">
    
    <label for="subject">Course Description</label>
    <textarea id="subject" name="subject" placeholder="Write Your Feedback Here.." style="height:200px"></textarea>
    
    <form action="/action_page.php">
  <input type="file" id="myFile" name="filename">
  <input type="Submit">
</form>

   
    <label for="lname">Course Fees</label>
   <input type="text" id="fname" name="firstname" placeholder="Enter Course Fee">
    
    
    
    <input type="submit" value="Submit">
  </form>
</div>

</body>
</html>
 --%>