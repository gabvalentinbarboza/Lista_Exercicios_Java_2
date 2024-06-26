package listadeexercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado

		System.out.println("Entre com a sua altura: ");
		float altura = valor.nextFloat();

		System.out.println("Entre com o seu peso: ");
		float peso = valor.nextFloat();

		float imc = peso / (altura * altura);

		if (imc >= 40) {
			System.out.println("Seu Imc é: " + imc + " Obesidade Grau III");

		} else if (imc >= 35) {
			System.out.println("Seu Imc é: " + imc + " Obesidade Grau II");

		} else if (imc >= 30) {
			System.out.println("Seu Imc é: " + imc + " Obesidade Grau I");

		} else if (imc >= 25) {
			System.out.println("Seu Imc é: " + imc + " Acima do Peso");

		} else if (imc >= 18.5) {
			System.out.println("Seu Imc é: " + imc + " Peso Normal");

		} else {
			System.out.println("Seu Imc é: " + imc + " Abaixo do peso");

		}
	}

}
//imc = peso / altura * altura
