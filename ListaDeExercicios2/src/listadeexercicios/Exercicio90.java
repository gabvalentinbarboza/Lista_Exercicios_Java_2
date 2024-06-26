package listadeexercicios;

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean encontrouZero = false;

        System.out.println("Digite 5 n�meros inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] == 0) {
                encontrouZero = true;
            }
        }

        if (encontrouZero) {
            System.out.println("Foi encontrado pelo menos um n�mero igual a zero.");
        } else {
            System.out.println("Nenhum n�mero igual a zero foi encontrado.");
        }

        valor.close();
    }
}
