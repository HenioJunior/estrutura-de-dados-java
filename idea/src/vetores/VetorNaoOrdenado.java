package vetores;

public class VetorNaoOrdenado {

        private int valores[];
        private int ultimaPosicao;

        public VetorNaoOrdenado() {
            valores = new int[10];
            int ultimaPosicao = -1;
        }

        public void imprime() {
            if(ultimaPosicao == -1) {
                System.out.println("O vetor esta vazio");
            }
            for(int i = 0 ; i < valores.length; i++) {
                System.out.println(i+" - "+valores[i]);
            }
        }
}
