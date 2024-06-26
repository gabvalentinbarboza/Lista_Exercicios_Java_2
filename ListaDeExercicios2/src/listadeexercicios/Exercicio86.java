package listadeexercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = valor.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        valor.close();
    }
}
