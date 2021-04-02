package vetores;

import java.lang.reflect.Array;
import java.util.Scanner;

    public class MainApp {

        public static void main(String[] args) {
            VetorNaoOrdenado vet = new VetorNaoOrdenado();
            Scanner sc = new Scanner(System.in);
            int valor, pos;

            do {
                System.out.println("----Digite um valor a ser pesquisado(-1 para encerrar): ");
                valor = sc.nextInt();
                if(valor != -1) {
                    System.out.println(">> Busca Sequencial");
                    pos =  vet.pesquisar(valor);
                    System.out.println("Posição do elemento " +valor +" = " + pos);
                }


            } while(valor != -1 );
        }
    }
