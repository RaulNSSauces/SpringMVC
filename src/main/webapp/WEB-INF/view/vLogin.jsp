<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/estilos.css"/>
</head>
<body>
	<div class="cabeza">
            <header>
                <h1>Aplicación Raúl 2021</h1>
            </header>
        </div>
        <main>
            <div class="loginbox">
                    <p class="pLogin">Iniciar sesión en la aplicación</p>
                <form method="post" action="controlAcceso">
                        <div>
                            <label for="codUsuario">Nombre de usuario</label>
                            <input type="text" name="user" placeholder="Introduce nombre de usuario">
                        </div>
                    <br>
                        <div>
                            <label for="password">Contraseña</label>
                            <input type="password" name="passwd" placeholder="Introduce contraseña">
                        </div>
                    <br>
                        <div>
                            <button class="btnIniciarSesion" type="submit" name="iniciarSesion">Iniciar sesión</button>
                            <button class="btnRegistro" type="submit" name="registrate" onclick="window.location.href='vAltaUsuario'; return false">Regístrate</button>
                        </div>
                </form>
            </div>
        </main>
</body>
</html>