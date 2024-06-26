package listadeexercicios;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int fatorial = 1;
        int contador = 1;

        do {
            fatorial *= contador;
            contador++;
        } while (contador <= numero);

        System.out.println("Fatorial de " + numero + ": " + fatorial);

        valor.close();
    }
}
