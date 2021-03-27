package BuscaSequencialEBinaria;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Colecao colecao = new Colecao();
        int valor, pos;
        do {
            System.out.println("----Digite um valor a ser pesquisado(-1 para encerrar): ");
            valor = teclado.nextInt();
            if(valor != -1){
                System.out.println(">> Busca Sequencial");
                pos = colecao.buscaSequencial(valor);

                System.out.println(">> Busca Binaria");
                pos = colecao.buscaBinaria(valor);
            }

        } while (valor != -1);

//        System.out.println("-------------------Busca Sequencial------------------------");
//        System.out.println("Posição do elemento 23 = " + colecao.buscaSequencial(23));
//        System.out.println("Posição do elemento 12 = " + colecao.buscaSequencial(12));
//        System.out.println("Posição do elemento 76 = " + colecao.buscaSequencial(76));
//        System.out.println("Posição do elemento 100 = " + colecao.buscaSequencial(100));
//        System.out.println("\n\n");
//        System.out.println("-------------------Busca Binária----------------------------");
//        System.out.println("Posição do elemento 23 = " + colecao.buscaBinaria(23));
//        System.out.println("Posição do elemento 12 = " + colecao.buscaBinaria(12));
//        System.out.println("Posição do elemento 76 = " + colecao.buscaSequencial(76));
//        System.out.println("Posição do elemento 100 = " + colecao.buscaSequencial(100));
    }
}
