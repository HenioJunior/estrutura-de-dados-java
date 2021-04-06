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
            if(tamanho < elementos.length) {
                elementos[tamanho] = elemento;
                tamanho++;
                return true;
            }
            return false;
        }

//        public int busca(int posicao) {
//            if(!(posicao >=0 && posicao < tamanho)) {
//                throw new IllegalArgumentException("Posição inválida");
//            }
//            return this.elementos[posicao];
//        }
//
//        public int tamanho() {
//            return tamanho;
//        }

    public int busca(int elemento) {//No caso do String, não podemos usar o comparador ==. Usaremos o método equals.
       for(int i = 0; i < tamanho; i++) {
           if(elementos[i] == elemento) {
               return i;
           }
       }
       return -1;
    }

    public int tamanho() {
        return tamanho;
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
