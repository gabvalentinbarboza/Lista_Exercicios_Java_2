package listadeexercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero:");
        double num1 = valor.nextDouble();

        System.out.println("Digite o segundo n�mero:");
        double num2 = valor.nextDouble();

        System.out.println("Digite o terceiro n�mero:");
        double num3 = valor.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A m�dia aritm�tica dos tr�s n�meros �: " + media);

        valor.close();
    }
}
