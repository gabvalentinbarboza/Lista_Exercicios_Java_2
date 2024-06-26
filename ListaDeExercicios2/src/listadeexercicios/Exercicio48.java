package listadeexercicios;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        System.out.println("D�gitos separados do n�mero " + numero + ":");
        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero /= 10;
        }

        valor.close();
    }
}
