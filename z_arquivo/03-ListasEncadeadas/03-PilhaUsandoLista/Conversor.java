public class Conversor {

    public static void main(String[] args) {

        int numero = 172;
        //int numero = Integer.parseInt(args[0]);
        PilhaDinamica p = new PilhaDinamica();
        int resto;

        //fase 1 = empilhamentos dos restos;
        while (numero != 0) {
            resto = numero % 2;     //pego o resto da divisão deste número por 2( vale 0 ou 1)
            p.push(resto);          //armazeno na pilha
            numero = numero / 2;    //gero um novo número, resultado da divisão dele por 2;
        }

        //fase 2 = exibição dos restos;
        while (!p.isEmpty()) {
            resto = p.pop();        //remove da pilha(sempre o elemento que está no topo);
            System.out.print(resto);
        }
        System.out.print("\nFim do programa");
    }
}

//(172)10 -> (10101100)2
