package listadeexercicios;

import java.util.Scanner;

public class Exercicio98 {
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
        
        // Calculando a soma dos elementos da diagonal principal
        int somaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonal += matriz[i][i];
        }
        
        // Exibindo a soma dos elementos da diagonal principal
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonal);
        
        valor.close();
    }
}
