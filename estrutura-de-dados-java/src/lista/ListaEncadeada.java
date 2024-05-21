package lista;

import java.util.Objects;

public class ListaEncadeada<T> {

    private int elemento;
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    private final int NAO_ENCONTRADO = -1;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if(this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if(tamanho == 0) {
            inicio = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        }
        tamanho++;
    }

    public void adiciona(int posicao, T elemento) {
        if(posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if(posicao == 0) {
            adicionaInicio(elemento);
        } else if(posicao == tamanho) {
            adiciona(elemento);
        } else {
            No<T> noAnterior = buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No(elemento, proximoNo);
            noAnterior.setProximo(novoNo);
            tamanho++;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void limpa() {
       for(No<T> atual = this.inicio; atual != null;) {
           No<T> proximo = atual.getProximo();
           atual.setElemento(null);
           atual.setProximo(null);
           atual = proximo;
       }
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaNo(int posicao) {
        if(!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }
        No<T> noAtual = this.inicio;
        for(int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;
        while(noAtual != null){
            if(noAtual.getElemento().equals(elemento)) {
                return pos;
            }
            pos++;
            noAtual = noAtual.getProximo();
        }
        return NAO_ENCONTRADO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListaEncadeada<?> that = (ListaEncadeada<?>) o;
        return elemento == that.elemento && tamanho == that.tamanho && Objects.equals(inicio, that.inicio) && Objects.equals(ultimo, that.ultimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elemento, inicio, ultimo, tamanho);
    }

    @Override
    public String toString() {
        if(this.tamanho == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        No<T> atual = this.inicio;
        builder.append("[");
        for(int i = 0; i < this.tamanho -1; i++) {
            builder.append(atual.getElemento()).append(", ");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}
