package listadeexercicios;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        int somaPares = 0;
        int contador = 2;

        do {
            somaPares += contador;
            contador += 2;
        } while (contador <= numero);

        System.out.println("Soma dos n�meros pares at� " + numero + ": " + somaPares);

        valor.close();
    }
}
