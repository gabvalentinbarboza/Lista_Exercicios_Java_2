package listadeexercicios;

import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int somaPares = 0;

        for (int i = 2; i <= numero; i += 2) {
            somaPares += i;
        }

        System.out.println("Soma dos números pares até " + numero + ": " + somaPares);

        valor.close();
    }
}
