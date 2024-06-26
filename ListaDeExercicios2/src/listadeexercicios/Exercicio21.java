package listadeexercicios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a quantidade de pessoas no grupo:");
        int quantidade = valor.nextInt();

        int menores = 0;
        int maiores = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = valor.nextInt();

            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);

        valor.close();
    }
}
