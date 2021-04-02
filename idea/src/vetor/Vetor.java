package vetor;

    public class Vetor {

        private int[] elementos;
        private int tamanho;

        public Vetor(int capacidade) {
            this.elementos = new int[capacidade];
            this.tamanho = 0;
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
    }
