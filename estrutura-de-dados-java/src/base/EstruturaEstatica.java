package base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;


    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[])new Object[capacidade]; //Solução do livro Effective Java
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    protected boolean adiciona(T elemento) {
        aumentaCapacidade();
        if(tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    //0 1 2 3 4 5 6 => tamanho = 5
    //B C E F G + +
    protected boolean adiciona(int posicao, T elemento) {
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        aumentaCapacidade();
        //mover todos os elementos
        for(int i=tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        elementos[posicao] = elemento;
        tamanho++;

        return false;
    }

    public void remove(int posicao) {
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i < tamanho; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
    }

    private void aumentaCapacidade() {
        if(tamanho == elementos.length) {
            T[] elementosNovos = (T[])new Object[elementos.length * 2];
            for (int i = 0 ; i < tamanho; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("[");

        for(int i = 0; i < tamanho - 1; i++) {
            s.append(elementos[i]);
            s.append(", ");
        }

        if(this.tamanho >0) {
            s.append(elementos[tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
