public class ListaDuplaCircular {

    private DoubleNode inicio;

    public ListaDuplaCircular() {
        inicio = null;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void inserir(int elemento) {
        DoubleNode novo = new DoubleNode();
        novo.setElemento(elemento);
        if(isEmpty()){
            novo.setProximo(novo);
            novo.setAnterior(novo);
            inicio = novo;
        }
        else {
            DoubleNode tmp = inicio;
            while(tmp.getProximo() != inicio) {
                tmp = tmp.getProximo();
            }
            inicio.setAnterior(novo);
            tmp.setProximo(novo);
            novo.setAnterior(tmp);
            novo.setProximo(inicio);
        }
    }

    public void exibirNaOrdem() {
        DoubleNode tmp;
        tmp = inicio;
        do {
            System.out.println("Elemento da lista = " + tmp.getElemento());
            tmp = tmp.getProximo();

        } while(tmp != inicio);
    }

    public void exibirNaOrdemInversa() {
        DoubleNode tmp;
        tmp = inicio;
        do {
            System.out.println("Elemento da lista = " + tmp.getElemento());
            tmp = tmp.getAnterior();

        } while(tmp != inicio);
    }


}

//O próximo elemento do último é o início
//Enquanto o próximo elemento do node não for o inicio eu vou ter ir para o próximo...
