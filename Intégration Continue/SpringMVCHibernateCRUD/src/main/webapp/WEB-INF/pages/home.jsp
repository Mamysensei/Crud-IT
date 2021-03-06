<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ecran de gestion des légumes</title>
</head>
<body>
	<div align="center">
		<h1>Liste des crudités disponibles</h1>
		<table border="1">

			<th>Nom</th>
			<th>Prix</th>
			<th>Quantité Dispo</th>
			

			<c:forEach var="crudite" items="${listCrudite}">
				<tr>

					<td>${crudite.nom}</td>
					<td>${crudite.prix}</td>
					<td>${crudite.quantiteDispo}</td>
					<td><a href="editCrudite?id=${crudite.id}">Modifier</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteCrudite?id=${crudite.id}">Supprimer</a></td>

				</tr>
			</c:forEach>
		</table>
		<h4>
			Ajouter une nouvelle crudité <a href="newCrudite">ICI </a>
		</h4>
	</div>
</body>
</html>