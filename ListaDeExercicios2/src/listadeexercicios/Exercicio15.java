package listadeexercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Criando um objeto Scanner chamado valor para ler a entrada do usuário
        Scanner valor = new Scanner(System.in);

        // Solicitando ao usuário para inserir o salário atual
        System.out.println("Digite o salário atual:");
        double salarioAtual = valor.nextDouble();

        // Calculando o aumento de 15%
        double aumento = salarioAtual * 0.15;

        // Calculando o novo salário
        double novoSalario = salarioAtual + aumento;

        // Exibindo o novo salário
        System.out.println("O novo salário é: " + novoSalario);

        // Fechando o objeto Scanner
        valor.close();
    }
}
