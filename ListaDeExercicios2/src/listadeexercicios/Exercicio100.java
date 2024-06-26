package listadeexercicios;

import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        
        // Lendo os elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor.nextInt();
            }
        }
        
        // Encontra o maior valor na matriz
        int maior = matriz[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        
        // maior valor 
        System.out.println("Maior valor presente na matriz: " + maior);
        
        valor.close();
    }
}

