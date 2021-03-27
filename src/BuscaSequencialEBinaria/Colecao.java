package BuscaSequencialEBinaria;

public class Colecao {
    private int valores[] = {12,56,87,23,96,43,27,76,33,11};

    public int buscaSequencial(int val) {
        int pos;
        for(pos = 0 ; pos < valores.length; pos++) {
            if(val == valores[pos]) {
                return pos; //retorno a localização onde o elemento se  encontra;
            }
        }
        return -1;
    }
}
