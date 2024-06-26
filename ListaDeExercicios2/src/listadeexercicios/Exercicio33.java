package listadeexercicios;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = valor.next();

        System.out.println("Digite o turno do aluno (M para Matutino ou V para Vespertino):");
        String turno = valor.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia, " + nome + "!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde, " + nome + "!");
        } else {
            System.out.println("Turno inválido.");
        }

        valor.close();
    }
}
