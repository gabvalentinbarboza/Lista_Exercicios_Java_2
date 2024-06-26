package listadeexercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = valor.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = valor.nextDouble();

        System.out.println("Digite o terceiro número:");
        double num3 = valor.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média aritmética dos três números é: " + media);

        valor.close();
    }
}
