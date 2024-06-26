package listadeexercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = valor.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = valor.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("O número " + num1 + " é múltiplo de " + num2);
        } else {
            System.out.println("O número " + num1 + " não é múltiplo de " + num2);
        }

        valor.close();
    }
}
