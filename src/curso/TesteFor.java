package curso;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o limite: ");
		int valor1 = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < valor1; i++) {

			System.out.println("Digite um número: ");
			int valor2 = sc.nextInt();
			soma = soma + valor2;

		}
		System.out.println("A soma dos números digitados foi: " + soma);
	}

}
