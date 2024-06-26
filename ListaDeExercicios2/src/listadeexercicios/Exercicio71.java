package listadeexercicios;

import java.util.Scanner;

public class Exercicio71 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = valor.nextInt();

        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        valor.close();
    }
}
