<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.spring.mvc.dao.*, maven.spring.mvc.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Inicio</title>
</head>
<body>
	<%@ include file="vHeader.jsp" %>
		<form>
			<input class="boton" type="button" value="1 - Alta Rol" onclick="window.location.href='vAltaRol'; return false"/>
		</form>
	<br>
		<form>
			<input class="boton" type="button" value="2 - Listar Roles" onclick="window.location.href='vMostrarListado'; return false"/>
		</form>
</body>
</html>