package listadeexercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero:");
        int num1 = valor.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int num2 = valor.nextInt();

        if (num1 > num2) {
            System.out.println("O maior n�mero �: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior n�mero �: " + num2);
        } else {
            System.out.println("Os n�meros s�o iguais.");
        }

        valor.close();
    }
}
