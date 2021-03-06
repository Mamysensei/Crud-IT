<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajout ou modification d'une crudité</title>
</head>
<body>
	<h1>Bienvenue sur CRUD'IT</h1>
    <div align="center">
        <h1>Ajout ou modification d'une crudité</h1>
        <form:form action="saveCrudite" method="post" modelAttribute="crudite">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Nom</td>
                <td><form:input path="nom" /></td>
            </tr>
            <tr>
                <td>Prix</td>
                <td><form:input path="prix" /></td>
            </tr>
            <tr>
                <td>Quantité dispo</td>
                <td><form:input path="quantiteDispo" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Sauvegarder"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>