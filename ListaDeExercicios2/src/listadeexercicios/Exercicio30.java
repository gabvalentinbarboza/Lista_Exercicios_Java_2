package listadeexercicios;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a quantidade de maçãs compradas:");
        int quantidade = valor.nextInt();

        double precoUnitario;

        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidade * precoUnitario;
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        valor.close();
    }
}
