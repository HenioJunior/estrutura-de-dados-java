package ordenacao.selection_sort;

public class AlgoritmosDeOrdenacao {

    int vetor[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public void selectionSort() {
        int it, j;
        int indexMin;
        int aux;

        for(it = 0; it < vetor.length - 1; it++) {
            indexMin = it;
            for(j = it; j < vetor.length; j++) {
                if(vetor[j] < vetor[indexMin]) {
                    indexMin = j;
                }
            }
            if(it != indexMin) {
                aux = vetor[it];
                vetor[it] = vetor[indexMin];
                vetor[indexMin] = aux;
            }
        }
    }

    public void mostraVetor() {
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]+" ");
        }
        System.out.println("");
    }
}
