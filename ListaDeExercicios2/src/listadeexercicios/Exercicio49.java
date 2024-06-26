package listadeexercicios;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int numero = valor.nextInt();

        int fatorial = 1;
        int contador = 1;

        while (contador <= numero) {
            fatorial *= contador;
            contador++;
        }

        System.out.println("O Fatorial de " + numero + "é: " + fatorial);

        valor.close();
    }
}
