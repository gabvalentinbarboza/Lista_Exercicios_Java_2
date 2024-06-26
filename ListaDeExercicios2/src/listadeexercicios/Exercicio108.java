package listadeexercicios;

import java.util.Scanner;

public class Exercicio108 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        lerMatriz(matriz, valor);
        
        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Maior valor da linha " + (i + 1) + ": " + maior);
        }
        
        valor.close();
    }
    
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
