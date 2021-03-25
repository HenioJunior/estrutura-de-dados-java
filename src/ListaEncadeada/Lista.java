package ListaEncadeada;

public class Lista {

    private Caixinha inicio;

    //Criando a lista vazia
    public Lista() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        //Tenho que criar uma nova caixinha
        Caixinha nova = new Caixinha();
        nova.setElemento(elemento); //Inseri o elemento na caixinha;
        nova.setProximo(null);      //Depois dela não vem ninguem

        if(inicio == null) {        //Vai ser a primeira caixinha?
            inicio = nova;
        }
        else{
            Caixinha aux;
            aux = inicio;
            while(aux.getProximo() !=null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }

    public int retirar() {
        //Este método considera que a lista sempre tem elementos;
        //Alguem na aplicação precisa(antes de remover), testar se a lista não esta vazia;
        Caixinha aux = inicio;
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
    }

   public void listar() {
        if(inicio == null) {
            System.out.println("Nada a exibir - a lista esta vazia!");
        }
        else{
            Caixinha aux = inicio;
            while (aux != null) {
                System.out.println("Elemento localizado " + aux.getElemento());
                aux = aux.getProximo();
            }
        }
   }
   public boolean isEmpty() {
        return this.inicio == null;
   }
}
