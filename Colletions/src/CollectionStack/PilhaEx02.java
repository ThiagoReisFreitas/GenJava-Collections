package CollectionStack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PilhaEx02 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int op=1;
        while(op!=0){
            System.out.println("***********************************************");
            System.out.println("                                               ");
            System.out.println("         1 - Adicionar Livro na pilha          ");
            System.out.println("         2 - Listar todos os Livros            ");
            System.out.println("         3 - Retirar Livro da pilha            ");
            System.out.println("         0 - Sair                              ");
            System.out.println("                                               ");
            System.out.println("***********************************************");
            System.out.print("Entre com a opção desejada: ");
            op = leia.nextInt();
            leia.nextLine();

            switch(op){
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = leia.nextLine();
                    pilha.push(nome);
                    leiaLista(pilha);
                    System.out.printf("O Livro %s foi adcionado!\n", nome);
                    break;
                case 2:
                    if(pilha.isEmpty()){
                        System.out.println("A Pilha está vazia!");
                        break;
                    }
                    System.out.println("Pilha de Livros: ");
                    leiaLista(pilha);
                    break;
                case 3:
                    if(pilha.isEmpty()){
                        System.out.println("A Pilha está vazia!");
                        break;
                    }
                    System.out.println("Fila: ");
                    String excluido = pilha.pop();
                    leiaLista(pilha);
                    System.out.printf("O Livro %s foi retirado da pilha!\n", excluido);
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente");
                    break;
            }
        }
    }
    public static void leiaLista(Stack<String> lista){
        Iterator<String> ilista = lista.iterator();
        while(ilista.hasNext()){
            System.out.println(ilista.next());
        }
    }
}
