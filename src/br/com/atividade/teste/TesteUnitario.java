package br.com.atividade.teste;

import br.com.atividade.conta.Conta;
import br.com.atividade.conta.Extrato;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;



import static org.junit.Assert.assertEquals;

public class TesteUnitario {

    public static void main (String[] args ) {
        // Criar uma instância da classe Conta
        Conta conta = new Conta();
        conta.listTransacao = new HashSet<>();

        Set<TesteTransacao> listTesteTransacao = new HashSet<>();

        // teste das operações do menu
        int[] entradasUsuario = {1, 2, 3, 4, 0};
        int indiceEntrada = 0;
        LocalDateTime dataCadastroAdd = LocalDateTime.of(2023, 1, 1, 12, 0);
        int indiceEsperado = 5 ;
        TesteTransacao dividaAdd = new TesteTransacao("Testando", 200.0, dataCadastroAdd, null, 12.0, "divida");



        while (indiceEntrada < entradasUsuario.length) {
            int resposta = entradasUsuario[indiceEntrada];

            switch (resposta) {
                case 1:
                    listTesteTransacao.add(dividaAdd);

                    break;
                case 2:
                    conta.listTransacao.addAll(conta.cadastrarRecebimento());
                    break;
                case 3:
                    conta.retornarSaldo();
                    break;
                case 4:
                    // Inicializar a classe Extrato (se necessário)
                     Extrato extrato = new Extrato();
                     extrato.gerarExtrato(conta.listTransacao);
                    break;
                default:
                    System.out.println("Valor inválido");
                    break;
            }

            // Atualizar o índice da entrada do usuário
            indiceEntrada++;

        }
        assertEquals(indiceEsperado, indiceEntrada);

    }
}


