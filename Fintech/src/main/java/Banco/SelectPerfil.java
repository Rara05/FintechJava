package Banco;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Servlet implementation class SelectPerfil
 */

@WebServlet("/SelectPerfil")
public class SelectPerfil extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SelectPerfil() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = Conexao.obterConexao();

            String sql = "SELECT nome, email, telefone FROM TbPerfil WHERE email = ? AND senha = ?";
            try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
                pstmt.setString(1, email);
                pstmt.setString(2, senha);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String emailUsuario = rs.getString("email");
                    String telefone = rs.getString("telefone");

                    // Criando um objeto JSON com os dados do perfil usando Gson
                    Gson gson = new Gson();
                    String perfilJSON = gson.toJson(new Perfil(nome, emailUsuario, telefone));

                    // Configurando a resposta para ser um JSON
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");

                    // Escrevendo o objeto JSON como resposta
                    PrintWriter out = response.getWriter();
                    out.print(perfilJSON);
                    out.flush();
                } else {
                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Credenciais inválidas");
                }

                rs.close();
            }
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Erro ao processar a autenticação");
        }
    }
}

//Classe para representar o perfil
class Perfil {
 private String nome;
 private String email;
 private String telefone;

 public Perfil(String nome, String email, String telefone) {
     this.nome = nome;
     this.email = email;
     this.telefone = telefone;
 }

 // getters e setters, se necessário
}
