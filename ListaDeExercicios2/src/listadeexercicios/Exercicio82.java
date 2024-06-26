package listadeexercicios;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = valor.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma dos números digitados: " + soma);

        valor.close();
    }
}
