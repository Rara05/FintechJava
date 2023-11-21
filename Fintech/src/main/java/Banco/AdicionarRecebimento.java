package Banco;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adicionar-Recebimento")


public class AdicionarRecebimento extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	
    	String valor = request.getParameter("valor");
    	String tipo = request.getParameter("tipo");
    	String descri = request.getParameter("descri");
    	
        // Configurações de conexão ao banco de dados
        String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        String usuario = "RM552119";
        String senha = "270998";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            // Consulta SQL para inserir a dívida
            String sql = "INSERT INTO TbSaldos (valor, tipo, descri) VALUES (?,?,?)";
            PreparedStatement declaracao = conexao.prepareStatement(sql);
           
            declaracao.setString(1, valor);
            declaracao.setString(1, tipo);
			declaracao.setString(1, descri);
            declaracao.executeUpdate();

            declaracao.close();
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Tratar erros de conexão ou inserção no banco de dados
        }

        response.sendRedirect("/Fintech/perfil.jsp"); // Redirecionamento para uma página de sucesso
    }
}