package listadeexercicios;

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int[] numeros = new int[5];
        int somaPares = 0;
        int contPares = 0;
        int somaImpares = 0;
        int contImpares = 0;

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contPares++;
            } else {
                somaImpares += numeros[i];
                contImpares++;
            }
        }

        double mediaPares = contPares > 0 ? somaPares / (double) contPares : 0;
        double mediaImpares = contImpares > 0 ? somaImpares / (double) contImpares : 0;

        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Média dos números ímpares: " + mediaImpares);

        valor.close();
    }
}
