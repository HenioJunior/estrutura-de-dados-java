import java.util.Scanner;

public class Tela {

    public static char menu() {
        String msg;
        System.out.println ("-----------------------------------------------");
        System.out.println ("=              Escolha uma opção              =");
        System.out.println ("-----------------------------------------------");
        System.out.println ("= 1. Inserir no Início                        =");
        System.out.println ("= 2. Inserir no Final                         =");
        System.out.println ("= 3. Localizar Pessoa                         =");
        System.out.println ("= 4. Excluir uma Pessoa                       =");
        System.out.println ("= 5. Imprimir Lista                           =");
        System.out.println ("= 6. Quantidade Pessoas                       =");
        System.out.println ("= 7. Sair do Programa                         =");
        System.out.println ("-----------------------------------------------");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }//-------------------------------------------------------------------------------------------------------------MENU

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ListaSimples lista = new ListaSimples();
        Pessoa p;
        char opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                    System.out.println("------------ Inserindo no Início --------------");
                    p = new Pessoa();
                    System.out.print("Nome: ");
                    p.setNome(ler.next());
                    System.out.println("Sexo: ");
                    p.setSexo(ler.next());
                    System.out.println("Idade: ");
                    p.setIdade(ler.nextInt());
                    lista.inserirPrimeiro(p);
                    break;

                case '2':
                    System.out.println("------------ Inserindo no Final --------------");
                    p = new Pessoa();
                    System.out.print("Nome: ");
                    p.setNome(ler.next());
                    System.out.println("Sexo: ");
                    p.setSexo(ler.next());
                    System.out.println("Idade: ");
                    p.setIdade(ler.nextInt());
                    lista.inserirUltimo(p);
                    break;

                case '3':
                    if(lista.eVazia()) {
                        System.out.println("A lista está vazia");
                    }
                    else {
                        System.out.print("Localizando pessoa\nDigite o nome: ");
                        String nome = ler.next();
                        if(lista.pesquisarNode(nome) == null) {
                            System.out.println("A pessoa procurada não está na lista!");
                        } else {
                            System.out.println("::::: ENCONTRADO :::::");
                            System.out.println(lista.pesquisarNode(nome));
                            System.out.println(":::::::::::::::::::::::");
                        }
                    }
                    break;

                case '4':
                    if(lista.eVazia()) {
                        System.out.println("A lista está vazia");
                    }
                    else {
                        System.out.print("Excluir uma pessoa\nDigite o nome: ");
                        String nome = ler.next();
                        if(lista.removerNode(nome)) {
                            System.out.println(nome + " foi removido com sucesso");
                        }
                        else {
                            System.out.println("Não foi possível remover o nome digitado.");
                        }
                    }
                    break;

                case '5':
                    System.out.println("--------------------------------------------------");
                    System.out.println("Lista: " + lista.imprimirLista());
                    System.out.println("--------------------------------------------------");
                    break;

                case '6':
                    System.out.println("A lista contém: " + lista.getQuantNode() + " pessoa.");
                    break;

                case '7':
                    System.out.println("Fim do programa.");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != '7');
        System.exit(0);

    }
}
