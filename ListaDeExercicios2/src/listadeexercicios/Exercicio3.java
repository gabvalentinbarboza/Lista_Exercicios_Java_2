package listadeexercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a base do tri�ngulo:");
        double base = valor.nextDouble();

        System.out.println("Digite a altura do tri�ngulo:");
        double altura = valor.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A �rea do tri�ngulo �: " + area);
        
        valor.close();
    }
}
