package pilha;

import base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo() {
        if(estaVazia()) {
            return null;
        }
        return this.elementos[tamanho - 1];
    }

    public T desempilha() {
        if(estaVazia()) {
            return null;
        }
//        T elemento = elementos[tamanho - 1];
//        tamanho --;
//
//        return elemento;

        return elementos[--tamanho];
    }
}
