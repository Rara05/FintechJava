package br.com.atividade.login;

import java.util.Scanner;

public class LoginValidator extends Cadastro {

    // Construtor vazio para a classe LoginValidator
    public LoginValidator() {
    }

    // Método para validar o login
    public boolean validarLogin(String usuario, String senha) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuarioDigitado = input.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = input.nextLine();

        // Verifique se o usuário e a senha correspondem às informações cadastradas
        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            System.out.println("Login bem-sucedido!");
            return true;
        } else {
            System.out.println("Usuário ou senha incorretos. Tente novamente.");
            return false;
        }
    }

    public static void main(String[] args) {
        LoginValidator loginValidator = new LoginValidator();


        System.out.println("==================== Cadastro ====================");
        loginValidator.cadastrar(); // Chama o método cadastrar de Cadastro


        System.out.println("\n==================== login ====================");
        // Chama o metodo de pegar os dados de Cadastro
        String varUsuario = loginValidator.getUsuario();
        String varSenha = loginValidator.getSenha();

        // Valide o login
        boolean loginValido = loginValidator.validarLogin(varUsuario, varSenha);

        // Exiba as informações cadastradas se o login for válido
        if (loginValido) {
            System.out.println("Bem-Vindo: "+ varUsuario);
            loginValidator.setUsuario(varUsuario);
//            System.out.println("Usuário: " + loginValidator.usuario);
            // Você pode acessar a senha e outros campos de Cadastro da mesma forma
        }
    }



}
