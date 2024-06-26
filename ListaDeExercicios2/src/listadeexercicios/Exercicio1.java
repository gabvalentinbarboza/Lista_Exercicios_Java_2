package listadeexercicios;

import java.util.Scanner; // classe da biblioteca do Java para entrar com dados no sistema

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado

		// definição de variável do tipo inteiro
		// definição de variável do tipo string

		System.out.println("Exibindo os valores dos atributos");

		System.out.println("Entre com o 1º número: ");
		int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int

		System.out.println("Entre com o 2º número: ");
		int numero2 = valor.nextInt();// usamos nextInt() para atributos do tipo int

		int soma = numero1 + numero2;
		System.out.println("A soma dos numeros é " + soma);
		int multi = numero1 * numero2;
		System.out.println("A multiplicação dos numeros é " + multi);
		int sub = numero1 - numero2;
		System.out.println("A subtração dos numeros é " + sub);
		int div = numero1 / numero2;
		System.out.println("A divisão dos numeros é " + div);

	}

}
