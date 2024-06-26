package listadeexercicios;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor do salário-mínimo:");
        double salarioMinimo = valor.nextDouble();

        System.out.println("Digite o salário do funcionário:");
        double salarioFuncionario = valor.nextDouble();

        double salariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionário recebe " + salariosMinimos + " salários mínimos.");

        valor.close();
    }
}
