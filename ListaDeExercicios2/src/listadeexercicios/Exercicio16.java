package listadeexercicios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero:");
        int numero = valor.nextInt();

        if (numero > 0) {
            System.out.println("O n�mero � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero � negativo.");
        } else {
            System.out.println("O n�mero � zero.");
        }

        valor.close();
    }
}
