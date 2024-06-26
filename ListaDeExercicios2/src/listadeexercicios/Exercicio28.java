package listadeexercicios;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa (em kg):");
        double peso = valor.nextDouble();

        System.out.println("Digite a altura da pessoa (em metros):");
        double altura = valor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC calculado: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        valor.close();
    }
}
