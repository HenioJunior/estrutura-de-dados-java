import java.util.Scanner;

/*
como invocar o MainApp?

java MainApp [tamanhoDoVetorASerCriado] [qualAlgoritmo] < arquivoComDadosDoVetor > arquivoDeSaida

qual o algoritmo? 1 - BubbleSort e 2 - SelectionSort

java GeradorAoContrario 100000 > piorCaso100.txt

Comando usando o time:

time java MainApp 50000 1 < piorCaso.txt > saidaBubble.txt

*/
public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[Integer.parseInt(args[0])];
        int opcao = Integer.parseInt(args[1]);

        for(int i=0; i<vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
                       
        AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
        alg.setVetor(vetor);
        if(opcao == 1) {
            alg.bubbleSort();
        }
        else if(opcao==2) {
            alg.selectionSort();
        }
       alg.mostraVetor();
    }
}
