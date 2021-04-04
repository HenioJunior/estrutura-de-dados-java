package vetor.teste;

import vetor.Vetor;

public class MainApp2 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

//        try {
//            vetor.adiciona(11);
//            vetor.adiciona(2);
//            vetor.adiciona(20);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        vetor.adicionaOrdenado(6);
        vetor.adicionaOrdenado(4);
        vetor.adicionaOrdenado(3);
        vetor.adicionaOrdenado(5);
        vetor.adicionaOrdenado(1);
        vetor.adicionaOrdenado(8);

        vetor.imprime();


    }
}
