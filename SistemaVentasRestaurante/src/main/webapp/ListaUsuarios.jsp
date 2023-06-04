<%@page import="Domain.Cliente"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tabla de Clientes</title>
<!-- Enlace a los estilos de Bootstrap -->
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- Enlace a los estilos de Material-UI -->
<link rel="stylesheet" href="ruta/a/material-icons.css">
<style>
    .custom-table {
        width: 60%;
        margin: 0 auto;
    }
    .separator {
        height: 50px;
    }
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="index.jsp"><i class="fas fa-utensils"></i>Tabla de Clientes</a>
       
        <form class="form-inline ml-auto" action="search.jsp" method="get">
            <input class="form-control mr-sm-2" type="text" placeholder="Search" name="searchQuery">
            <button class="btn btn-primary" type="submit">Search</button>
        </form>
    </nav>


	<div class="separator"></div>
	
    <table class="table table-striped custom-table">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Dirección</th>
                <th>Cédula</th>
                <th>Teléfono</th>
                <th>Correo</th>
                <th>Acciones</th>
            </tr>
        </thead>
        <tbody>
            <% 
                List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaCli");
                for (Cliente cliente : listaClientes) {
            %>
            <tr>
                <td><%=cliente.getId()%></td>
                <td><%=cliente.getNombre() %></td>
                <td><%=cliente.getApellido() %></td>
                <td><%=cliente.getDireccion() %></td>
                <td><%=cliente.getCedula() %></td>
                <td><%=cliente.getTelefono() %></td>
                <td><%=cliente.getCorreo() %></td>
                <td>
                   <div class="d-inline">
					    <form action="Sv_Cliente?ruta=borrar" method="POST">
					        <input type="hidden" name="clienteId" value="<%=cliente.getId()%>">
					        <button type="submit" class="btn btn-danger">
					            <i class="material-icons">delete</i>
					        </button>
					    </form>
					    <form action="Sv_Cliente?ruta=editar" method="POST">
					        <input type="hidden" name="clienteId" value="<%=cliente.getId()%>">
					        <button type="submit" class="btn btn-primary">
					            <i class="material-icons">edit</i>
					        </button>
					    </form>
					                    
                </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

	<form method="post" action="Sv_Cliente?ruta=lista" >
		<button type="submit" class="btn btn-primary">
		<i class="material-icons">por implementar</i>
		</button>
	</form>
<!-- Enlace a los scripts de Bootstrap y Material-UI -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>

