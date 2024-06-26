package listadeexercicios;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
            String nome = valor.next();

            System.out.println("Digite a idade da pessoa " + (contador + 1) + ":");
            int idade = valor.nextInt();

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double mediaIdades = somaIdades / 5.0;
        System.out.println("Média das idades das pessoas: " + mediaIdades);

        valor.close();
    }
}
