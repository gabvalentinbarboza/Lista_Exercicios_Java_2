package listadeexercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        Integer[] numeros = new Integer[5];
        
        System.out.println("Digite 5 números inteiros:");
        
        for (int i = 0; i < 5; i++) {
            numeros[i] = valor.nextInt();
        }
        
        Arrays.sort(numeros, Collections.reverseOrder());
        
        System.out.println("Números em ordem decrescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
        
        valor.close();
    }
}
