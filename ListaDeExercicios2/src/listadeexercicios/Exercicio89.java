package listadeexercicios;

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[10];
        int contPositivos = 0;
        int contNegativos = 0;

        System.out.println("Digite 10 n�meros inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] > 0) {
                contPositivos++;
            } else if (numeros[i] < 0) {
                contNegativos++;
            }
        }

        System.out.println("Quantidade de n�meros positivos: " + contPositivos);
        System.out.println("Quantidade de n�meros negativos: " + contNegativos);

        valor.close();
    }
}
