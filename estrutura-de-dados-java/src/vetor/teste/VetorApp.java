package vetor.teste;

import vetor.VetorObjetos;

public class VetorApp {
        public static void main(String[] args) {
//            Vetor vetor = new Vetor(3);
            VetorObjetos vetor = new VetorObjetos(3);

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



//        try {
//            vetor.adiciona(11);
//            vetor.adiciona(2);
//            vetor.adiciona(20);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

            //----------------------------Tamanho-----------
//            System.out.println("Tamanho = " + vetor.tamanho());

            //----------------------------Adiciona----------
//            vetor.adiciona(2);
//            vetor.adiciona(3);
//            vetor.adiciona(5);
//            vetor.adiciona(6);
//            vetor.adiciona(7);


//            System.out.println("Tamanho: " + vetor.tamanho());
//            System.out.println(vetor);

//            vetor.adiciona(0, 1);
//            vetor.adiciona(3, 4);
//
//            System.out.println(vetor);
//            System.out.println("-------------------------");

            //----------------------------Remove-----------
//            vetor.remove(0);
//            vetor.remove(3);
//            vetor.remove(1);
//            vetor.removeElemento(2);
//            vetor.removeElemento(5);
//            vetor.removeElemento(7);

        }
    }
