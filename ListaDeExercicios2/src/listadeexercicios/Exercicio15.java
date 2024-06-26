package listadeexercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        // Criando um objeto Scanner chamado valor para ler a entrada do usu�rio
        Scanner valor = new Scanner(System.in);

        // Solicitando ao usu�rio para inserir o sal�rio atual
        System.out.println("Digite o sal�rio atual:");
        double salarioAtual = valor.nextDouble();

        // Calculando o aumento de 15%
        double aumento = salarioAtual * 0.15;

        // Calculando o novo sal�rio
        double novoSalario = salarioAtual + aumento;

        // Exibindo o novo sal�rio
        System.out.println("O novo sal�rio �: " + novoSalario);

        // Fechando o objeto Scanner
        valor.close();
    }
}
