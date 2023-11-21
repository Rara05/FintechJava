<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <!-- link css -->
    <link rel="stylesheet" type="text/css" href="modello.css">

    <title>TryBank</title>
    <%@ include file="header.jsp" %>

<body style="background-color: #619bff;">

<%@ include file="menu.jsp" %>



    
<div id="cadas" class="container" style=" margin-bottom: 100px; margin-top: 190px; background-color: #619bff;">
    <div class="row justify-content-center align-items-center">
        <div class="col-lg-12 col-md-8 col-sm-10"> <!-- Ajustei os tamanhos para diferentes breakpoints -->
                    
                    <h1 class="" style=" margin-bottom: 20px; font-weight: 500; font-style: italic" >Login</h1>
               
            <div id="cadastro" class="card" style=" font-size: 18px; font-style: italic; ">
                <div class="card-body">

                    <form action="/Fintech/LoginServlet" method="post">
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="nome">E-mail:</label>
                            <input class="form-control" type="text"  name="email" required>
                        </div>

                        <!-- Campo para a senha -->
                        <div class="form-group" style="margin-top: 20px;">
                            <label for="senha">Senha:</label>
                            <input  class="form-control" type="password" name="senha" required >
                        </div>

                       
                        <!-- Bot�o de envio do formul�rio -->
                        <button type="submit" class="btn btn btn-success btn-block" style="margin-top: 20px;">Fazer Login</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
		
		
  








<%@ include file="footer.jsp" %>
</body>


</html>