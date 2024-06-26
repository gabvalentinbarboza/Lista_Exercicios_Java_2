package listadeexercicios;

import java.util.Scanner;

public class Exercicio106 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(matriz1, valor);
        
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(matriz2, valor);
        
        boolean saoIguais = true;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    saoIguais = false;
                    break;
                }
            }
            if (!saoIguais) {
                break;
            }
        }
        
        if (saoIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }
        
        valor.close();
    }
    
    public static void lerMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
}
