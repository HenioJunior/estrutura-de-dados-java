package ordenacao.merge_sort;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int v[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int auxiliar[] = new int[v.length];

        mergeSort(v, auxiliar, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }

    private static void mergeSort(int[] v, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, auxiliar, inicio, meio);
            mergeSort(v, auxiliar, meio + 1, fim);
            intercalar(v, auxiliar, inicio, meio, fim);
        }
    }

    private static void intercalar(int[] v, int[] auxiliar, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            auxiliar[k] = v[k];
        }

        int i = inicio;
        int j = meio + 1;

        for (int k = inicio; k <= fim; k++) {
            if (i > meio) {
                v[k] = auxiliar[j++];
            } else if (j > fim) {
                v[k] = auxiliar[i++];
            } else if (auxiliar[i] < auxiliar[j]) {
                v[k] = auxiliar[i++];
            } else {
                v[k] = auxiliar[j++];
            }
        }
    }
}