package listadeexercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o número de faltas do aluno:");
        int faltas = valor.nextInt();

        if (faltas > 15) {
            System.out.println("Aluno reprovado por faltas.");
        } else {
            System.out.println("Aluno aprovado.");
        }

        valor.close();
    }
}
