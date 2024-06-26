package listadeexercicios;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo:");
        int numero = valor.nextInt();

        int divisor = 1;
        do {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        } while (divisor <= numero);

        valor.close();
    }
}
