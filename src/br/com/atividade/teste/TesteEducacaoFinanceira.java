package br.com.atividade.teste;

import br.com.atividade.educa.EducacaoFinanceira;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import junit.framework.*;
import static org.junit.Assert.assertEquals;
public class TesteEducacaoFinanceira {

    public static void main(String[] args) {
        EducacaoFinanceira educacaoF = new EducacaoFinanceira();

        int idMax = 4;
        String resposta = "S";
        int i = 1;


        do {
            i = educacaoF.mockupCanal(idMax, i);
            if (i != -1){
                System.out.print(" \n S - Sim \n n - não\nDeseja ver mais canais?");
            }

            idMax = i + 4;
        }while (
                (
                        !Objects.equals(resposta, "N") ||
                                !Objects.equals(resposta, "n") ||
                                !Objects.equals(resposta, "não")
                ) &&
                        i != -1
        );

        int iEsperado = -1;
        assertEquals(iEsperado,i);
    }
}
