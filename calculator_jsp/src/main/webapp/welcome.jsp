<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ADB1A9">
<form method="GET" action="new.jsp">
<centre><h1>Login form</h1></centre>
  First Name	: <input type="text" id="firstName" placeholder="username" 
   value='<%=request.getParameter("firstName")%>'/><br> 
    Password	: <input type="password" id="firstName" placeholder="password" 
   value='<%=request.getParameter("password")%>' />
    
  <input type="submit" value="submit" />
  
 </form>
 

</body>
</html>