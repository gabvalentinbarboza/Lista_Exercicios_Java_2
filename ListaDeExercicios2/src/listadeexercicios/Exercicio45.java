package listadeexercicios;

public class Exercicio45 {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int resultado = 0;
        int contador = 0;

        System.out.print("Primeiros 20 números da sequência de Fibonacci: ");
        while (contador < 20) {
            System.out.print(resultado + " ");
            resultado = anterior + atual;
            anterior = atual;
            atual = resultado;
            contador++;
        }
    }
}
