package listadeexercicios;

import java.util.Scanner;

public class Exercicio107 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        lerMatriz(matriz, valor);
        
        int produtoDiagonalSecundaria = 1;
        
        for (int i = 0; i < 3; i++) {
            produtoDiagonalSecundaria *= matriz[i][2 - i];
        }
        
        System.out.println("Produto dos elementos da diagonal secundária: " + produtoDiagonalSecundaria);
        
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
