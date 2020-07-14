package curso;

import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor: ");
		int valor = sc.nextInt();
		int soma = 0;

		while (valor != 0) {
			soma = soma + valor;
			System.out.println("Soma: "+ soma);
			System.out.println("Digite o valor: ");
			valor = sc.nextInt();
			

		}

	}

}
