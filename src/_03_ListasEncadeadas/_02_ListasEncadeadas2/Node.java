package _03_ListasEncadeadas._02_ListasEncadeadas2;

public class Node {

    private Pessoa p;
    private Node proximo;

    public Node (Pessoa pe) {
        this.p = pe;
        this.proximo = null;
    }//------------------------ Construtor

    public Pessoa getP() {
        return p;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
