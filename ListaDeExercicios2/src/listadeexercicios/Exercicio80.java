package listadeexercicios;

import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int somaIdades = 0;
        int contador = 0;

        String nome;
        do {
            System.out.println("Digite o nome da pessoa (ou 'fim' para encerrar):");
            nome = valor.next();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.println("Digite a idade da pessoa:");
                int idade = valor.nextInt();
                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double mediaIdades = somaIdades / (double) contador;
            System.out.println("Média das idades das pessoas: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        valor.close();
    }
}
