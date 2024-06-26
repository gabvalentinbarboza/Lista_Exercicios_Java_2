package listadeexercicios;

import java.util.Scanner;

public class Exercicio70 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        valor.close();
    }
}
