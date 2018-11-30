<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionar Produto</title>
</head>
<body>
<form method="POST" action='ProdutoController'>
			ID Produto : 
			<input type="text" readonly="readonly" name="idProduto" value="${produto.id}" /> 
			<br /> Nome : 
			<input type="text"	name="nome" value="${produto.nome}" /> 
			<br /> Descricao : 
			<input	type="text" name="descricao" value="${produto.descricao}" /> 
			<br /> Valor : 
			<input	type="text" name="valor" value="${produto.valor}" /> 
			<br /> Quantidade :
			<input type="text" name="quantidade" value="${produto.quantidade}" /> 
			<br /> 
			<input	type="submit" value="Submit" />
	</form>
</body>
</html>