package listadeexercicios;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int codigo = valor.nextInt();

        System.out.println("Digite a quantidade comprada:");
        int quantidade = valor.nextInt();

        double precoUnitario = 0.0;

        // Definindo o preço unitário com base no código do produto
        switch (codigo) {
            case 1:
                precoUnitario = 10.0;
                break;
            case 2:
                precoUnitario = 15.0;
                break;
            case 3:
                precoUnitario = 20.0;
                break;
            default:
                System.out.println("Código de produto inválido.");
                valor.close();
                return;
        }

        double valorTotal = precoUnitario * quantidade;
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        valor.close();
    }
}
