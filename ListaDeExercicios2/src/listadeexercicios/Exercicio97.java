package listadeexercicios;

import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        int[][] matriz = new int[2][2];
        
        System.out.println("Digite os elementos da matriz 2x2:");
        
        // Lendo os elementos da matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = valor.nextInt();//Lembrar das aulas de math do Gurgel
            }
        }
        
        // Calculando a soma dos elementos da matriz
        int soma = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma += matriz[i][j];
            }
        }
        
        // Exibindo a soma dos elementos da matriz(não esquece a importancia disso aqui)
        System.out.println("Soma dos elementos da matriz: " + soma);
        
        valor.close();
    }
}
