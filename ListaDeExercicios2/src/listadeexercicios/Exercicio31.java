package listadeexercicios;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor do sal�rio-m�nimo:");
        double salarioMinimo = valor.nextDouble();

        System.out.println("Digite o sal�rio do funcion�rio:");
        double salarioFuncionario = valor.nextDouble();

        double salariosMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("O funcion�rio recebe " + salariosMinimos + " sal�rios m�nimos.");

        valor.close();
    }
}
