package vetor;

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

        public void imprime() {
            for(int i = 0; i <= ultimaPosicao; i++) {
                System.out.println("Elemento [" + i + "]" + " - " + elementos[i]);
            }
        }
    }
