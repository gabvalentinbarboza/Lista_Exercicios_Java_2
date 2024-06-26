package listadeexercicios;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        while (contador < 5) {
            System.out.println("Digite um número inteiro:");
            int numero = valor.nextInt();
            soma += numero;
            contador++;
        }

        double media = soma / 5.0;
        System.out.println("Média dos números digitados: " + media);

        valor.close();
    }
}
