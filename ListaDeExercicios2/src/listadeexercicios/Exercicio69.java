package listadeexercicios;

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "� n�mero:");
            int numero = valor.nextInt();
            soma += numero;
        }

        double media = soma / 5.0;
        System.out.println("M�dia dos n�meros digitados: " + media);

        valor.close();
    }
}
