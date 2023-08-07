package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        for(int i=0;i<10;i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            int numero = leia.nextInt();
            numeros.add(numero);
        }

        Iterator<Integer> inumeros = numeros.iterator();
        System.out.println("Lista dos dados do Set: ");
        while(inumeros.hasNext()){
            System.out.println(inumeros.next());
        }
    }
}
