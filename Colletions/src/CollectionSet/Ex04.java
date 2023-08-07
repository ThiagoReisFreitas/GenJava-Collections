package CollectionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<Integer>(Arrays.asList(2,5,1,3,4,9,7,8,10,9));

        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = leia.nextInt();
        if(numeros.contains(numero)){
            System.out.printf("O número %d foi encontrado!", numero);
        }else{
            System.out.printf("O número %d não foi encontrado!", numero);
        }
    }
}
