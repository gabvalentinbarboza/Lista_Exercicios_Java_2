package listadeexercicios;

public class Exercicio77 {
    public static void main(String[] args) {
        System.out.println("N�meros �mpares de 50 a 1:");
        for (int i = 50; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
