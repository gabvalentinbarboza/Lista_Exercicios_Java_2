package listadeexercicios;

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[7];
        double soma = 0;

        System.out.println("Digite 7 n�meros inteiros:");
        for (int i = 0; i < 7; i++) {
            numeros[i] = valor.nextInt();
            soma += numeros[i];
        }

        double media = soma / 7;
        System.out.println("M�dia dos n�meros digitados: " + media);

        valor.close();
    }
}
