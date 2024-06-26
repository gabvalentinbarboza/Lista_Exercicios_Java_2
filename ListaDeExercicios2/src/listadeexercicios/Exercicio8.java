package listadeexercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = valor.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = valor.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);

        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        System.out.println("Depois da troca:");
        System.out.println("Primeiro número: " + primeiroNumero);
        System.out.println("Segundo número: " + segundoNumero);

        valor.close();
    }
}
