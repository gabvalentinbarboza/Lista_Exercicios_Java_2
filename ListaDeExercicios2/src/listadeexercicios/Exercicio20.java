package listadeexercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O n�mero " + numero + " � par.");
        } else {
            System.out.println("O n�mero " + numero + " � �mpar.");
        }

        valor.close();
    }
}
