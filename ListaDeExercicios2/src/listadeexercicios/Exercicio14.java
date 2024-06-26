package listadeexercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite a idade em anos:");
        int anos = valor.nextInt();

        System.out.println("Digite a idade em meses:");
        int meses = valor.nextInt();

        System.out.println("Digite a idade em dias:");
        int dias = valor.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você viveu " + totalDias + " dias.");

        valor.close();
    }
}
