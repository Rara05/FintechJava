package br.com.atividade.login;


public class Perfil extends Cadastro {

    public static void main(String[] args) {
        Perfil perfil = new Perfil();
        perfil.pegarValores();

    }

    public Perfil() {};

    public void  emailAltera() {}
    public void nomeAlterar() {}
    public void telefoneAlterar() {}

    public void pegarValores() {
        Cadastro cadastro = new Cadastro();
        String usuario = cadastro.getUsuario();

        System.out.println("Usuario: " + usuario);
    }




}
