package listadeexercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero:");
        int num1 = valor.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int num2 = valor.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("O n�mero " + num1 + " � m�ltiplo de " + num2);
        } else {
            System.out.println("O n�mero " + num1 + " n�o � m�ltiplo de " + num2);
        }

        valor.close();
    }
}
