package listadeexercicios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o preço do produto:");
        double preco = valor.nextDouble();

        System.out.println("Digite a quantidade comprada:");
        int quantidade = valor.nextInt();

        double total = preco * quantidade;

        if (quantidade > 10) {
            total = total * 0.9;
        }

        System.out.println("O valor total a ser pago é: " + total);

        valor.close();
    }
}
