package vetor.teste;

import vetor.Vetor;

    public class VetorApp {
        public static void main(String[] args) {
            Vetor vetor = new Vetor(3);

    //        try {
    //            vetor.adiciona(11);
    //            vetor.adiciona(2);
    //            vetor.adiciona(20);
    //        } catch (Exception e) {
    //            e.printStackTrace();
    //        }

            //----------------------------Adiciona----------
            vetor.adiciona(2);
            vetor.adiciona(3);
            vetor.adiciona(5);
            vetor.adiciona(6);
            vetor.adiciona(7);


            //System.out.println(vetor.busca(14));

//            System.out.println("Tamanho: " + vetor.tamanho());
//            System.out.println(vetor);

//            vetor.adiciona(0, 1);
//            vetor.adiciona(3, 4);
//
            System.out.println(vetor);
            System.out.println("-------------------------");

            //----------------------------Remove-----------
            vetor.remove(0);
            vetor.remove(3);
            vetor.remove(1);

            System.out.println(vetor);
            System.out.println("-------------------------");
        }
    }
