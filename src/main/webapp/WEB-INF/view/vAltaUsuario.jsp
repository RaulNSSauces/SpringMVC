<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="script.js"></script>
<title>Alta Usuario</title>
</head>
<body>
	<%@ include file="vHeader.jsp" %>
	<form method="post" action="AltaUsuario">
	    <div>
	    	<label for="idRol">ID Rol: </label>
	    	<input type="number" name="idRol" placeholder="" value="0">
	    </div>
	<br>
		<div>
	    	<label for="email">Email: </label>
	    	<input type="text" name="email" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="clave">Clave: </label>
	    	<input type="text" name="clave" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="nombre">Nombre: </label>
	    	<input type="text" name="nombre" id="nombre" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="ape1">Apellido 1: </label>
	    	<input type="text" name="ape1" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="ape2">Apellido 2: </label>
	    	<input type="text" name="ape2" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="direccion">Direccion: </label>
	    	<input type="text" name="direccion" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="localidad">Localidad: </label>
	    	<input type="text" name="localidad" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="provincia">Provincia: </label>
	    	<input type="text" name="provincia" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="telefono">Teléfono: </label>
	    	<input type="text" name="telefono" placeholder="">
	    </div>
	<br>
		<div>
	    	<label for="dni">DNI: </label>
	    	<input type="text" name="dni" placeholder="">
	    </div>
	<br>
	    <div>
	    	<button type="submit" name="crearUsuario">Crear Usuario</button>
	    </div>
	</form>
</body>
</html>