package listadeexercicios;

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];
        int contPares = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] % 2 == 0) {
                contPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPares);

        valor.close();
    }
}
