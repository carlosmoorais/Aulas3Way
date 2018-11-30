<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PRODUTOS</title>
</head>
<body>
<form method="get" action='ProdutoController' name="frmBuscarProduto">
		<input type="text" name="buscarProduto" placeholder="Buscar por Produto"/>
		<input type="submit" value="Buscar"/>
	</form>
	<table border=1>
        <thead>
            <tr>
                <th>ID do Produto</th>
                <th>Nome do Produto</th>
                <th>Descricao</th>
                <th>Valor</th>
                <th>Quantidade</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${produtos}" var="produto">
                <tr>
                    <td><c:out value="${produto.id}" /></td>
                    <td><c:out value="${produto.nome}" /></td>
                    <td><c:out value="${produto.descricao}" /></td>
                    <td><c:out value="${produto.valor}" /></td>
                    <td><c:out value="${produto.quantidade}" /></td>
                    <td><a href="ProdutoController?action=editar&produtoId=<c:out value="${produto.id}"/>">Update</a></td>
                    <td><a href="ProdutoController?action=deletar&produtoId=<c:out value="${produto.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="ProdutoController?action=insert">Adicionar Produto</a></p>
</body>
</html>