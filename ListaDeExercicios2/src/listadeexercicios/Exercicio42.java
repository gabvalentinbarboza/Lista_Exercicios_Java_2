package listadeexercicios;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int contador = 2;
        boolean ehPrimo = true;

        while (contador <= numero / 2) {
            if (numero % contador == 0) {
                ehPrimo = false;
                break;
            }
            contador++;
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        valor.close();
    }
}
