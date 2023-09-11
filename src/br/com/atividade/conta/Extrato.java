package br.com.atividade.conta;

import java.util.Objects;
import java.util.Set;

public class Extrato extends Conta {

    public Extrato () {}


    public double gerarExtrato (Set<Transacao> listTransacao) {
        System.out.println("==================== Extrato ====================");
        String simbolo = null;
        for (Transacao transacao : listTransacao) {
            if (Objects.equals(transacao.tipoTransacao, "divida")){
                simbolo = "-";
                saldo = saldo - transacao.valor - transacao.juros;
            }else if (Objects.equals(transacao.tipoTransacao, "recebimento")){
                 simbolo = "+";
                saldo = saldo + transacao.valor;
            }

            System.out.println("------------------------- saldo: "+ saldo);
            System.out.println("Saldo: "+ saldo);
            System.out.println("Data Cadastro: " + transacao.dataCadastro);
            System.out.println("Valor: "+simbolo+" " + transacao.valor);
            System.out.println("Juros: " + transacao.juros);
            System.out.println("Data de Finalização: " + transacao.dataFinalizado);
        }
        return saldo;

    }
    public void gerarPDF () {}
    public void imprimir () {}

}

