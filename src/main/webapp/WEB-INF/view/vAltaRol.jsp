<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, maven.spring.mvc.dao.*, maven.spring.mvc.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insertar Roles</title>
</head>
	<body>
		<%@ include file="vHeader.jsp" %>
		<form method="post" action="AltaRol">
	    	<div>
	    		<label for="nombreRol">Nombre</label>
	    		<input type="text" name="nombreRol" placeholder="">
	    </div>
	    <br>
	    	<div>
	    		<button type="submit" name="crearRol">Crear Rol</button>
	    	</div>
	    </form>
	</body>
</html>