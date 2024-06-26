package listadeexercicios;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        System.out.println("Dígitos separados do número " + numero + ":");
        for (char digito : String.valueOf(numero).toCharArray()) {
            System.out.println(digito);
        }

        valor.close();
    }
}
