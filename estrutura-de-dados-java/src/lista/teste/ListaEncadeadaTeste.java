package lista.teste;

import lista.ListaEncadeada;

public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        //testesIniciais();
        //adicionaInicio();
        adicionaPosicao();


    }

    public static void adicionaPosicao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        //lista.adiciona(-1, 1);
        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(4);// 1, 2, 4

        lista.adiciona(0, 0);// 0, 1, 2, 4
        lista.adiciona(4, 5);// 0, 1, 2, 4, 5
        lista.adiciona(2, 3);

        System.out.println(lista);
    }

    public static void adicionaInicio() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.adicionaInicio(3);
        lista.adicionaInicio(2);
        lista.adicionaInicio(1);

        System.out.println(lista);
    }

    public static void testesIniciais() {
        ListaEncadeada<Integer> lista = new ListaEncadeada();

        lista.adiciona(1);
        System.out.println(lista);
        lista.adiciona(2);
        System.out.println(lista);
        lista.adiciona(3);
        System.out.println(lista);

        //lista.limpa();
        //System.out.println(lista);

        //Busca por elemento
        System.out.println("******* busca por elemento");
        System.out.println(lista.busca(0));
        System.out.println(lista.busca(1));
        System.out.println(lista.busca(2));
        System.out.println(lista.busca(3));

        //Busca por posicao
        System.out.println("******* busca por posição");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        System.out.println(lista.buscaPorPosicao(-1));
        System.out.println(lista.buscaPorPosicao(4));

    }
}
