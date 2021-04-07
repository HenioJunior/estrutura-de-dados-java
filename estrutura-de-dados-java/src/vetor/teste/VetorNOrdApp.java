package vetor.teste;

import vetor.arquivo.VetorNaoOrdenado;

public class VetorNOrdApp {

    public static void main(String[] args) {
        VetorNaoOrdenado vetor = new VetorNaoOrdenado(5);

        vetor.imprime();
        vetor.insere(2);
        vetor.insere(3);
        vetor.insere(5);
        vetor.insere(8);
        vetor.insere(1);
        vetor.imprime();

        System.out.println("Utima posição---------------------------");
        System.out.println(vetor.getUltimaPosicao());


        System.out.println("Pesquisa--------------------------------");
        System.out.println(vetor.pesquisar(100));

        System.out.println("Excluir---------------------------------");
        vetor.excluir(5);
        vetor.excluir(2);
        vetor.excluir(1);
        vetor.imprime();

        System.out.println("Inserir----------------------------------");
        vetor.insere(5);
        vetor.insere(1);


        System.out.println("Imprimir-----------------------------------");
        vetor.imprime();

    }
}
