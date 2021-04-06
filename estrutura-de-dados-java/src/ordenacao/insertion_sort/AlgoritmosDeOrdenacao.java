package ordenacao.insertion_sort;

public class AlgoritmosDeOrdenacao {

    int vetor[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public void insertionSort() {
        int i, j;
        int temp;

        for(i = 1; i < vetor.length; i++) {
           j = i;
           temp = vetor[i];

           while(j > 0 && (vetor[j - 1] > temp)){
               vetor[j] = vetor[j - 1];
               j--;
           }
           vetor[j] = temp;
        }
    }

    public void mostraVetor() {
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]+" ");
        }
        System.out.println("");
    }
}
