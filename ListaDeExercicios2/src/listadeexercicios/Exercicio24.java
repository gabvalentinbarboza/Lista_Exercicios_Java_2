package listadeexercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o primeiro n�mero:");
        int num1 = valor.nextInt();

        System.out.println("Digite o segundo n�mero:");
        int num2 = valor.nextInt();

        System.out.println("Digite o terceiro n�mero:");
        int num3 = valor.nextInt();

        int[] numeros = {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("Os n�meros em ordem crescente s�o:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        valor.close();
    }
}
