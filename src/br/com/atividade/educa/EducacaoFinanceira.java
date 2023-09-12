package br.com.atividade.educa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class EducacaoFinanceira {

    List<Canal> canais = new ArrayList<>();

    // Construtor vazio
    public EducacaoFinanceira() {    }


    public void listarDeVideos() {
        Scanner input = new Scanner(System.in);
        EducacaoFinanceira educacaoF = new EducacaoFinanceira();

        int idMax = 4;
        String resposta = null;
        int i = 1;


        do {
            i = educacaoF.mockupCanal(idMax, i);
            if (i != -1){
                System.out.print(" \n S - Sim \n n - não\nDeseja ver mais canais?");
                resposta = input.nextLine();
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
    }
    public int verMais(List<Canal> listaDeCanais, int idMaximo, int i) {
        for (Canal canal : listaDeCanais) {
            if ( canal.idCanal > (idMaximo - 4) && canal.idCanal < idMaximo){
                canal.exibirInformacoes();
                i++;
            }
        }
        return i;
    }

    public int mockupCanal(int max, int i) {
        // Crie uma lista para armazenar os canais
        List<Canal> listaCanais = new ArrayList<>();

        // Adicione canais à lista
        listaCanais.add(new Canal(1, "Canal A", "https://www.youtube.com/c/CanalA", "Um canal de entretenimento."));
        listaCanais.add(new Canal(2, "Canal B", "https://www.youtube.com/c/CanalB", "Um canal de tutoriais."));
        listaCanais.add(new Canal(3, "Canal C", "https://www.youtube.com/c/CanalC", "Um canal de viagens."));
        listaCanais.add(new Canal(4, "Canal D", "https://www.youtube.com/c/CanalD", "Um canal de música."));
        listaCanais.add(new Canal(5, "Canal E", "https://www.youtube.com/c/CanalE", "Um canal de culinária."));
        listaCanais.add(new Canal(6, "Canal F", "https://www.youtube.com/c/CanalF", "Um canal de tecnologia."));
        listaCanais.add(new Canal(7, "Canal G", "https://www.youtube.com/c/CanalG", "Um canal de esportes."));
        listaCanais.add(new Canal(8, "Canal H", "https://www.youtube.com/c/CanalH", "Um canal de comédia."));
        listaCanais.add(new Canal(9, "Canal I", "https://www.youtube.com/c/CanalI", "Um canal de notícias."));
        listaCanais.add(new Canal(10, "Canal J", "https://www.youtube.com/c/CanalJ", "Um canal de educação."));
        listaCanais.add(new Canal(11, "Canal K", "https://www.youtube.com/c/CanalK", "Um canal de beleza."));
        listaCanais.add(new Canal(12, "Canal L", "https://www.youtube.com/c/CanalL", "Um canal de história."));
        listaCanais.add(new Canal(13, "Canal M", "https://www.youtube.com/c/CanalM", "Um canal de fitness."));
        listaCanais.add(new Canal(14, "Canal N", "https://www.youtube.com/c/CanalN", "Um canal de música clássica."));
        listaCanais.add(new Canal(15, "Canal O", "https://www.youtube.com/c/CanalO", "Um canal de cinema."));
        listaCanais.add(new Canal(16, "Canal P", "https://www.youtube.com/c/CanalP", "Um canal de animais."));


        i = verMais(listaCanais, max, i);

        if (listaCanais.size() == i){
            System.out.println("FIM");
            return -1;
        }
        return i;
    }


    public void adicionarCanal() {
        Canal adCanal = new Canal(5, "Canal E", "https://www.youtube.com/c/CanalE", "Um canal de culinária");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EducacaoFinanceira educacaoF = new EducacaoFinanceira();


        System.out.print(" \n 1 - listar videos \n 2 - sair\nDeseja ver mais canais?");
        String resposta = input.nextLine();
        if (Objects.equals(resposta, "1")){
            educacaoF.listarDeVideos();
        }

    }


}

class Canal {
    int idCanal;
    String nomeCanal;
    String url;
    String descricaoCanal;


    // Construtor da classe
    public Canal( int idCanal, String nomeCanal, String url, String descricaoCanal) {
        this.idCanal = idCanal;
        this.nomeCanal = nomeCanal;
        this.url = url;
        this.descricaoCanal = descricaoCanal;
    }

    public void exibirInformacoes() {
        System.out.println("\n==================== Código do Canal: " + idCanal+ " ====================");
        System.out.println("Nome: " + nomeCanal);
        System.out.println("URL: " + url);
        System.out.println("Descrição: " + descricaoCanal);
        System.out.println();
    }

}
