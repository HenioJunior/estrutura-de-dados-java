package vetor;

public class VetorNaoOrdenado {
    private int capacidade, i;
    private int ultimaPosicao = 0;
    private int[] valores;

    public VetorNaoOrdenado(int capacidade) {
        this.valores = new int[capacidade];
        this.ultimaPosicao = -1;
    }

    public int getUltimaPosicao() {
        return ultimaPosicao;
    }

    public void insere(int valor) {
        if (ultimaPosicao == capacidade) {
            System.out.println("Capacidade maxima atingida");
        }
        ultimaPosicao++;
        valores[ultimaPosicao] = valor;
    }

    public void imprime() {
        if(isEmpty()) {
            System.out.println("O vetor esta vazio");
        }
        for(i = 0; i <= ultimaPosicao; i++) {
            System.out.println(i + " - " + valores[i]);
        }
    }

    public int pesquisar(int valor) {
        for(i = 0; i <= ultimaPosicao; i++) {
            if(valor == valores[i]) {
                return i;
            }
        }
        return -1;
    }

    public void excluir(int valor) {
        int posicao = pesquisar(valor);
        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        } else {
            for(i = posicao; i < ultimaPosicao; i++) {
                valores[i] = valores[i + 1];
            }
            ultimaPosicao--;
        }
    }

    public boolean isEmpty() {
        return ultimaPosicao == -1;
    }
}
