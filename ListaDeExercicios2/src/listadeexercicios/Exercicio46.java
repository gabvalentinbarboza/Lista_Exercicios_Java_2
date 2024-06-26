package listadeexercicios;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int somaPares = 0;
        int contador = 2;

        while (contador <= numero) {
            somaPares += contador;
            contador += 2;
        }

        System.out.println("Soma dos números pares até " + numero + ": " + somaPares);

        valor.close();
    }
}
