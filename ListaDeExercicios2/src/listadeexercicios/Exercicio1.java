package listadeexercicios;

import java.util.Scanner; // classe da biblioteca do Java para entrar com dados no sistema

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado

		// defini��o de vari�vel do tipo inteiro
		// defini��o de vari�vel do tipo string

		System.out.println("Exibindo os valores dos atributos");

		System.out.println("Entre com o 1� n�mero: ");
		int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int

		System.out.println("Entre com o 2� n�mero: ");
		int numero2 = valor.nextInt();// usamos nextInt() para atributos do tipo int

		int soma = numero1 + numero2;
		System.out.println("A soma dos numeros � " + soma);
		int multi = numero1 * numero2;
		System.out.println("A multiplica��o dos numeros � " + multi);
		int sub = numero1 - numero2;
		System.out.println("A subtra��o dos numeros � " + sub);
		int div = numero1 / numero2;
		System.out.println("A divis�o dos numeros � " + div);

	}

}
