<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow">

<h1>This is my first JSP.</h1>

<h2>JSP is dynamic compilation, Just refresh the browser.</h2>

<%
int a=10;
int b=20;
int c=a+b;
out.print("Result : " +c+"<br>");

for(int i=0; i<=5; i++)
{
	out.print("Value of "+(i+1)+"-"+i+"<br>");
}
%>

<form action="Login.jsp">
<input type="text" name= "u" placeholder="username">
<input type="text" name= "p" placeholder="password">
<input type="submit" value="LOGIN">


</form>



</body>
</html>