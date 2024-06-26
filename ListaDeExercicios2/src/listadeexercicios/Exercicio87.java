package listadeexercicios;

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPositivos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] > 0) {
                contPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contPositivos);

        valor.close();
    }
}
