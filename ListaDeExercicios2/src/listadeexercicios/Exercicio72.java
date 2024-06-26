package listadeexercicios;

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        boolean ehPrimo = true;
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        valor.close();
    }
}
