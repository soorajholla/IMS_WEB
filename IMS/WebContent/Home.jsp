<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: -8px;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #4CAF50;
}

.WelcomeHeading {
	background-color:darkcyan;
	font-weight:bolder;
	color:black;
}
</style>
</head>
<body>

<ul>
  	   <li class="WelcomeHeading"> <a href="#">Inventory Management System</a></li>
  	   <li> <a href="Home.jsp">Home</a></li>
	   <li> <a href="#showinventory">Show</a></li>
	   <li><a href="#search">Search</a></li>
	   <li><a href="#update">Update</a></li>
	   <li><a href="#email">Email</a></li>
	   <li><a href="login.jsp">Logout</a></li>
</ul>

<center><h1 style="margin-top: 9pc;font-size: 5em;"> WELCOME</h1></center>

</body>
</html>
