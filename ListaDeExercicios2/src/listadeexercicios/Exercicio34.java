package listadeexercicios;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa:");
        int idade = valor.nextInt();

        if (idade >= 18 && idade <= 70) {
            System.out.println("Voto obrigat�rio.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("Voto facultativo.");
        } else {
            System.out.println("N�o pode votar.");
        }

        valor.close();
    }
}
