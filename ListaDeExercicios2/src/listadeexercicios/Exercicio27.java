package listadeexercicios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a idade da pessoa:");
        int idade = valor.nextInt();

        System.out.println("Digite o sexo da pessoa (M ou F):");
        String sexo = valor.next();

        if (sexo.equalsIgnoreCase("M") && idade >= 65) {
            System.out.println("Pode se aposentar.");
        } else if (sexo.equalsIgnoreCase("F") && idade >= 60) {
            System.out.println("Pode se aposentar.");
        } else {
            System.out.println("Não pode se aposentar ainda.");
        }

        valor.close();
    }
}
