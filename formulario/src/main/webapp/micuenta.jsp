<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenido a tu seccion privada</h1>


<% out.print(session.getAttribute("session_name")); %>

  <a href="/formulario/CerrarSession" > CERRAR SESION</a>

</body>
</html>