package listadeexercicios;

import java.util.Scanner;

public class Exercicio109 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        lerMatriz(matriz, valor);
        
        boolean identidade = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
            if (!identidade) {
                break;
            }
        }
        
        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
        
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
