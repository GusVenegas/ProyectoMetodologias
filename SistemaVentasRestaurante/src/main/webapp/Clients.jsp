<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import=  "Domain.Cliente" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listado de Clientes</title>
</head>
<body>
    <h1>Listado de Clientes</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Email</th>
                <!-- Agrega más columnas según los atributos de tu objeto Cliente -->
            </tr>
        </thead>
        <tbody>
           
        </tbody>
    </table>
     <form action="Sv_Cliente" method="GET">
        <label for="nombre">ver lista de ususarios:</label>
        
        <input type="submit" value="Enviar">
    </form>
    <form action="Sv_Cliente" method="POST">
        <label for="nombre">ver lista de ususarios:</label>
        
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

