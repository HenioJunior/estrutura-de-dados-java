package vetor.arquivo;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho, posicao, ultimaPosicao;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.ultimaPosicao = -1;

    }

    public int tamanho() {
        return tamanho;
    }

    public boolean adiciona(Object elemento) {
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
    public boolean adiciona(int posicao, Object elemento) {
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

    private void aumentaCapacidade() {
        if(tamanho == elementos.length) {
            Object[] elementosNovos = new Object[elementos.length * 2];
            for (int i = 0 ; i < tamanho; i++) {
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    public Object busca(int posicao) {
        if(!(posicao >=0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int busca(Object elemento) {//No caso do String, não podemos usar o comparador ==. Usaremos o método equals.
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

    public void removeElemento(Object elemento) {
        int pos = busca(elemento);
        if(pos > -1) {
            remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor");
        }
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
