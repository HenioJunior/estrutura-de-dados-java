package vetor;

public class VetorOrdenado {

    private int capacidade, posicao, i, x;
    private int ultimaPosicao = 0;
    private int[] valores;

    public VetorOrdenado(int capacidade) {
        this.valores = new int[capacidade];
        this.ultimaPosicao = -1;
    }

    public int getUltimaPosicao() {
        return ultimaPosicao;
    }

    public boolean isEmpty() {
        return ultimaPosicao == -1;
    }


    // O(n)
    public void imprime() {
        if(isEmpty()) {
            System.out.println("O vetor esta vazio");
        }
        for(i = 0; i <= ultimaPosicao; i++) {
            System.out.println(i + " - " + valores[i]);
        }
    }

    // O(n)
    public void insere(int valor) {
        if(ultimaPosicao == capacidade -1) {
            System.out.println("Capacidade máxima atingida");
        }
        posicao = 0;
        for(i = 0; i < ultimaPosicao + 1; i++) {
            posicao= i;
            if(valores[i] > valor) {
                break;
            }
            if(i == ultimaPosicao) {
                posicao ++;
            }
        }
        x = ultimaPosicao;
        while(x >= posicao) {
            valores[x + 1] = valores[x];
            x--;
        }
        valores[posicao] = valor;
        ultimaPosicao++;
    }

    // O(n)
    public int pesquisaLinear(int valor) {
        for(i = 0; i < ultimaPosicao; i++) {
            if (valores[i] > valor) {
                return -1;
            }
            if(valores[i] == valor) {
                return i;
            }
            if(i == ultimaPosicao) {
                return -1;
            }
        }
        return -1;
    }

    // 0(n)
    public int pesquisaBinaria(int valor) {
        int limiteInferior = 0;
        int limiteSuperior = ultimaPosicao;

        while(true) {
            int posicaoAtual = (limiteInferior + limiteSuperior) / 2;
             //Se achou na primeira tentativa
            if(valores[posicaoAtual] == valor) {
                return posicaoAtual;
            } else if(limiteInferior > limiteSuperior) { //Se não achou
                return -1;
                //Divide os limites
                //Limite inferior
            }else if(valores[posicaoAtual] < valor) {
                    limiteInferior = posicaoAtual + 1;
                    //Limite superior
                } else {
                    limiteSuperior = posicaoAtual -1;
                }
            }
        }

    public void excluir(int valor) {
        int posicao = pesquisaLinear(valor);
        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        } else {
            for(i = posicao; i < ultimaPosicao; i++) {
                valores[i] = valores[i + 1];
            }
            ultimaPosicao--;
        }
    }
}
