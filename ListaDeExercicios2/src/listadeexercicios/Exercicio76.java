package listadeexercicios;

import java.util.Scanner;

public class Exercicio76 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        int somaPares = 0;

        for (int i = 2; i <= numero; i += 2) {
            somaPares += i;
        }

        System.out.println("Soma dos n�meros pares at� " + numero + ": " + somaPares);

        valor.close();
    }
}
