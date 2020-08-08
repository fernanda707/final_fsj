<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
	      <li class="nav-item">
	        <a class="nav-link text-white" href="#">Inicio <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link text-white" href="${pageContext.request.contextPath}/listaAccidentes">Registros Accidentes</a>
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
	<form:form action="${pageContext.request.contextPath}/guardarAccidente" method="post">
		<c:set var="c" value="${c}"></c:set>
		<c:set var="p" value="${p}"></c:set>
		<input type="hidden" name="id_cliente" value="${c.getId_cliente()}">
		<input type="hidden" name="es_profesional" value="0">
		<div class="container formulario">
		<h3>Agregar Nuevo Accidente</h3>
		<li><h5>Datos persona accidentada</h5></li>
			<div class="form-row">
				<div class="form-group col-md-4">
			      <label for="txtRazonSocial">Rut</label>
			      <input type="text" class="form-control form-control-sm" name="rut" >
			    </div>
			    <div class="form-group col-md-4">
			      <label for="txtRut">Nombre</label>
			      <input type="text" class="form-control form-control-sm" name="nombre">
			    </div>
			    
			</div>
			<div class="form-row">
				<div class="form-group col-md-4">
			      <label for="txtRubro">Apellido Paterno</label>
			      <input type="text" class="form-control form-control-sm" name="ap_paterno" >
			    </div>
			    <div class="form-group col-md-4">
			      <label for="txtDireccion">Apellido Materno</label>
			      <input type="text" class="form-control form-control-sm" name="ap_materno">
			    </div>
			    <div class="form-group col-md-1">
			      <label for="txtNum">Edad</label>
			      <input type="number" class="form-control form-control-sm" name="edad">
			    </div>		    
			</div>
			
			<li><h5>Datos Accidente</h5></li>
			
			<div class="form-row">
				<div class="form-group col-md-4">
			      <label for="txtRazonSocial">Fecha Accidente</label>
			      <input type="date" class="form-control form-control-sm" name="fecha_accidente" >
			    </div> 
			</div>
			<div class="form-row">
				<div class="form-group col-md-8">
			      <label for="txtRut">Labor desarrollada al momento del accidente</label>
			      <input type="text" class="form-control form-control-sm" name="labor_desarrollada">
			   	</div>
			</div>
				
			<div class="form-group">
				<input class="btn btn-primary" type="submit" value="Guardar">
			</div>		
			
		</div>
		
	</form:form>
	
	<!-- INICIO FOOTER -->
	<div class="container-fluid bg-info footer">
		<div class="container text-white text-center">
	  	© 2020 | Fernanda Quijada - Todos los derechos reservados
	  	</div>
	</div>
	
		
</body>
</html>