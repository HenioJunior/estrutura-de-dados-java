package ListaEncadeada;

public class Caixinha {
    private int elemento;
    private Caixinha proximo;

    public int getElemento() {
        return elemento;
    }

    public Caixinha getProximo() {
        return proximo;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProximo(Caixinha proximo) {
        this.proximo = proximo;
    }
}
//------------------------------------------------------------------------------------------
// Porque?
// Não temos como saber antecipadamente o tamanho;
// Não pretendemos redimensionar o vetor
// Conseguimos alocar memória sob demanda no nosso sistema;

// Como funciona?
// Cada elemento guarda a a informação e tem uma referencia para o pŕoximo elemento;

// Classe é auto referenciável - a minha estrutura tem uma referencia cujo o proximo elemento
//é alguem do mesmo tipo que eu...

//Lista simples;
//inserir(e)
//remover(): e
//listar: String

//Estrutura lista e dentro desta, teremos outra estrutura onde teremos a estrutura...
