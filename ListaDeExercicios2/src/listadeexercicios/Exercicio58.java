package listadeexercicios;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro:");
        int numero = valor.nextInt();

        int anterior = 0;
        int atual = 1;
        int resultado = 0;

        System.out.print("Sequ�ncia de Fibonacci at� " + numero + ": ");
        do {
            System.out.print(resultado + " ");
            resultado = anterior + atual;
            anterior = atual;
            atual = resultado;
        } while (resultado <= numero);

        valor.close();
    }
}
