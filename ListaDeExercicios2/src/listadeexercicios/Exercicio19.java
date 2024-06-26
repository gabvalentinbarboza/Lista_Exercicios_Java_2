package listadeexercicios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double nota1 = valor.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = valor.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = valor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }

        valor.close();
    }
}
