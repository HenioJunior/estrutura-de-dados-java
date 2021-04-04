package ordenacao.merge_sort;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int v[] = {38, 27, 43, 3, 9, 82, 10};


        System.out.println(Arrays.toString(v));
        mergeSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void mergeSort(int[] vetor) {

        int len = vetor.length;


        if (len > 1) {
            int divisao = vetor.length / 2;
            int esquerda[] = Arrays.copyOfRange(vetor, 0, divisao);
            int direita[] = Arrays.copyOfRange(vetor, divisao, vetor.length);

            mergeSort(esquerda);
            mergeSort(direita);

            int i = 0;
            int j = 0;
            int k = 0;

            // Ordena esquerda e direita
            while(i < esquerda.length && j < direita.length) {
                if(esquerda[i] < direita[j]) {
                    vetor[k] = esquerda[i];
                    i += 1;
                }
                else {
                    vetor[k] = direita[j];
                    j += 1;
                }
                k += 1;
            }
            //Ordenação final
            while(i < esquerda.length) {
                vetor[k] = esquerda[i];
                i += 1;
                k += 1;
            }

            while(j < direita.length) {
                vetor[k] = direita[j];
                j += 1;
                k += 1;
            }
        }
    }
}