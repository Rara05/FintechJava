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
  <div class="row">
    <div class="col-md-12">
      <div class="card">
        <div class="card-body text-center">
          <img src="#" alt="Foto do perfil" class="rounded-circle mb-3">
          <h5 class="card-title">Nome do Usu�rio</h5>
          <p class="card-text">Informa��es pessoais</p>
          <hr>
          <h6>Valor da Conta:</h6>
          <p class="text-success" id="saldoConta"></p>
          <div class="row">
            <div class="col-md-6">
              <a href="divida.jsp" class="btn btn-danger btn-block">Adicionar D�vida</a>
            </div>
            <div class="col-md-6">
              <a href="recebimento.jsp" class="btn btn-success btn-block">Adicionar Recebimento</a>
            </div>
          </div>
          <hr>
          <a href="#" class="btn btn-primary">Editar Perfil</a>
          <a href="#" class="btn btn-warning ">Ver Extrato</a>
          <a href="#" class="btn btn-primary ">Realizar balan�o</a>
        </div>
      </div>
    </div>
  </div>
</div>





<%@ include file="footer.jsp" %>

<script>
  // Fazendo uma requisi��o para o backend ao carregar a p�gina
  fetch('/SelectPerfil')
    .then(response => {
      if (!response.ok) {
        throw new Error('Erro ao recuperar dados do servidor');
      }
      return response.json(); // Espera-se que os dados recebidos sejam um JSON
    })
    .then(data => {
      // Aqui, 'data' cont�m os dados retornados do seu servlet
      console.log('Dados recebidos:', data);

      // Agora voc� pode processar os dados e us�-los no frontend
      // Por exemplo, atualizar o conte�do da p�gina com esses dados
      // ou realizar outras opera��es de acordo com sua l�gica
      
      document.getElementById('saldoConta').textContent = 'R$ ' + data.saldoConta;
      document.getElementById('nomeUsuario').textContent = data.nomeUsuario;
      
    })
    .catch(error => {
      console.error('Erro:', error);
    });
</script>

</body>
</html>