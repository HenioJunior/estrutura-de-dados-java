package pilha.teste;

import pilha.Pilha;

public class PilhaApp {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>();

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        //System.out.println(pilha.estaVazia());

        System.out.println(pilha.topo());

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.topo());
        System.out.println(pilha);

        System.out.println("Desempilhando o elemento " + pilha.desempilha());

        System.out.println(pilha);



    }
}
