package listadeexercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = valor.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Adulto");
        } else if (idade >= 65) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade inválida");
        }

        valor.close();
    }
}
