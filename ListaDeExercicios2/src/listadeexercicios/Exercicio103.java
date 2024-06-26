package listadeexercicios;

import java.util.Scanner;

public class Exercicio103 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        lerMatriz(matriz, valor);
        
        int menor = matriz[0][0];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("Menor valor da matriz: " + menor);
        
        valor.close();
    }
    
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
