<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
    
<%
	String s = (String)session.getAttribute("URL");
	
%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
    div{visibility: hidden;}
    div table{visibility: visible;}
    font{visibility: visible; border: #000; color: #010303}
	span{visibility: hidden;}
	input {visibility: hidden;}
	li {visibility: hidden;}
	ul {visibility: hidden;}
	a{visibility: hidden;}
	a.voltar{visibility: visible;}
	p{font-family:sans-serif; font-size: 20px}

</style>
</head>
<body>

<p>Resultado abaixo</p>

  <c:import url="<%= s %>" />
  
   
  
  <a href="./index.jsp" class="voltar"> voltar </a>




</body>
</html>
