package br.com.atividade.login;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        // Press Alt+Enter with your caret at the highlighted text to see how
//        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
//    }
//}
//
//package br.com.trybank;

import java.util.Scanner;

public class Cadastro {
    // Inicio Usuario
    private String usuario = "jurema" ;
    public void setUsuario(String usuarioNovo) {
        usuario = usuarioNovo;
    }
    public String getUsuario() {
        return usuario;
    }
     // Fim Usuario

    // Inicio Nome
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // fim Senha

    // Inicio Sobre Nome
    private String sobreNome;
    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
            //Fim sobre Nome

    // inicio Senha
    private String senha;
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    // fim Senha

    // Inicio Sobre Usuario
    private String sobre;
    public String getSobre() {
        return sobre;
    }
    public void setSobre(String sobre) {
        this.sobre = sobre;
    }
    // Fim sobre

    // Inicio foto de perfil
    private String foto;
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    // Fim foto de perfil

    // inicio email
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //fim email

    // Inicio telefone
    private String telefone;
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    // fim Telefone

    // Inicio CPF
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // Fim CPF

    // Construtor vazio
    public Cadastro() {
    }

    // Método para cadastrar um usuário
    public void cadastrar() {
        Cadastro cadastro = new Cadastro();

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        usuario = input.nextLine();

        while (usuario.length() < 4 ) {
            System.out.println("Usuario digitado inválido!");
            System.out.print("Digite seu Usuario: ");
            usuario = input.nextLine();
        }

        // fim metodo para cadastrar um usuario




        System.out.print("Digite seu nome: ");
        nome = input.nextLine();

        while (nome.length() < 1 ) {
            System.out.println("Nome digitado inválido");
            System.out.print("Digite seu Nome: ");
            nome = input.nextLine();
        }

        System.out.print("Digite seu sobrenome: ");
        sobreNome = input.nextLine();

        while (sobreNome.length() < 1 ) {
            System.out.println("Nome digitado inválido");
            System.out.print("Digite seu Nome: ");
            sobreNome = input.nextLine();
        }

        System.out.print("Digite sua senha: ");
        senha = input.nextLine();

//        while (senha.length() < 5 ) {
//            System.out.println("Senha cadastrada irregular");
//            System.out.print("Digite seu Nome: ");
//            senha = input.nextLine();
//        }

        System.out.print("Digite algumas informações sobre você: ");
        sobre = input.nextLine();

//        while (sobre.length() > 320 ) {
//            System.out.println("Quantidade de caracteres exedida");
//            System.out.print("Digite algumas informações sobre você: ");
//            sobre = input.nextLine();
//        }


        System.out.print("O url da sua foto: ");
        foto = input.nextLine();

        System.out.print("Digite seu e-mail: ");
        email = input.nextLine();


        System.out.print("Digite seu telefone: ");
        telefone = input.nextLine();

//        while (telefone.length() != 9){
//            System.out.println("Valor digitado inválido");
//            System.out.print("Digite seu telefone: ");
//            telefone = input.nextLine();
//        }

        System.out.print("Digite seu CPF: ");
        cpf = input.nextLine();


//        while (cpf.length() != 11 ) {
//            System.out.println("Valor digitado inválido");
//            System.out.print("Digite seu CPF: ");
//            telefone = input.nextLine();
//        }




    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar();

        // Exibir as informações cadastradas:
        System.out.println("Usuário: " + cadastro.usuario);
        System.out.println("Nome: " + cadastro.nome);
        System.out.println("Sobrenome: " + cadastro.sobreNome);
    }
}
    




