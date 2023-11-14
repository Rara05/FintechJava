<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- link css -->
    <link rel="stylesheet" type="text/css" href="modello.css">

    <title>TryBank</title>
    <%@ include file="header.jsp" %>

<body style="background-color: #619bff;">

<%@ include file="menu.jsp" %>



    
<div id="cadas" class="container" style=" margin-bottom: 100px; margin-top: 50px; background-color: #619bff;">
    <div class="row justify-content-center align-items-center">
        <div class="col-lg-12 col-md-8 col-sm-10"> <!-- Ajustei os tamanhos para diferentes breakpoints -->
                    
                    <h1 class="" style=" margin-bottom: 30px; font-weight: 500; font-style: italic" >Cadastro de Usu�rio</h1>
               
            <div id="cadastro" class="card" style=" font-size: 18px; font-style: italic; ">
                <div class="card-body">

                    <form action="/Fintech/CadastroServlet" method="post">
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="nome">Nome:</label>
                            <input class="form-control" type="text"  name="nome" required>
                        </div>

                        <!-- Campo para a senha -->
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="senha">Senha:</label>
                            <input  class="form-control" type="password" name="senha" required >
                        </div>

                        <!-- Campo para a foto (considerando que seja um upload de arquivo) -->
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="foto">Foto:</label>
                            <input class="form-control" type="file" id="formFile">
                        </div>

                        <!-- Campo para o email -->
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="email">Email:</label>
                            <input class="form-control" type="email" name="email" required>
                        </div>

                        <!-- Campo para o telefone -->
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="telefone">Telefone:</label>
                            <input class="form-control" type="tel"  name="telefone" required>
                        </div>

                        <!-- Bot�o de envio do formul�rio -->
                        <button type="submit" class="btn btn btn-success btn-block" style="margin-top: 20px;">Cadastrar</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
		
		
  








<%@ include file="footer.jsp" %>
</body>


</html>














