<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>PR</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">	
	<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
	
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
	      <li class="nav-item">
	        <a class="nav-link text-white" href="${pageContext.request.contextPath}/">Inicio <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link text-white active" href="${pageContext.request.contextPath}/listarClientes">Clientes</a>
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
	<div class="container text-right">
    <a href="${pageContext.request.contextPath}/nuevoCliente" class="btn btn-default">
		<i class="fas fa-plus icon-plus"></i>
	</a>
	</div>
	
	<div class="container table-responsive-lg">
		<table class="table table-hover">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Rut</th>
		      <th scope="col">Razon Social</th>
		      <th scope="col">Rubro</th>
		      <th scope="col">Direccion</th>
		      <th scope="col">N° Colaboradores</th>
		      <th scope="col">Acciones</th>

		    </tr>
		  </thead>
		  <tbody>
		  <c:forEach items="${lista}" var="cliente">
		    <tr>
		      <th scope="row">${cliente.getId_cliente()}</th>
		      <td>${cliente.getRut()}</td>
		      <td>${cliente.getRazon_social()}</td>
		      <td>${cliente.getRubro()}</td>
		      <td>${cliente.getDireccion()}, ${cliente.getComuna().getComuna()}</td>
		      <td>${cliente.getNum_colaboradores()}</td>
		      <td>
		      	<a href="${pageContext.request.contextPath}">
					<i class="fas fa-trash-alt icon-lista"></i>
				</a>  
				<a href="${pageContext.request.contextPath}" >
					<i class="fas fa-edit icon-lista"></i>
				</a>
		      
		      </td>

		    </tr>
		   </c:forEach>
		  </tbody>
		</table>
	</div>
	
	 <!-- INICIO FOOTER -->
	<div class="container-fluid bg-info footer">
		<div class="container text-white text-center">
	  	© 2020 | Fernanda Quijada - Todos los derechos reservados
	  	</div>
	</div>
	
		
</body>
</html>