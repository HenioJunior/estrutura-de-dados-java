package ordenacao.bubble_sort;

public class AlgoritmosDeOrdenacao {

    private int vetor[] = {25,57,48,37,12,92,33};

    public void bubbleSort() {
        int it;     //numero de iteracoes
        int pos;    //sempre uso a posicao atual
        int temp;   //variavel para a troca

        for(it = 0; it < vetor.length; it++) {
            for (pos=0; pos < vetor.length; pos++){
                if(vetor[pos] > vetor[pos + 1]) {
                    temp = vetor[pos];
                    vetor[pos] = vetor[pos + 1];
                    vetor[pos + 1] = temp;
                }
            }
        }
        for (pos=0; pos < vetor.length; pos++){
            System.out.println(vetor[pos]);
        }



   }


}
