package listadeexercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o sal�rio do funcion�rio:");
        double salario = valor.nextDouble();

        double bonus;
        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }

        System.out.println("O b�nus do funcion�rio �: " + bonus);

        valor.close();
    }
}
