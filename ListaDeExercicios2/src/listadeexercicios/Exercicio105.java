package listadeexercicios;

import java.util.Scanner;

public class Exercicio105 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        lerMatriz(matriz, valor);
        
        int[] somaColunas = new int[4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }
        
        for (int j = 0; j < 4; j++) {
            System.out.println("Soma dos elementos da coluna " + (j + 1) + ": " + somaColunas[j]);
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
