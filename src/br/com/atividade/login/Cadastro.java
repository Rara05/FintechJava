package br.com.atividade.login;


import java.util.Scanner;

public class Cadastro {
    // Variaveis
    private String usuario = "jurema" ;
    private String nome;
    private String sobreNome;
    private String senha;
    private String sobre;
    private String foto;
    private String email;
    private String telefone;
    private String cpf;


    // metodos get e set
    public String getUsuario() { return this.usuario; }
    public void setUsuario(String usuarioNovo) {
        this.usuario = usuarioNovo;
    }

    public String getNome(){ return nome; }
    public void  setNome(String nomeNovo) { this.nome = nomeNovo; }

    public String getSobreNome() {
        return sobreNome;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSenha() {
        return this.senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobre() { return this.sobre; }
    public void setSobre(String sobre) { this.sobre = sobre; }

    public String getFoto() {
        return this.foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
            System.out.print("Digite seu sobrenome: ");
            sobreNome = input.nextLine();
        }

        System.out.print("Digite sua senha: ");
        senha = input.nextLine();

        while (senha.length() < 5 ) {
            System.out.println("Senha cadastrada irregular");
            System.out.print("Digite sua senha: ");
            senha = input.nextLine();
        }

        System.out.print("Digite algumas informações sobre você: ");
        sobre = input.nextLine();

        while (sobre.length() > 320 ) {
            System.out.println("Quantidade de caracteres exedida");
            System.out.print("Digite algumas informações sobre você: ");
            sobre = input.nextLine();
        }


        System.out.print("O url da sua foto: ");
        foto = input.nextLine();

        System.out.print("Digite seu e-mail: ");
        email = input.nextLine();


        System.out.print("Digite seu telefone: ");
        telefone = input.nextLine();

        while (telefone.length() != 9){
            System.out.println("Valor digitado inválido");
            System.out.print("Digite seu telefone: ");
            telefone = input.nextLine();
        }

        System.out.print("Digite seu CPF: ");
        cpf = input.nextLine();


        while (cpf.length() != 11 ) {
            System.out.println("Valor digitado inválido");
            System.out.print("Digite seu CPF: ");
            cpf = input.nextLine();
        }




    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrar();

        // Exibir as informações cadastradas:
        System.out.println("Usuário: " + cadastro.getUsuario());
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("Sobrenome: " + cadastro.getSobreNome());
    }
}
    




