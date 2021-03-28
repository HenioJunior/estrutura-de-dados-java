public class Pilha {
    private int valores[];
    private int topo;

    public Pilha() {
        valores = new int[10];
        topo = -1;
    }

    public void push(int elemento) {
        topo++;
        valores[topo] = elemento;
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
        return (topo == 9);
    }

    public int pop() {
        int elem = valores[topo];
        topo--;
        return elem;
    }
}
