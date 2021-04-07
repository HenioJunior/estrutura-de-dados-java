package vetor;

import base.EstruturaEstatica;

import java.lang.reflect.Array;

public class Lista<T> extends EstruturaEstatica<T> {
    private T[] elementos;
    private int tamanho, posicao, ultimaPosicao;

    public Lista() {
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    //Opção 2
//    public VetorGenerico(int capacidade, Class<T> tipoClasse) {
//        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
//        this.tamanho = 0;
//        this.ultimaPosicao = -1;
//    }

    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }

    public T busca(int posicao) {
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {//No caso do String, não podemos usar o comparador ==. Usaremos o método equals.
        for(int i = 0; i < tamanho; i++) {
            if(elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    //B G D E F -> posição a ser removida 1
    //0 1 2 3 4 -> tamanho = 5
    //vetor[1] = vetor[2];
    //vetor[2] = vetor[3];
    //vetor[3] = vetor[4];
    public void remove(int posicao) {
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    public void removeElemento(T elemento) {
        int pos = busca(elemento);
        if(pos > -1) {
            remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
    }
}
