package pilha.teste;

import pilha.Pilha;

import java.util.Scanner;

public class PilhaValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<String> pilha = new Pilha<>();

        System.out.println("Digite uma expressão");
        String expressao = sc.next();

        String[] vect = expressao.split("");

        for(int i = 0 ; i < expressao.length(); i++) {
            String ch = vect[i];
            System.out.println("-->" + ch);
            if(ch.contains("{") || ch.contains("[") || ch.contains("(")) {
                pilha.empilha(ch);
            }else if (ch.contains("}") || ch.contains("]") || ch.contains(")")) {
                if(!(pilha.estaVazia())) {
                    String chx = pilha.desempilha();
                    if(ch.contains("}") && !(chx.contains("{")) || ch.contains("]") && !(chx.contains("[")) || ch.contains(")") && !(chx.contains("("))) {
                        System.out.println("Erro: " + ch + " na posição " + i);
                        break;
                    }
                    }else {
                    System.out.println("Erro: " + ch + " na posição " + i);
                }
            }
        }
        if(!(pilha.estaVazia())) {
            System.out.println("Erro!");
        }
    }
}

//a{b(c]d}e
//a{b(c)d}e
//c[d]
//a{b[c]d}e
//a{b(c]d}e
//a[b{c}d]e}
//a{b(c)
