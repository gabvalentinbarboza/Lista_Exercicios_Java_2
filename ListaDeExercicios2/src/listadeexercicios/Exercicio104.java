package listadeexercicios;

import java.util.Scanner;

public class Exercicio104 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Digite os elementos da matriz 3x3:");
        lerMatriz(matriz, valor);
        
        boolean simetrica = true;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) {
                break;
            }
        }
        
        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
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
