package listadeexercicios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor do depósito mensal:");
        double depositoMensal = valor.nextDouble();

        System.out.println("Digite a taxa de juros mensal (em %):");
        double taxaJurosMensal = valor.nextDouble();
        taxaJurosMensal = taxaJurosMensal / 100;

        double montante = 0;

        for (int i = 0; i < 12; i++) {
            montante += depositoMensal;
            montante += montante * taxaJurosMensal;
        }

        System.out.println("O montante após 12 meses é: " + montante);

        valor.close();
    }
}
