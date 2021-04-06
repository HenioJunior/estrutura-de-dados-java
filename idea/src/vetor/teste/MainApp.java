package vetor.teste;

import vetor.Vetor;

    public class MainApp {
        public static void main(String[] args) {
            Vetor vetor = new Vetor(10);

    //        try {
    //            vetor.adiciona(11);
    //            vetor.adiciona(2);
    //            vetor.adiciona(20);
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //        }

            vetor.adiciona(11);
            vetor.adiciona(2);
            vetor.adiciona(20);

            System.out.println(vetor.busca(14));

            System.out.println("Tamanho: " + vetor.tamanho());
            System.out.println(vetor);
        }
    }
