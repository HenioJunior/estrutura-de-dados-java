package vetores;

    public class VetorNaoOrdenado {

        private int vetor[] = {11,12,23,27,33,43,56,76,87,96};
        private int posicaoAtual = -1;
        private int capacidade = 10;


        public void insere (int elemento) {
            if(posicaoAtual == capacidade - 1) {
                System.out.println("Capacidade máxima atingida");
            } else {
                posicaoAtual ++;
                vetor[posicaoAtual] = elemento;
            }
        }

        public int pesquisar(int elemento) {
            int pos;

//            if (isEmpty()) {
//                System.out.println("O vetor está vazio");
//            }
//            else {
                for (pos = 0; pos < vetor.length; pos++) {
                    if (elemento == vetor[pos]) {

                        return pos;
                    }

                }
//              }

            return -1;
        }

        public boolean isEmpty() {
            return (posicaoAtual == -1);
        }

        public void imprime() {
            if(posicaoAtual == -1) {
                System.out.println("O vetor esta vazio");
            }
            for(int i = 0 ; i < vetor.length; i++) {
                System.out.println(i+" - "+vetor[i]);
            }
        }
    }
