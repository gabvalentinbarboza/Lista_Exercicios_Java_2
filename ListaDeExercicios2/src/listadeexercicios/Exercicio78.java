package listadeexercicios;

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        System.out.println("D�gitos separados do n�mero " + numero + ":");
        for (char digito : String.valueOf(numero).toCharArray()) {
            System.out.println(digito);
        }

        valor.close();
    }
}
