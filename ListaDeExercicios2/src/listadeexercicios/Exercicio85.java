package listadeexercicios;

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        valor.close();
    }
}
