package listadeexercicios;

import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[] numeros = new int[7];
        
        System.out.println("Digite 7 números inteiros:");
        
        for (int i = 0; i < 7; i++) {
            numeros[i] = valor.nextInt();
        }
        
        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        
        valor.close();
    }
}
