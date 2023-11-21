<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- link css -->
    <link rel="stylesheet" type="text/css" href="modello.css">
<meta charset="ISO-8859-1">
<title>TryBanck</title>

<!-- link headr  -->
<%@ include file="header.jsp" %>
</head>
<body>

<%@ include file="navPerfil.jsp" %>


<div class="container mt-4">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <h2 class="mb-4">Cadastro de recebimento</h2>
            <form action="adicionar-Recebimento" method="post">
                <div class="form-group">
                    <label for="tipo">Tipo de recebimento:</label>
                    <input type="text" class="form-control" id="tipo" name="tipo">
                </div>
                <div class="form-group">
                    <label for="valor">Valor do recebimento:</label>
                    <input type="text" class="form-control" id="valor" name="valor">
                </div>
                <div class="form-group">
                    <label for="descricao">Descri��o:</label>
                    <textarea class="form-control" id="descricao" name="descricao" rows="4" cols="50"></textarea>
                </div>
                <button type="submit" class="btn btn-primary" style="margin-top: 24px;" >Cadastrar recebimento</button>
            </form>
        </div>
    </div>
</div>



<%@ include file="footer.jsp" %>


</body>
</html>