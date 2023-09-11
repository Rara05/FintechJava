package br.com.atividade.conta;

import java.time.LocalDateTime;


import java.util.*;

public class Conta {

    Scanner input = new Scanner(System.in);
    public Set<Transacao> listTransacao = new HashSet<>();
    public double saldo;
    private double dividas;
    private double recebimento;
    private String tituloAdd ;
    private double valorAdd ;

    // inicio metodo de dividas
//    public double getDividas () {
//        return dividas;
//    }
    public void setDividas(double dividas) {
        this.dividas = dividas;

    }
   // fim do metodo de dividas


    // inicio metodo recebiemento
    public double getRecebimento () {
        return recebimento;
    }
    public void setRecebimento( double recebimento) {

        this.recebimento = recebimento;

    }
    // fim do metodo recebimento

    //    public Conta () {}

    public Conta () {
    }


    public double retornarSaldo () {
        return saldo;
//        double saldo = getSaldo();
    }

    // Inicio cadastrar dividas
    public Set<Transacao> cadastarDividas () {
            double jurosAdd ;
            LocalDateTime dataCadastroAdd = LocalDateTime.now();
            String tipoTransacao = "divida";


            System.out.println("\n==================== Adicionando Dívida ====================");
            System.out.println("Titulo: ");
            tituloAdd = input.nextLine();

            System.out.print("Valor da dívida: ");
            valorAdd = Double.parseDouble(input.nextLine());

            while (valorAdd < 0.1 ) {
                System.out.println("Valor cadastrado menor que 0,1$");
                System.out.print("Valor da dívida: ");
                valorAdd = Double.parseDouble(input.nextLine());
            }

            System.out.println("Juros: ");
            jurosAdd = Double.parseDouble(input.nextLine());


            System.out.println("Dívida Cadastrada: "+ tituloAdd + "\nValor da divida cadastrada: " + valorAdd);

            listTransacao.add(new Transacao(tituloAdd, valorAdd, dataCadastroAdd, null, jurosAdd, tipoTransacao));

            return listTransacao;
    }
    // fim cadastrar dividas


    // inicio Cadastrar recebimento
    public Set<Transacao> cadastrarRecebimento () {
        LocalDateTime dataCadastroAdd = LocalDateTime.now();
        String tipoTransacao = "recebimento";


        System.out.println("\n==================== Adicionando Recebimento ====================");
        System.out.println("Titulo: ");
        tituloAdd = input.nextLine();

        System.out.print("Valor do recebimento: ");
        valorAdd = Double.parseDouble(input.nextLine());

        while ( valorAdd < 0.1 ) {
            System.out.println("Valor cadastrado menor que 0,1$");
            System.out.print("Valor do Recebimento: ");
            valorAdd = Double.parseDouble(input.nextLine());
        }

        System.out.println("Recebimento cadastrado: "+ tituloAdd + "\nValor do recebimento cadastrada:" + valorAdd);

        listTransacao.add(new Transacao(tituloAdd, valorAdd, dataCadastroAdd, null,0, tipoTransacao));

        return listTransacao;

    }
    // Fim cadastrar recebimento


    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Transacao> getDividas() {
        List<Transacao> dividas = new ArrayList<>();
        for (Transacao transacao : listTransacao) {
            if ("divida".equals(transacao.tipoTransacao)) {
                dividas.add(transacao);
            }
        }
        return dividas;
    }

    public List<Transacao> getRecebimentos() {
        List<Transacao> recebimentos = new ArrayList<>();
        for (Transacao transacao : listTransacao) {
            if ("recebimento".equals(transacao.tipoTransacao)) {
                recebimentos.add(transacao);
            }
        }
        return recebimentos;
    }


}





class Transacao{

    public  String titulo;
    public  double valor;
    public  LocalDateTime dataCadastro;
    public  LocalDateTime dataFinalizado;
    public  double juros;
    public  String tipoTransacao;
    public Transacao(String titulo, double valor, LocalDateTime dataCadastro, LocalDateTime dataFinalizado, double juros,String tipoTransacao) {
        this.titulo = titulo;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
        this.dataFinalizado = dataFinalizado;
        this.juros = juros;
        this.tipoTransacao = tipoTransacao;

    }

    public void excluir () {}

}
