package listadeexercicios;

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[] numeros = new int[10];
        int count = 0;
        
        System.out.println("Digite 10 números inteiros:");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = valor.nextInt();
            
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                count++;
            }
        }
        
        System.out.println("Quantidade de números no intervalo de 10 a 50: " + count);
        
        valor.close();
    }
}
