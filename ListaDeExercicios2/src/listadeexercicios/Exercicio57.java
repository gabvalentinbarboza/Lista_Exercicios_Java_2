package listadeexercicios;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int contador = 2;
        boolean ehPrimo = true;

        do {
            if (numero % contador == 0) {
                ehPrimo = false;
                break;
            }
            contador++;
        } while (contador <= numero / 2);

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        valor.close();
    }
}
