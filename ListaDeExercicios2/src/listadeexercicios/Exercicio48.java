package listadeexercicios;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        System.out.println("Dígitos separados do número " + numero + ":");
        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        }

        valor.close();
    }
}
