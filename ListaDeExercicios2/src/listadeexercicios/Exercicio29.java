package listadeexercicios;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = valor.next();

        System.out.println("Digite a nota do aluno:");
        double nota = valor.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado.");
        } else {
            System.out.println(nome + " está em recuperação.");
        }

        valor.close();
    }
}
