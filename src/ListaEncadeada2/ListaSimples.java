package ListaEncadeada2;

public class ListaSimples {

    private Node primeiro;
    private Node ultimo;
    private int quantNode;

    public ListaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantNode = 0;
    } //--------------------------------------------Construtor

    public Node getPrimeiro() {
        return primeiro;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public int getQuantNode() {
        return quantNode;
    }

    public void setPrimeiro(Node primeiro) {
        this.primeiro = primeiro;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public void setQuantNode(int quantNode) {
        this.quantNode = quantNode;
    }//--------------------------------------------------------

    public void inserirPrimeiro(Pessoa p) {
        Node novoNode = new Node (p);
        if(this.eVazia()) {
            this.ultimo = novoNode;
        }
        novoNode.setProximo(this.primeiro);
        this.primeiro = novoNode;
        this.quantNode++;

    }//----------------------------------------Inserir Primeiro

    public boolean eVazia() {
        return (this.primeiro == null);
    }//--------------------------------------------------eVazia


}
