public class Banco {
    public static void main(String[] args) {
        Fila f;
        int e;
        f = new Fila();

        f.inserir(176);
        f.inserir(914);
        f.inserir(12);
        f.inserir(1817);
        f.inserir(100);

        System.out.println("Bem vindos ao banco IsiBank!");
        System.out.println("--------Atendimento--------");
        while (!f.isEmpty()) {
            e = f.retirar();
            System.out.println("Senha a ser atendida no guichê: " + e);
        }
    }
}
