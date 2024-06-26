package listadeexercicios;

import java.util.Scanner;

public class Exercicio102 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produtoMatrizes = new int[2][2];
        
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(matriz1, valor);
        
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(matriz2, valor);
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    produtoMatrizes[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        
        System.out.println("Matriz resultante do produto:");
        exibirMatriz(produtoMatrizes);
        
        valor.close();
    }
    
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
