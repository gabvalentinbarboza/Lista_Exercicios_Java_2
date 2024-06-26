package listadeexercicios;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        System.out.println("Dígitos separados do número " + numero + ":");
        do {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        } while (numero > 0);

        valor.close();
    }
}
