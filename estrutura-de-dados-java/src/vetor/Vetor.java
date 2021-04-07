package vetor;

import java.util.Arrays;

public class Vetor {

        private int[] elementos;
        private int tamanho, posicao, ultimaPosicao;

        public Vetor(int capacidade) {
            this.elementos = new int[capacidade];
            this.tamanho = 0;
            this.ultimaPosicao = -1;

        }

        public int tamanho() {
            return tamanho;
        }

//        public void adiciona (int elemento) {
//            for(int i = 0; i < elementos.length; i++) {
//                if(elementos[i] == 0) {
//                    elementos[i] = elemento;
//                    break;
//                }
//            }
//        }

//        public void adiciona(int elemento) throws Exception {
//            if(tamanho < elementos.length) {
//                elementos[tamanho] = elemento;
//                tamanho++;
//            } else {
//                throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//            }
//        }

        public boolean adiciona(int elemento) {
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
        public boolean adiciona(int posicao, int elemento) {
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
                int[] elementosNovos = new int[elementos.length * 2];
                for (int i = 0 ; i < tamanho; i++) {
                    elementosNovos[i] = elementos[i];
                }
                elementos = elementosNovos;
            }
        }

        public int busca(int posicao) {
            if(!(posicao >=0 && posicao < tamanho)) {
                throw new IllegalArgumentException("Posição inválida");
            }
            return this.elementos[posicao];
        }

    public int buscaElemento(int elemento) {//No caso do String, não podemos usar o comparador ==. Usaremos o método equals.
       for(int i = 0; i < tamanho; i++) {
           if(elementos[i] == elemento) {
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

    public void removeElemento(int elemento) {
            int pos = buscaElemento(elemento);
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

    public void adicionaOrdenado(int elemento) {
            if(ultimaPosicao == elementos.length - 1) {
                System.out.println("Capacidade máxima atingida");
            }
                posicao = 0;
                for(int i = 0; i <= ultimaPosicao; i++) {
                    posicao = i;
                    if(elementos[i] > elemento) {
                        break;
                    }
                    if(i == ultimaPosicao) {
                        posicao ++;
                    }
                }
                int x = ultimaPosicao;
                while(x >= posicao) {
                    elementos[x+1] = elementos[x];
                    x--;
                }
                elementos[posicao] = elemento;
                ultimaPosicao ++;
        }
    }
