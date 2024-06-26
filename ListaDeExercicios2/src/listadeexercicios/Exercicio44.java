package listadeexercicios;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contador = 1;
        int somaIdades = 0;

        while (contador <= 5) {
            System.out.println("Digite o nome da pessoa " + contador + ":");
            String nome = valor.next();

            System.out.println("Digite a idade da pessoa " + contador + ":");
            int idade = valor.nextInt();

            somaIdades += idade;
            contador++;
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.println("Média das idades das pessoas: " + mediaIdades);

        valor.close();
    }
}
