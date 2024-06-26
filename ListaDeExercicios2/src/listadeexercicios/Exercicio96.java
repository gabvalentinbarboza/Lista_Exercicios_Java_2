package listadeexercicios;

import java.util.Scanner;

public class Exercicio96 {
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
        
        // Exibindo a matriz
        System.out.println("Matriz 3x3 informada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nova linha para próxima linha da matriz
        }
        
        valor.close();
    }
}
