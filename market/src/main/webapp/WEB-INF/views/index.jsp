<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Clients</h1>

	<table>
		<thead>
			<tr>
				<th>Rut</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Dirección</th>
				<th>Ciudad</th>
				<th>Acción</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cliente" items="${clientes}">
				<tr>
					<td>${cliente.rut}-${cliente.dv}</td>
					<td>${cliente.nombre}</td>
					<td>${cliente.apellido}</td>
					<td>${cliente.direccion}</td>
					<td>${cliente.ciudad}</td>
					<td>
						<form action="eliminar" method="post">
							<input type="text" value="${cliente.rut}" name="rut" hidden="true" /> 
							<input type="submit" value="Eliminar" />
						</form>

						<form action="modificar" method="post">
							<input type="text" value="${cliente.rut}" name="rut" hidden="true" /> 
							<input type="submit" value="modificar" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
