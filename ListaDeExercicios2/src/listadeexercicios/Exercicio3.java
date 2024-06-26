package listadeexercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        double base = valor.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        double altura = valor.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
        
        valor.close();
    }
}
