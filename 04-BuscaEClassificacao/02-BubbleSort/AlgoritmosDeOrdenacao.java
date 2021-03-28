public class AlgoritmosDeOrdenacao {

    private int vetor[] = {25,57,48,37,12,92,33};

    public void setVetor(int vetor[]) {
        this.vetor = vetor;
    }

    public void bubleSort() {
        int it;     //numero de iteracoes
        int pos;    //sempre uso a posicao atual
        int temp;   //variavel para a troca

        System.out.println("Realizando o BubbleSort em um vetor de "+vetor.length+" elementos");

        for(it=0; it < vetor.length-1; it++) {
            for(pos = 0; pos < vetor.length - it - 1; pos++){
                //comparo o elemento da posicao com o seu proximo
                if(vetor[pos] > vetor[pos+1]){ //o elemento atual é maior que seu proximo
                    //entao troca
                    temp = vetor[pos];
                    vetor[pos] = vetor[pos + 1];
                    vetor[pos + 1] = temp;
                }
            }
            //System.out.println("------------->Final da iteração "+it);
            //mostraVetor();
        }
    }

    public void mostraVetor() {
        for(int i=0; i<vetor.length; i++) {
            System.out.println(vetor[i]+" ");
        }
        System.out.println("");
    }
}
