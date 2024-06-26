package listadeexercicios;

import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = valor.next();

            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = valor.nextInt();

            somaIdades += idade;
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.println("Média das idades das pessoas: " + mediaIdades);

        valor.close();
    }
}
