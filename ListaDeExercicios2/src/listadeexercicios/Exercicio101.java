package listadeexercicios;

import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        
        System.out.println("Digite os elementos da matriz 4x4:");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = valor.nextInt();
            }
        }
        
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }
        }
        double media = (double) soma / (4 * 4);
        
        System.out.println("Média aritmética dos elementos da matriz: " + media);
        
        valor.close();
    }
}
