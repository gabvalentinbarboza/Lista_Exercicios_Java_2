package listadeexercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero:");
        int primeiroNumero = valor.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int segundoNumero = valor.nextInt();

        System.out.println("Antes da troca:");
        System.out.println("Primeiro n�mero: " + primeiroNumero);
        System.out.println("Segundo n�mero: " + segundoNumero);

        int temp = primeiroNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = temp;

        System.out.println("Depois da troca:");
        System.out.println("Primeiro n�mero: " + primeiroNumero);
        System.out.println("Segundo n�mero: " + segundoNumero);

        valor.close();
    }
}
