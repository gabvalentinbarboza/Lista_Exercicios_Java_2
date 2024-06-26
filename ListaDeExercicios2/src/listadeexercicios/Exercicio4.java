package listadeexercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a primeira nota (peso 2):");
        double nota1 = valor.nextDouble();

        System.out.println("Digite a segunda nota (peso 3):");
        double nota2 = valor.nextDouble();

        System.out.println("Digite a terceira nota (peso 5):");
        double nota3 = valor.nextDouble();

        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        System.out.println("A média ponderada das notas é: " + mediaPonderada);

        valor.close();
    }
}
