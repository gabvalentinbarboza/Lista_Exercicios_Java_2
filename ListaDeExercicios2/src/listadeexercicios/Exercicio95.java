package listadeexercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio95 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        
        String[] nomes = new String[5];
        
        System.out.println("Digite 5 nomes:");
        
        for (int i = 0; i < 5; i++) {
            nomes[i] = valor.nextLine();
        }
        
        Arrays.sort(nomes);
        
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        valor.close();
    }
}
