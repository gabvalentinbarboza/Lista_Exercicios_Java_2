package listadeexercicios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o sal�rio base do funcion�rio:");
        double salarioBase = valor.nextDouble();

        double comissao = salarioBase * 0.05;
        double salarioLiquido = salarioBase + comissao;

        System.out.println("O sal�rio l�quido do funcion�rio �: " + salarioLiquido);

        valor.close();
    }
}
