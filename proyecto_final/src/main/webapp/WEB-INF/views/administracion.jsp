<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>PR</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-info">
	  <a class="navbar-brand mb-0 h1 text-white" href="#">
	    <img src="https://portalprevencion.org/wp-content/uploads/riesgo-suelo-escurre-se%C3%B1ali-940x385.png" width="80" height="40" class="d-inline-block align-top" alt="">
	    Prevencion de Riesgos
	  </a>
	  <button class="navbar-toggler text-white" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link text-white" href="#">Inicio <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link text-white" href="${pageContext.request.contextPath}/listarClientes">Clientes</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link text-white" href="${pageContext.request.contextPath}/profesionales">Profesionales</a>
	      </li>
	    </ul>
	    <ul class="navbar-nav ml-auto">
	    	<li class="nav-item">
	    		<a class="nav-link text-white" href="${pageContext.request.contextPath}/logout">Salir</a>
	    	</li>
	    </ul>
	  </div>	 
	</nav>
		  <!-- ------------------------------FIN MENU -->

	
	 <!-- INICIO FOOTER -->
	<div class="container-fluid bg-info footer">
		<div class="container text-white text-center">
	  	© 2020 | Fernanda Quijada - Todos los derechos reservados
	  	</div>
	</div>
	
		
</body>
</html>