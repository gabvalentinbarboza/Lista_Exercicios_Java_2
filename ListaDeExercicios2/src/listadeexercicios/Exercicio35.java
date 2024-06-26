package listadeexercicios;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = valor.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = valor.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = valor.nextInt();

        double media = (num1 + num2 + num3) / 3.0;
        System.out.println("Média aritmética: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        valor.close();
    }
}
