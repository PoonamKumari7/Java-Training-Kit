<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink">


<%!
int a=10;
int b;

int add(int a, int b)
{
	return a+b;
}
%>

<%
String username = request.getParameter("u");
String password = request.getParameter("p");

out.print("Username : "+username);
out.print("<br>Password : "+password);

out.print("<br>Value of a =" +a);
out.print("<br>Result : " +add(2,4));
%>

<%= "<hr>a is : " +a + " b is : "+b+ "<br>" %>
<%= "Result of add :"+ add(4,5) +"value of a : "+a+"value of b : "+b %>

<%-- This is part of comment
int a =10;
out.println(a);
 --%>

</body>
</html>