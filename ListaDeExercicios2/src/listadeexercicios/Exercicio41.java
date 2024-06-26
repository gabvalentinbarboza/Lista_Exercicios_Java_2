package listadeexercicios;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = valor.nextInt();

        int divisor = 1;
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }

        valor.close();
    }
}

