<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
</head>
<body>
	<div id="login">
        <h3 class="text-center text-white pt-5"></h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="login" method="post">
                            <h3 class="text-center text-info">Inicio Sesion</h3>
                            <div class="form-group">
                                <label for="txtUsuario" class="text-info">Usuario:</label><br>
                                <input type="text" name="username" id="username" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="txtPass" class="text-info">Contraseña:</label><br>
                                <input type="password" name="password" id="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Iniciar Sesion">
                            </div>
                            <input type="hidden" name="${_csrf.parameterName}"
								value="${_csrf.token}" />
							
                        </form>
                        <%
							String error = (String) request.getAttribute("error");
							if (error != null && error.equals("true")) {
								out.println("<div class='alert alert-danger' role='alert'>");
								out.println("Credenciales invalidas. Favor, intentalo otra vez!!");
								out.println("</div>");
				
							}
						%>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
