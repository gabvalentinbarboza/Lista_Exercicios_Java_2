package listadeexercicios;

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
        }

        System.out.println("Números digitados na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        valor.close();
    }
}
