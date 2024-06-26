package listadeexercicios;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        System.out.println("D�gitos separados do n�mero " + numero + ":");
        do {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        } while (numero > 0);

        valor.close();
    }
}
