package listadeexercicios;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int somaPositivos = 0;
        int somaNegativos = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            
            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else {
                somaNegativos += numeros[i];
            }
        }
        
        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);
        
        scanner.close();
    }
}
