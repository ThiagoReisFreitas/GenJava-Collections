package CollectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaEx01 {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();
        int op=1;
        String nome;

        while (op != 0) {
            System.out.println("*********************************************");
            System.out.println("                                             ");
            System.out.println("        1 - Adicionar Cliente na Fila        ");
            System.out.println("        2 - Listar todos os Clientes         ");
            System.out.println("        3 - Retirar Clientes da Fila         ");
            System.out.println("        0 - Sair                             ");
            System.out.println("                                             ");
            System.out.println("*********************************************");
            System.out.print("Entre com a opção desejada: ");
            op = leia.nextInt();
            leia.nextLine();

            switch(op){
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = leia.nextLine();
                    fila.add(nome);
                    System.out.printf("Cliente %s foi adcionado!\n", nome);
                    break;
                case 2:
                    if(fila.isEmpty()){
                        System.out.println("A Fila está vazia!");
                        break;
                    }
                    System.out.println("Lista de Clientes na Fila: ");
                    leiaFila(fila);
                    break;
                case 3:
                    if(fila.isEmpty()){
                        System.out.println("A Fila está vazia!");
                        break;
                    }
                    System.out.println("Fila: ");
                    String excluido = fila.remove();
                    leiaFila(fila);
                    System.out.printf("O cliente %s foi Chamado!\n", excluido);
                    break;
                default:
                    System.out.println("Opção invalida! Tente novamente");
                    break;
            }
        }
    }
    public static void leiaFila(Queue<String> fila){
        Iterator<String> lista = fila.iterator();
        while(lista.hasNext()){
            System.out.println(lista.next());
        }
    }
}
