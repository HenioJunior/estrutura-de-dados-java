public class DoubleNode {
    private int elemento;
    private DoubleNode anterior;
    private DoubleNode proximo;

    public int getElemento() {
        return elemento;
    }

    public DoubleNode getAnterior() {
        return anterior;
    }

    public DoubleNode getProximo() {
        return proximo;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setAnterior(DoubleNode anterior) {
        this.anterior = anterior;
    }

    public void setProximo(DoubleNode proximo) {
        this.proximo = proximo;
    }
}
