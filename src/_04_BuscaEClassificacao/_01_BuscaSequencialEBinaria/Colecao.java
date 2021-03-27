package _04_BuscaEClassificacao._01_BuscaSequencialEBinaria;

public class Colecao {
    //private int valores[] = {12,56,87,23,96,43,27,76,33,11};
    private int valores[] = {11,12,23,27,33,43,56,76,87,96};

    public int buscaSequencial(int val) {
        int iteracoes = 0;
        int pos;
        for(pos = 0 ; pos < valores.length; pos++) {
            if(val == valores[pos]) {
                System.out.println("Iterações = "+iteracoes);
                return pos; //retorno a localização onde o elemento se  encontra;
            }
            iteracoes ++;
        }
        System.out.println("Iterações = "+iteracoes);
        return -1;
    }//----------------------------------------------------------------------------buscaSequencial

    public int buscaBinaria(int val) {
        int meio, inicio, fim, iteracoes=0;
        inicio = 0;
        fim = valores.length-1;
        while(inicio <= fim) {
            iteracoes++;
            meio = (inicio + fim) / 2;
            System.out.println("DEBUG - I: "+inicio+" F: "+fim+" M: "+meio);
            if(val == valores[meio]) {
                System.out.println("Iterações = "+iteracoes);
              return meio;
            }
            else {
                if(val > valores[meio]) {
                    inicio = meio + 1;
                }
                else {
                    fim = meio - 1;
                }
            }
        }
        System.out.println("Iterações = "+iteracoes);
        return -1;
    }//-------------------------------------------------------------------------------buscaBinaria
}

//Teste
//{11,12,23,27,33,43,56,76,87,96};
//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9

//Numero escolhido? 99
//inicio      fim         meio
//     0        9            4
//     5        9            7
//     8        9            8
//     9        9            9
//     10       9