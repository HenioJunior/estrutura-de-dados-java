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








}
