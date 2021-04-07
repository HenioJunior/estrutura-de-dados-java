package vetor.teste;

import vetor.Lista;

public class ListaApp {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista(10);

        Contato c1 = new Contato("Contato1", "1234567", "contato1@email.com");
        Contato c2 = new Contato("Contato2", "2234567", "contato2@email.com");
        Contato c3 = new Contato("Contato3", "3234567", "contato3@email.com");

        Contato c4 = new Contato("Contato1", "1234567", "contato1@email.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println(vetor);
        System.out.println("-------------------------");

        System.out.println("Tamanho = " + vetor.tamanho());
        System.out.println("-------------------------");

        int pos = vetor.busca(c4);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento ñ existe no vetor");
        }
        System.out.println("-------------------------");

    }
}
