public class ListaSimples {

    private Node primeiro;
    private Node ultimo;
    private int quantNode;

    public ListaSimples() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantNode = 0;
    } //------------------------------------------------------------------------------------------------------Construtor

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
    }//-----------------------------------------------------------------------------------------------------------------

    public void inserirPrimeiro(Pessoa p) {
        Node novoNode = new Node (p);
        if(this.eVazia()) {
            this.ultimo = novoNode;
        }
        novoNode.setProximo(this.primeiro);
        this.primeiro = novoNode;
        this.quantNode++;

    }//--------------------------------------------------------------------------------------------------inserirPrimeiro

    public void inserirUltimo(Pessoa p) {
        Node novoNode = new Node (p);
        if(this.eVazia()) {
            this.primeiro = novoNode;
        }
        else {
            this.ultimo.setProximo(novoNode);
        }
        this.ultimo = novoNode;
        this.quantNode++;

    }//----------------------------------------------------------------------------------------------------inserirUltimo

    public boolean removerNode (String nome) {
        Node atual = this.primeiro;
        Node anterior = null;
        if(eVazia()) {
            return false;
        }
        else {
            while((atual != null) && (!atual.getP().getNome().equals(nome))) {
                anterior = atual;
                atual = atual.getProximo();
            }
            if(atual == this.primeiro) {
                if(this.primeiro == this.ultimo) {
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProximo();
            }
            else {
                if(atual == this.ultimo) {
                    this.ultimo = anterior;
                }
                anterior.setProximo(atual.getProximo());
            }
            this.quantNode--;
            return true;
        }

    }//------------------------------------------------------------------------------------------------------removerNode

    public String pesquisarNode (String nome) {
        String msg ="";
        Node atual = this.primeiro;
        while((atual != null) && (!atual.getP().getNome().equals(nome))) {
            atual = atual.getProximo();
        }
        return msg = "Nome: " + atual.getP().getNome() + "\n" +
                     "Sexo: " + atual.getP().getSexo() + "\n" +
                     "Idade: " + atual.getP().getIdade();
    }//----------------------------------------------------------------------------------------------------pesquisarNode

    public String imprimirLista() {
        String msg = "";
        if(eVazia()) {
            msg = "A lista está vazia!";
        }
        else {
            Node atual = this.primeiro;
            while( atual != null) {
                msg += atual.getP().getNome() + " -> ";
                atual = atual.getProximo();
            }
        }
        return msg;
    }//----------------------------------------------------------------------------------------------------imprimirLista

    public boolean eVazia() {
        return (this.primeiro == null);
    }//-----------------------------------------------------------------------------------------------------------eVazia
}
