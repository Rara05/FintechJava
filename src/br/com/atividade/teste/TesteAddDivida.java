package br.com.atividade.teste;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import junit.framework.*;
class TesteTransacao{

    public  String titulo;
    public  double valor;
    public  LocalDateTime dataCadastro;
    public  LocalDateTime dataFinalizado;
    public  double juros;
    public  String tipoTransacao;
    public TesteTransacao(String titulo, double valor, LocalDateTime dataCadastro, LocalDateTime dataFinalizado, double juros,String tipoTransacao) {
        this.titulo = titulo;
        this.valor = valor;
        this.dataCadastro = dataCadastro;
        this.dataFinalizado = dataFinalizado;
        this.juros = juros;
        this.tipoTransacao = tipoTransacao;

    }

    public void excluir () {}

}

class TesteAddDivida extends TestCase {

    public static void main (String[] args ) {

        Set<TesteTransacao> listTransacao = new HashSet<>();
        String tituloAdd = "Testando";
        double valorAdd = 200;
        double jurosAdd = 12;
        String tipoTransacao = "divida";
        LocalDateTime dataCadastroAdd = LocalDateTime.of(2023, 1, 1, 12, 0);

        TesteTransacao transacaoReal = new TesteTransacao(tituloAdd, valorAdd, dataCadastroAdd, null, jurosAdd, tipoTransacao);
        System.out.println("Dívida Cadastrada: "+ tituloAdd + "\nValor da divida cadastrada: " + valorAdd);

        // Inserindo valores a serem comparados na lista  transacaoEsperada
        TesteTransacao transacaoEsperada = new TesteTransacao("Testando", 200.0, dataCadastroAdd, null, 12.0, "divida");

        // Comparar atributo por atributo
        assertEquals(transacaoEsperada.titulo, transacaoReal.titulo);
        assertEquals(transacaoEsperada.valor, transacaoReal.valor, 0.01); // Comparação de números com tolerância
        assertEquals(transacaoEsperada.dataCadastro, transacaoReal.dataCadastro);
        assertEquals(transacaoEsperada.dataFinalizado, transacaoReal.dataFinalizado);
        assertEquals(transacaoEsperada.juros, transacaoReal.juros, 0.01); // Comparação de números com tolerância
        assertEquals(transacaoEsperada.tipoTransacao, transacaoReal.tipoTransacao);


        System.out.println("Blzinha");
    }


}


