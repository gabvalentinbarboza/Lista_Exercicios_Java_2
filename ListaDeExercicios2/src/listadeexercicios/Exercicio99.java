package listadeexercicios;

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] somaMatrizes = new int[2][2];
        
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(matriz1, valor);
        
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(matriz2, valor);
        
        // Calculando a soma das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Exibindo a soma das matrizes
        System.out.println("Matriz resultante da soma:");
        exibirMatriz(somaMatrizes);
        
        valor.close();
    }
    
    // Método para ler os elementos de uma matriz
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Método para exibir uma matriz
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha para próxima linha da matriz
        }
    }
}
