package vetor.teste;

import vetor.VetorOrdenado;

public class VetorOrdApp {
    public static void main(String[] args) {

        VetorOrdenado vetor = new VetorOrdenado(10);

        vetor.imprime();
        vetor.insere(8);
        vetor.insere(9);
        vetor.insere(4);
        vetor.insere(1);
        vetor.insere(5);
        vetor.insere(7);
        vetor.insere(11);
        vetor.insere(13);
        vetor.insere(2);

        vetor.imprime();

//        System.out.println("Pesquisa linear--------------");
//        System.out.println(vetor.pesquisaLinear(6));

//        System.out.println("Pesquisa binaria--------------");
//        vetor.pesquisaBinaria(7);
//        vetor.pesquisaBinaria(5);
//        vetor.pesquisaBinaria(13);
//        vetor.pesquisaBinaria(20);

        vetor.excluir(5);
        vetor.excluir(8);
        vetor.excluir(9);

        vetor.imprime();


    }
}
