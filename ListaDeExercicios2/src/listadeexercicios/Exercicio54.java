package listadeexercicios;

import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contador = 0;
        int soma = 0;
        int numero;

        do {
            System.out.println("Digite um n�mero inteiro:");
            numero = valor.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = soma / 5.0;
        System.out.println("M�dia dos n�meros digitados: " + media);

        valor.close();
    }
}
