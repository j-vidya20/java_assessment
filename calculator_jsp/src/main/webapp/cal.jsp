<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>calculator</title>
  <style type="text/css">
 .a{ width:5em; height:3em; }
 </style>
</head>
<body>
<h2>Calculator</h2><br>


	  <form action="servadd" method="post">

<input type="text" name="num1" placeholder="Enter First Number" /><br>
<input type="radio" name="btn" value="+"  /><label for="add">+</label><br>

<input type="radio" name="btn" value="-"  /><label for="sub">-</label><br>

<input type="radio" name="btn" value="*"  /><label for="mul">*</label><br>

<input type="radio" name="btn" value="/"  /><label for="div">/</label><br>

<input type="text" name="num2" placeholder="Enter Second Number" />


</form>

  

</body>
    
</body> 
</html>
 