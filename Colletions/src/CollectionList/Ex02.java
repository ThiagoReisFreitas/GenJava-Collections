package CollectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
        System.out.print("Digite o número que você deseja encontrar: ");
        int encontrar = leia.nextInt();
        int posicao = numeros.indexOf(encontrar);

        if (posicao != -1) {
            System.out.printf("O número %d está localizado na posição: %d", encontrar, posicao);
        } else {
            System.out.printf("O número %d não foi encontrado!", encontrar);
        }

    }
}