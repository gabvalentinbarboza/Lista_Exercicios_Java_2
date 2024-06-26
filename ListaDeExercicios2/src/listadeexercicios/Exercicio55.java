package listadeexercicios;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int contador = 1;
        do {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        } while (contador <= 10);

        valor.close();
    }
}
