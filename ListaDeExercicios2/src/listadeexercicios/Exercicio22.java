package listadeexercicios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário:");
        double salario = valor.nextDouble();

        double bonus;
        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }

        System.out.println("O bônus do funcionário é: " + bonus);

        valor.close();
    }
}
