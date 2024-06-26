package listadeexercicios;

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
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
            System.out.println(numero + " � um n�mero primo.");
        } else {
            System.out.println(numero + " n�o � um n�mero primo.");
        }

        valor.close();
    }
}
