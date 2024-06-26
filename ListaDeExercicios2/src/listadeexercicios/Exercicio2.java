package listadeexercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o raio do círculo:");
        double raio = valor.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.println("A área do círculo é: " + area);
        System.out.println("O perímetro do círculo é: " + perimetro);
        
        valor.close();
    }
}
