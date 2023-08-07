package CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();
        System.out.println("Digite 5 cores: ");

        for(int i=0;i<5;i++){
            System.out.printf("\n Digite a %d cor: ", i+1);
            String cor = leia.nextLine();
            cores.add(cor);
        }
        System.out.println("\nLista de todas as cores: ");
        for(String lcores:cores){
            System.out.println(lcores);
        }
        Collections.sort(cores);
        System.out.println("\nLista das cores ordenadas: ");
        for(String ordenadas:cores){
            System.out.println(ordenadas);
        }
    }
}
