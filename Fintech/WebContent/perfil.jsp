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
          <h5 class="card-title" id="nomeUsuario" > Usuário</h5>
          <p class="card-text">Informações pessoais</p>
          <p class="card-text" id="emailUsuario" >email</p>
          <p class="card-text" id="telefone">telefone</p>
          <hr>
          <h6>Valor da Conta:</h6>
          <p class="text-success">R$: 100,00</p>
          <div class="row">
            <div class="col-md-6">
              <a href="divida.jsp" class="btn btn-danger btn-block">Adicionar Dívida</a>
            </div>
            <div class="col-md-6">
              <a href="recebimento.jsp" class="btn btn-success btn-block">Adicionar Recebimento</a>
            </div>
          </div>
          <hr>
          <a href="#" class="btn btn-primary">Editar Perfil</a>
          <a href="#" class="btn btn-warning ">Ver Extrato</a>
          <a href="#" class="btn btn-primary ">Realizar balanço</a>
        </div>
      </div>
    </div>
  </div>
</div>





<%@ include file="footer.jsp" %>

<script>
  // Fazendo uma requisição para o backend ao carregar a página
  fetch('/SelectPerfil')
    .then(response => {
      if (!response.ok) {
        throw new Error('Erro ao recuperar dados do servidor');
      }
      return response.json(); // Espera-se que os dados recebidos sejam um JSON
    })
    .then(data => {
      // Aqui, 'data' contém os dados retornados do seu servlet
      console.log('Dados recebidos:', data);

      // Agora você pode processar os dados e usá-los no frontend
      // Por exemplo, atualizar o conteúdo da página com esses dados
      // ou realizar outras operações de acordo com sua lógica
      
      document.getElementById('nomeUsuario').textContent = data.nomeUsuario;
      document.getElementById('emailUsuario').textContent = data.emailUsuario;
      document.getElementById('telefone').textContent = data.telefone;
      
    })
    .catch(error => {
      console.error('Erro:', error);
    });
</script>

</body>
</html>