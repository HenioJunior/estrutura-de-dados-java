package fila.teste;

import fila.Fila;

public class FilaApp {

    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar());

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());

        fila.desenfilerar();
        fila.desenfilerar();
        fila.desenfilerar();

        System.out.println(fila.espiar());

        System.out.println(fila.toString());

    }
}
