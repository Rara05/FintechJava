package br.com.atividade.teste;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


import org.junit.jupiter.api.Assertions;
import junit.framework.*;
import static org.junit.Assert.assertEquals;

public class TesteaddRecebimento {

    public static void main (String[] args ) {
        String tituloAdd = "Testando";
        double valorAdd = 200;
        String tipoTransacao = "recebimento";
        LocalDateTime dataCadastroAdd = LocalDateTime.of(2023, 1, 1, 12, 0);



        System.out.println("Recebimento cadastrado: "+ tituloAdd + "\nValor do recebimento cadastrada:" + valorAdd);

        TesteTransacao transacaoReal = new TesteTransacao(tituloAdd, valorAdd, dataCadastroAdd, null,0, tipoTransacao);

        // Inserindo valores a serem comparados na lista  transacaoEsperada
        TesteTransacao transacaoEsperada = new TesteTransacao("Testando", 200.0, dataCadastroAdd, null, 12.0, "recebimento");


        assertEquals(transacaoEsperada.titulo, transacaoReal.titulo);
        assertEquals(transacaoEsperada.valor, transacaoReal.valor, 0.01); // Comparação de números com tolerância
        assertEquals(transacaoEsperada.dataCadastro, transacaoReal.dataCadastro);
        assertEquals(transacaoEsperada.dataFinalizado, transacaoReal.dataFinalizado);
        assertEquals(transacaoEsperada.tipoTransacao, transacaoReal.tipoTransacao);


        System.out.println("Blzinha");
    }


}
