package br.com.atividade;

import br.com.atividade.conta.Conta;
import br.com.atividade.conta.Extrato;
import br.com.atividade.login.LoginValidator;

import java.util.HashSet;
import java.util.Scanner;

public class main {

        public static void main (String[] args ) {


            Scanner input = new Scanner(System.in);

            LoginValidator loginValidator = new LoginValidator();

            LoginValidator.main(args);

            System.out.println("\n\n==================== "+ loginValidator.getUsuario() + " ====================");


            System.out.println("\n\n==================== Menu ====================");

            boolean i = true;
            Conta conta = new Conta();
            conta.listTransacao = new HashSet<>();
            do {

                System.out.println("\n 1 - Cadastrar Dividas \n 2 - Cadastrar Recebimento \n 3 - Retornar Saldo \n 4 - Exibir Extrato");
                int resposta = Integer.parseInt(input.nextLine());

                // inicio operações conta

                switch (resposta) {
                    case 1:
                        conta.listTransacao.addAll(conta.cadastarDividas());
                        break;
                    case 2:
                        conta.listTransacao.addAll(conta.cadastrarRecebimento());
                        break;
                    case 3:
                        conta.retornarSaldo();
                        break;
                    case 4:
                        // inicio operação de extrato
                        Extrato extrato = new Extrato();
                        extrato.gerarExtrato(conta.listTransacao);
                        i = false;
                        break;
                    default:
                        System.out.println("Valor inválido");
                        i = false;
                        break;
                }

            }while (i);

    }


}

