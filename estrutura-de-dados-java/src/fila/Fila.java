package fila;

import base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

//    public boolean enfileira(T elemento) {
//        super.adiciona(elemento);
//        return false;
//    }

    public void enfileira(T elemento) {
//        elementos[tamanho] = elemento;
//        tamanho ++;

//        elementos[tamanho++] = elemento;
        adiciona(elemento);

    }

    public T espiar() {

        if(estaVazia()) {
            return null;
        }
        return elementos[0];
    }

    public T desenfilerar() {

        final int POS = 0;

        if(estaVazia()) {
            return null;
        }
      T elementoASerRemovido = elementos[POS];
        remove(POS);
        return elementoASerRemovido;
    }
}
