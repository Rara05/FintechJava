package Banco;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (validateLogin(email, password)) {
            response.sendRedirect("/SeuProjeto/success.jsp"); // Página de sucesso
        } else {
            response.sendRedirect("/SeuProjeto/failure.jsp"); // Página de falha
        }
    }

    private boolean validateLogin(String email, String password) {
        // Substitua as informações de conexão com seu banco de dados
        String jdbcURL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
        String dbUser = "seu_usuario";
        String dbPassword = "sua_senha";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, email);
                statement.setString(2, password);

                try (ResultSet result = statement.executeQuery()) {
                    return result.next();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
