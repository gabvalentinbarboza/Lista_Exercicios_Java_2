package listadeexercicios;

public class Exercicio75 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int resultado = 0;
        int contador = 0;

        System.out.print("Primeiros 20 n�meros da sequ�ncia de Fibonacci: ");
        for (int i = 1; i <= 20; i++) {
            System.out.print(resultado + " ");
            resultado = anterior + atual;
            anterior = atual;
            atual = resultado;
        }
    }
}
