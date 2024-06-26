package listadeexercicios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o nome do mês:");
        String mes = valor.next();

        switch (mes.toLowerCase()) {
            case "janeiro":
            case "março":
            case "maio":
            case "julho":
            case "agosto":
            case "outubro":
            case "dezembro":
                System.out.println("O mês de " + mes + " tem 31 dias.");
                break;
            case "abril":
            case "junho":
            case "setembro":
            case "novembro":
                System.out.println("O mês de " + mes + " tem 30 dias.");
                break;
            case "fevereiro":
                System.out.println("O mês de fevereiro tem 28 ou 29 dias.");
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }

        valor.close();
    }
}
