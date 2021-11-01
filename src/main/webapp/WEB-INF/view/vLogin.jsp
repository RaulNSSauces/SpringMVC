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
                <h1>Aplicaci�n Ra�l 2021</h1>
            </header>
        </div>
        <main>
            <div class="loginbox">
                    <p class="pLogin">Iniciar sesi�n en la aplicaci�n</p>
                <form method="post" action="controlAcceso">
                        <div>
                            <label for="codUsuario">Nombre de usuario</label>
                            <input type="text" name="user" placeholder="Introduce nombre de usuario">
                        </div>
                    <br>
                        <div>
                            <label for="password">Contrase�a</label>
                            <input type="password" name="passwd" placeholder="Introduce contrase�a">
                        </div>
                    <br>
                        <div>
                            <button class="btnIniciarSesion" type="submit" name="iniciarSesion">Iniciar sesi�n</button>
                            <button class="btnRegistro" type="submit" name="registrate" onclick="window.location.href='vAltaUsuario'; return false">Reg�strate</button>
                        </div>
                </form>
            </div>
        </main>
</body>
</html>